/*Assignment23_Program 1:Write a method to return maximum length word from given input.*/

package sagarY.Arrays.Assignment23;

public class Program1 {

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
		System.out.println("**********************************************************************");
		Program1 program1 = new Program1();
		String s1 = program1.maxLengthWord("'Good morning friends this is technocredits'\n");
		System.out.println("Output: Maximum length \'String' from given sentence is: \n"+s1);
	}

}
