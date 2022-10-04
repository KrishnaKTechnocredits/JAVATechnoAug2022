//Assignment 23

package komalShrivastava;

public class StringArrayGames {
	
	//method to return maximum length word
	
	String getMaxLengthWord(String input) {
		String[] inputArray = input.split(" ");
		int maxLength = inputArray[0].length();
		String maxLengthWord = inputArray[0];
		for(int index=1; index<inputArray.length; index++) {
			if(maxLength < inputArray[index].length()) {
				maxLength = inputArray[index].length();
				maxLengthWord = inputArray[index];
			}
		}
		return maxLengthWord;
	}
	
	//method to print all the words having atleast one digit
	void getWordWithDigits(String input) {
		String[] inputArray = input.split(" ");
		System.out.print("Words with Digits \nInput : " + input + "\nOutput : ");
		for(int index=0; index<inputArray.length; index++) {
			for(int j=0; j<inputArray[index].length(); j++) {
				if(Character.isDigit(inputArray[index].charAt(j))) {
					System.out.print(inputArray[index] + " ");
					break;
			     }
		    }
		}
		System.out.println("\n");
	}
	
	// method to return word having maximum uppercase
	String getWordWithMaxUpperCase(String input) {
		String[] inputArray = input.split(" ");
		int maxCount =0;
		String maxWord = " ";
		for(int index=0; index<inputArray.length; index++) {
			int count = 0; 
			for(int j=0; j<inputArray[index].length(); j++) {
				if(Character.isUpperCase(inputArray[index].charAt(j))) 
					count++;
			}
			if(maxCount < count) {
				maxCount = count;
				maxWord = inputArray[index];
			}
		}	
		return maxWord;
	}
	
	//method to print all the words having no digits and uppercase
	void getWordWithNoDigitsNoUpCase(String input) {
		String[] inputArray = input.split(" ");
		System.out.print("Words with Digits \nInput : " + input + "\nOutput : ");
		for(int index=0; index<inputArray.length; index++) {
			boolean flag = true;
			for(int j=0; j<inputArray[index].length(); j++) {
				char ch = inputArray[index].charAt(j);
				if(Character.isDigit(ch) || Character.isUpperCase(ch) ) {
					flag = false;
					break;
			     }
		    }
			if(flag)
				System.out.print(inputArray[index] + " ");
		}
		System.out.println("\n");
	}
	
	
	public static void main(String[] args) {
		StringArrayGames stringArrayGames = new StringArrayGames();
		
		String input = "Good morning friends technocreditsisbest this is technocredits";
		System.out.println("Maximum length word \nInput : " + input + "\nOutput: " +stringArrayGames.getMaxLengthWord(input) + "\n");

		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		stringArrayGames.getWordWithDigits(input2);
		
		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		String processedWord = stringArrayGames.getWordWithMaxUpperCase(input3);
		System.out.println("Words with Maximum UpperCase \nInput : " + input3 + "\nOutput : " + processedWord + "\n");
		
		String input4 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		stringArrayGames.getWordWithNoDigitsNoUpCase(input4);
	}
}