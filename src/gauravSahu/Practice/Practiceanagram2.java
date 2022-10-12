package gauravSahu.Practice;

public class Practiceanagram2 {
	
	
	void isAnagram(String str1, String str2) {
		
		while(str1.length()>0){
			char ch = str1.charAt(0);
			str1 =  str1.replace(String.valueOf(ch), "");
			str2 =  str2.replace(String.valueOf(ch), "");
		}
		if(str1.length() == str2.length()) 
			System.out.println("Anagram String");
		else 
			System.out.println("Not an Anagram String");
		
	}
	public static void main(String[] args) {
		Practiceanagram2 p2 = new Practiceanagram2();
		String input1 = "abtcbt";
		String input2 = "bbtcat";
		p2.isAnagram(input1,input2);
	}

}
