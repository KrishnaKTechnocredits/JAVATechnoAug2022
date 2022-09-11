/*Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

*/
package asthaSrivastava.arrayBasics;

public class ArrayOperations {

	String getMaxLengthString(String[] name) { // Program1
		int maxLength = name[0].length();

		String maxLengthName = name[0];
		for (int index = 0; index < name.length; index++) {
			if (maxLength < name[index].length()) {
				maxLengthName = name[index];

			}
		}
		return maxLengthName;
	}

	char getMiddleChar(String[] a) { // Program 1
		String input = getMaxLengthString(a);
		int index = 0;
		if (input.length() % 2 == 0) {
			index = input.length() / 2 - 1;
		} else {
			index = input.length() / 2;
		}
		return input.charAt(index);

	}


	public static void main(String[] args) {
		ArrayOperations arryOp = new ArrayOperations();

		String[] result = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println("Middle char of Max Length name " + arryOp.getMaxLengthString(result) + " is :"
				+ arryOp.getMiddleChar(result));
		}
	}
