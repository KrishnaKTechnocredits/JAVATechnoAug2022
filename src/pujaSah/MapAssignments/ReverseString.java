/*Assignment 40 : 16th Oct'2022 
Program 3 : Return a reverse String [Method : inplace reverse].
input: "Technocredits";
output: "stiderconhceT"
*/

package pujaSah.MapAssignments;

class ReverseString {

//method to return a reverse String [Method : inplace reverse
	void getReversedStringUsingInplace(String str) {
		System.out.println("Input String: " + str);
		String origStr = str;

		char ch1 = ' ', ch2 = ' ';

		for (int index = 0, lastIndex = str.length() - 1; index < lastIndex; index++, lastIndex--) {

			ch1 = str.charAt(index);
			ch2 = str.charAt(lastIndex);
			if (index == 0) {
				str = ch2 + str.substring(index + 1, lastIndex) + ch1;
			} else {
				ch1 = str.charAt(index);
				ch2 = str.charAt(lastIndex);
				str = str.substring(0, index) + ch2 + str.substring(index + 1, lastIndex) + ch1
						+ str.substring((lastIndex + 1));
			}
		}
		System.out.println("Reverse of " + origStr + " is " + str);
	}

	public static void main(String[] args) {
		String str = "Technocredits";
		new ReverseString().getReversedStringUsingInplace(str);
	}
}