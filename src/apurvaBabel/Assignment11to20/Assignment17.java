/*Assignment - 17 :

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt

Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4

Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'
*/

package apurvaBabel.Assignment11to20;

public class Assignment17 {

	// Method to return reverse name
	String reverseName(String name) {
		String reverseName = "";

		for (int index = name.length() - 1; index >= 0; index--) {
			reverseName = reverseName + name.charAt(index);
		}
		return reverseName;
	}

	// Method to return even position characters from given string
	String evenPositionCharacter(String name) {
		String even = "";

		for (int index = 0; index <= name.length() - 1; index++) {
			if (index % 2 != 0) {
				even = even + name.charAt(index);
			}
		}
		return even;
	}

	// Method to return even position characters from given string in reverse
	String reverseEvenPositionCharacter(String name) {
		String reverseEven = "";

		for (int index = name.length() - 1; index >= 0; index--) {
			if (index % 2 != 0) {
				reverseEven = reverseEven + name.charAt(index);
			}
		}
		return reverseEven;
	}

	// Method to return count of digits in a given string
	int getCountOfDigits(String name) {
		int count = 0;

		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				count++;
			}
		}
		return count;
	}

	// Method to return sum of digits in a given string
	int getSumOfDigits(String name) {
		int sum = 0;

		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		String name = "Maulik";
		System.out.println("Name in reverse order is " + assignment17.reverseName(name));
		
		name = "Technocredits";
		System.out.println("Even characters from word " + name + " are " + assignment17.evenPositionCharacter(name));
		System.out.println("Even characters from word " + name + " in reverse order are " + assignment17.reverseEvenPositionCharacter(name));
		
		name = "Te8chno3cred7it9s";
		System.out.println("Total digits in word " + name + " are "+ assignment17.getCountOfDigits(name));
		System.out.println("Sum of digits from the word " + name + " is " + assignment17.getSumOfDigits(name));
	}
}
