/*Assignment - 28 : 25th Sep'2022

Program 2 : [10 mins]
Return first vowel from given String.

input : technocredits
outout : e*/

package rashmiG.switchCaseAssignment28;

class FirstVowel{
	
	/*char getFirstVowelAlternative(String input){
		for(int index=0;index<input.length();index++){
			char ch = input.charAt(index);
			if(ch=='A' || ch=='a' || ch=='E' ||ch=='e' ||ch=='I' || ch=='i'||ch=='O'||ch=='o'||ch=='U' ||ch=='u'){
					return ch;
					
			}
		}
		return 'Z';
	}*/
	
	char getFirstVowelUsingSwitch(String input){
		for(int index=0;index<input.length();index++){
			char ch=input.charAt(index);
			switch(ch){
				case 'A':
				case 'a':
				case 'E':
				case 'e':
				case 'I':
				case 'i':
				case 'O':
				case 'o':
				case 'U':
				case 'u':
							return ch;
			}
		}
		
		
		return 'Z';
	}
	
	void printFirstVowel(String input){
		char ch=this.getFirstVowelUsingSwitch(input);
		if(ch!='Z')
			System.out.println("First vowel from given string "+input+" : "+ch);
		else
			System.out.println("No vowels present in the string "+input);
	}
	
	public static void main(String[] args){
		FirstVowel firstVowel = new FirstVowel();
		firstVowel.printFirstVowel("technocredits");
		firstVowel.printFirstVowel("678kl");
		firstVowel.printFirstVowel("6O{{yu");
	}
}
				
		