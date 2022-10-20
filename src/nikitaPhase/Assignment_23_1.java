package nikitaPhase;
/*Write a method to return maximum length word from given input.*/

public class Assignment_23_1{
	String maxLengthWord(String name) {
		String[] arr = name.split(" ");
		System.out.println("Input: " +name);
		String maxLengthName = "";
		for (int i = 0; i < arr.length; i++) {
			for (int index = 0; index < arr[i].length(); index++) {
				if (maxLengthName.length() < arr[i].length())
					maxLengthName = arr[i];
			}
		}
		return maxLengthName;
	}

	public static void main(String[] args) {
		System.out.println("Program 1:Write a method to return maximum length word from given input.");
				
		Assignment_23_1 program1 = new Assignment_23_1();
		String s1 = program1.maxLengthWord("'Good morning friends this is technocredits'\n");
		System.out.println("Output: Maximum length \'String' from given sentence is: \n"+s1);
	}

}
	