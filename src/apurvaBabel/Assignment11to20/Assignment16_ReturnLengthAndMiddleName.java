/*Assignment - 16 :

1. write a method to return length of the given name
int getNameLength(String name)

2. return middle character from given name.
Hint : char getMiddleChar(String name)

input : Maulik
output : Middle character in name Maulik is u

input : Technocredits
output : Middle character in name Technocredits is c
*/

package apurvaBabel.Assignment11to20;

public class Assignment16_ReturnLengthAndMiddleName {
	int getNameLength(String name) {
		int length = name.length();
		return length;
	}

	char getMiddleCharacter(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	void display(String name) {
		System.out.println(name);
		int num = getNameLength(name);
		System.out.println("Length of the word " + " is " + num);
		char letter = getMiddleCharacter(name);
		System.out.println("Middle character in name " + name + " is " + letter);
	}

	public static void main(String[] args) {
		Assignment16_ReturnLengthAndMiddleName assignment16 = new Assignment16_ReturnLengthAndMiddleName();

		String name = "Maulik";
		assignment16.display(name);

		System.out.println("");

		name = "Technocredits";
		assignment16.display(name);
	}
}
