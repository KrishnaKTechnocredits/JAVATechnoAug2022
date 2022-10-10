package nikitaPhase;
import java.util.Arrays;

public class Assignment_28 {
	void printCountAllVowels(String input) {
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		
		for(int index=0; index<input.length();index++) {
			char ch = input.charAt(index);
			switch(ch) {
			case 'a':
			case 'A':
				countA++;
				break;
			case 'e':
			case 'E':
				countE++;
				break;
			case 'i':
			case 'I':
				countI++;
				break;
			case 'o':
			case 'O':
				countO++;
				break;
			case 'u':
			case 'U':
				countU++;
				break;
		}
		}
		System.out.println("Vowel count in "+input+" : "+ " ");
		
		if(countA>0) {
			System.out.println("a -> " + countA);
		}
		if(countE>0) {
			System.out.println("e -> " + countE);
		}
		if(countI>0) {
			System.out.println("i -> " + countI);
		}
		if(countO>0) {
			System.out.println("o -> " + countO);
		}
		if(countU>0) {
			System.out.println("u -> " + countU);
		}
	}
	
	void printCountAllVowelsStringArr(String[] input) {
		for(int index=0; index<input.length; index++) {
			printCountAllVowels(input[index]);
		}
	}
	
	int getCountVowelsString(String name) {// to find no of vowels in a String
		int count = 0;
		for(int index=0; index<name.length(); index++) {
			char ch = name.charAt(index);
			switch(ch) {
				case 'a':
				case 'A':
					count++;
					break;
				case 'e':
				case 'E':
					count++;
					break;
				case 'i':
				case 'I':
					count++;
					break;
				case 'o':
				case 'O':
					count++;
					break;
				case 'u':
				case 'U':
					count++;
					break;
			}
		}
		return count;
	}
	
	char getFirstVowel(String input) {
		char firstVowel = ' ';
		boolean flag = false;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			switch(ch) {
			case 'a':
			case 'A':
				flag=true;//if it is vowel change the flag and break
				break;
			case 'e':
			case 'E':
				flag=true;
				break;
			case 'i':
			case 'I':
				flag=true;
				break;
			case 'o':
			case 'O':
				flag=true;
				break;
			case 'u':
			case 'U':
				flag=true;
				break;
			}
			
			if (flag==true) {
				firstVowel = ch;//if flag is changed then store character in the variable and stop the for loop
				break;
			}
		}
		return firstVowel;//return the vowel
	}
	
	public static void main(String[] args) {
		Assignment_28 ex1 = new Assignment_28();
		String input1 = "TechnOcredits";
		System.out.println("No. of vowels in "+input1+" = "+ex1.getCountVowelsString(input1));
		System.out.println("");
		
		String input2 = "technocredits";
		System.out.println("First vowels in the given string "+input2+" = "+ex1.getFirstVowel(input2));
		System.out.println("");
		
		ex1.printCountAllVowels("technocredits");
		System.out.println("");
		
		
		String[] input3 = {"technocredits", "tejas", "nikita"};
		System.out.println("Input : "+Arrays.toString(input3));
		ex1.printCountAllVowelsStringArr(input3);
	}

}