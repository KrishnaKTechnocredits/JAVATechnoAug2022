package amolMule.array2;

public class CountVowels {

	int getCountVowel(String s) {
		int cnt = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				cnt = cnt + 1;
			}
		}

		return cnt;
	}

	int[] getcntVowelArr(String[] arr4) {
		int[] outputCnt = new int[arr4.length];
		for (int i = 0; i < arr4.length; i++) {
			int n = getCountVowel(arr4[i]);
			outputCnt[i] = n;
		}

		return outputCnt;
	}
	
	 String getNameMaxLen(String[] str) {
		 String s=" ";
		 int max=0; //Amol  Ami AMOLM AM //
		 for(int i=0;i<str.length;i++) {
			 //int n=str[i].length();
			 if(max<str[i].length()) {
				 max=str[i].length();
				 s= str[i];
			 }
		 }
		 
		 return s;
	 }

	public static void main(String[] args) {

		CountVowels cw = new CountVowels();
		int c = cw.getCountVowel("Maulik");
		System.out.println("count of vowels from given word -->"+c);
		System.out.println();
		
		String[] input = { "Am", "Amit", "Shiva", "Ganeshou","ABC" };
		int[] output = cw.getcntVowelArr(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println("count vowels in given string-> "+output[i]+" And Given string is "+input[i]);
			
		}

		String s= cw.getNameMaxLen(input);
		System.out.println();
		System.out.println("Max length word from string array is --> "+s);
		
	
	
	
	}

}
