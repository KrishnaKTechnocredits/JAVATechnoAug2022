package manjiri.arrayEx;

public class ArrayEx2 {
	
	private boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') 
			return true;
		else 
			return false;		
	}
	
	int getCountOfVowelsInString(String name) {
		int count = 0;
		
		for(int index = 0; index < name.length();index++) {
			if (isVowel(name.charAt(index)))
				count++;
		}
		return count;
	}
	
	int[] getCountOfVowelsInArray(String[] input) {
		int[] output = new int[input.length];
		
		for (int index = 0; index < input.length; index++) {
			int result = getCountOfVowelsInString(input[index]);
			
			output[index] = result;
		}
		return output;
	}	
	
	String getMaxLengthNameFromArray(String[] input) {
		int maxLength = input[0].length();
		String maxString = input[0];
		
		for (int index = 1; index < input.length; index++) {
			if(maxLength <= input[index].length()) {
				maxLength = input[index].length();
				maxString = input[index];
			}
		}
		return maxString;
	}
	
	String getMaxLengthNameFromArrayUsingReverseLoop(String[] input) {
		int maxLength = input[0].length();
		String maxString = input[0];
		
		for (int index = input.length-1; index >= 0; index--) {
			if(maxLength < input[index].length()) {
				maxLength = input[index].length();
				maxString = input[index];
			}
		}
		return maxString;
	}
	
	void display(String[] input, int[] output) {
		for(int index = 0; index < input.length; index++) {
			System.out.println(input[index]+ " " + "-> " + output[index]);
		}
	}
}
