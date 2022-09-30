package nikeshM.ArrayProgram;

//Program 1 : (20 mins)
//Return middle character of max length String from given array.
//input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
//output : c

public class Test3Program1 {

	String getMaxMiddleChar(String[] input) {
		int length = input.length;
		int maxLength = 0;
		String maxLengthName = "";
		for (int index = 0; index < input.length; index++) {
				if (maxLength < input[index].length()) {
					maxLength = input[index].length();
					maxLengthName = input[index];
				}
		}
		System.out.println(maxLength);
		System.out.println(maxLengthName);
		return maxLengthName;
	}
	public static void main(String[] args) {
		String[]  input = {"Krishna","Maulik","Aashvi","Technocredits","Harsh"};
		new Test3Program1().getMaxMiddleChar(input);
		
	}
	
}
