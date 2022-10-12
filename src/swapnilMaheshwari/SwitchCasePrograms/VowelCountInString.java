/*Program 4: [15 mins]
Print count of each vowels in a given String Array using switch case.

input : {"technocredits", "swati", "aashvi"}
output : vowel count in technocredits:
		 e -> 2
         o -> 1
		 i -> 1
		 vowel count in swati:
		 a -> 1
         i -> 1
		 vowel count in aashvi:
		 a -> 2
         i -> 1 
         */

package swapnilMaheshwari.SwitchCasePrograms;

public class VowelCountInString {
	void printVowelCount(String str) {
		int aCount=0;
		int eCount=0;
		int iCount=0;
		int oCount=0;
		int uCount=0;
			for(int i=0; i<str.length(); i++) {
				char ch=str.charAt(i);
				switch(ch) {
				case 'A':
				case 'a':
					aCount++;
					break;
				case 'E':
				case 'e':
					eCount++;
					break;
				case 'I':
				case 'i':
					iCount++;
					break;
				case 'O':
				case 'o':
					oCount++;
					break;
				case 'U':
				case 'u':
					uCount++;
					break;
				default:
					break;
		}
				
	}	
			if (aCount>0) 
				System.out.println('a' +"->"+aCount);
			if (eCount>0)
				System.out.println('e' +"->"+eCount);
			if (iCount>0)
				System.out.println('i' +"->"+iCount);
			if (oCount>0) 
				System.out.println('o' +"->"+oCount);
			if (uCount>0) 
				System.out.println('u' +"->"+uCount);
	}
	void printVowelCountInString(String[] arr){
		for (int i=0;i<arr.length;i++) {
			System.out.println("Vowel count in ->"+arr[i]);
			printVowelCount(arr[i]);
		}
		
	}
	
	public static void main(String[] args) {
	String input [] = {"technocredits", "swati", "aashvi"};
	new VowelCountInString().printVowelCountInString(input);
		
	}

}
