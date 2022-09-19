//*Assignment - 18 : 8th Sep'2022

//*1) Write a program to rearrange String in given format. 
//String str = "te2cH4no";
//output : "24tecHno";
//Hint : AllDigitAllCharacter//

//2) Write a program to rearrange String in given format. 
//Hint : Uppercase letters + digits + LowerCase letter
//input = "t8EcHNo5Cred3iTs";//
//output : EHNCT853tcoredis //
// Character.isUpperCase(ch), Character.isLowerCase(ch)//

//3) Find frequency of given character from given String. 
//String str = "TechnoTtcredits";
//char targetChar = 't';//
//output : 4*//


package nikitaPhase;
 class ReverseCharString {
		String getAllDigitAndAllChar(String input) {
			String allDigit = "";
			String allChar = "";
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					allDigit = allDigit + ch;
				} else if (Character.isLetter(ch)) {
					allChar = allChar + ch;
				}
			}
			return allDigit + allChar;
		}

		String getRearrangeString(String input) {
			String allUpperCaseChar = "";
			String allDigitChar = "";
			String allLowerCaseChar = "";
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isUpperCase(ch)) {
					allUpperCaseChar = allUpperCaseChar + ch;
				} else if (Character.isDigit(ch)) {
					allDigitChar = allDigitChar + ch;
				} else if (Character.isLowerCase(ch)) {
					allLowerCaseChar = allLowerCaseChar + ch;
				}
			}
			return allUpperCaseChar + allDigitChar + allLowerCaseChar;
		}

		int getFrequencyOfChar(String input, char targetChar) {
			input = input.toLowerCase();
			targetChar = Character.toLowerCase(targetChar);
			int targetCharCount = 0;
			for (int index = 0; index < input.length(); index++) {
				if (input.charAt(index) == targetChar) {
					targetCharCount++;
				}
			}
			return targetCharCount;
		}

		public static void main(String[] args) {
			ReverseCharString charStringOperations = new ReverseCharString ();
			String input = "te2cH4no";
			String input1 = "t8EcHNo5Cred3iTs";
			String input2 = "TechnoTtcredits";
			char targetChar = 't';
			System.out.println("All digit and all character rearrangement of string : " + input + " is "
					+ charStringOperations.getAllDigitAndAllChar(input));
			System.out.println("all uppercase,digit and lowercase rearrangement of string : " + input1 + " is "
					+ charStringOperations.getRearrangeString(input1));
			System.out.println("Frequency of " + targetChar + " in " + input2 + " is : "
					+ charStringOperations.getFrequencyOfChar(input2, targetChar));
		}
	}
