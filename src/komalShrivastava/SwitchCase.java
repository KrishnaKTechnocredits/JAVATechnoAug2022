//Assignment 28 - 25th Sep 2022

package komalShrivastava;

public class SwitchCase {

	//method to return first vowel or count of vowels in a given String using switch case.
	//Set firstVowelRequired as true to get first vowel in String
	//Set firstVowelRequired as false to get count of all vowels in String
	
	int getVowelCount(String word, boolean firstVowelRequired) {
		int vowelCount=0;
		for(int index=0; index<word.length(); index++) {
			char ch = word.charAt(index);
			switch(ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':	
				vowelCount++;	
			}
			if(firstVowelRequired && vowelCount>0) {
				System.out.println("First vowel in " + word + " : " + ch);
				break;
			}	
		}
		return vowelCount;
	}
	
	// method to get count of each vowels in a given String using switch case
	
	void getCountofEachVowel(String word) {
		int aCount = 0;
		int eCount = 0;
		int iCount = 0;
		int oCount = 0;
		int uCount = 0;
		for(int index=0; index<word.length(); index++) {
			char ch = word.charAt(index);
			switch(ch) {
				case 'a':
				case 'A':
					aCount++;
					break;
				case 'e':
				case 'E':
					eCount++;
					break;
				case 'i':
				case 'I':
					iCount++;
					break;
				case 'o':
				case 'O':
					oCount++;
					break;
				case 'u':
				case 'U':
					uCount++;	
					break;
			}
		}
		if(aCount > 0 || eCount > 0 || iCount > 0 || oCount>0 || uCount > 0)
			System.out.println("Vowels in " + word + " : ");
		if(aCount>0)
			System.out.println("a --> " + aCount);
		if(eCount>0)
			System.out.println("e --> " + eCount);
		if(iCount>0)
			System.out.println("i --> " + iCount);
		if(oCount>0)
			System.out.println("o --> " + oCount);
		if(uCount>0)
			System.out.println("u --> " + uCount);
	}
	
	//count of each vowels in a given String Array
	void printVowelCountOfStringArray(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			getCountofEachVowel(arr[index]);
			System.out.println("- - - - - - - - - - - - - - -");
		}
	}
	
	public static void main(String[] args) {
		SwitchCase switchCase = new SwitchCase();
		
		//to get count of vowels
		String input1 = "TechnOcredits";
		int totalVowelCount = switchCase.getVowelCount(input1, false);
		System.out.println("Vowel count in " + input1 + " : " + totalVowelCount);
		System.out.println("--------------------------------------------------------"); 
		
		//to get first vowel
		String input2 = "technocredits";
		switchCase.getVowelCount(input2, true);
		System.out.println("--------------------------------------------------------"); 

		//to get count of each vowel
		switchCase.getCountofEachVowel(input2);
		System.out.println("--------------------------------------------------------"); 
		
		//to get vowel count in string Array
		String []input3 = {"Unomotopiea", "Game Of Thrones", "HARRY POTTER"};
		switchCase.printVowelCountOfStringArray(input3);
	}
}