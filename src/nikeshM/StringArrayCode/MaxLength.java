package nikeshM.StringArrayCode;
//Program 1:
//Write a method to return maximum length word from given input.
//String input = "Good morning friends this is technocredits";
//output : technocredits

public class MaxLength {
	String getMaxLengthWord(String input) {
		String [] arr = input.split(" ");
		String tempVar = arr[0];
		int maxLength = arr[0].length();
		String maxLengthWord = arr[0];
		
		for (int index = 0 ; index<arr.length ; index++) {
			if (maxLength<=arr[index].length()) {
				maxLength = arr[index].length();
				maxLengthWord = arr[index];
			}
		}
		
		return maxLengthWord;
	}

	
	public static void main(String[] args) {
		String input = "Good morning friends this is technocredits";
		System.out.println(new MaxLength().getMaxLengthWord(input));
	}
}
