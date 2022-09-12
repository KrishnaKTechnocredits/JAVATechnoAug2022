/*Assignment - 17 : 7th Sep'2022

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
int num = Character.getNumericValue(ch); '9'*/
package shrutiArora;
public class Assignment17 {
	String getReverseString(String str) {
		String reverseStr = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseStr = reverseStr + str.charAt(index);
		}
	   return reverseStr;
	}

	// method to return even position characters from given String
	String getEvenPositionString(String str) {
		String evenChar = "";
		for (int index = 0; index <= str.length() - 1; index++) {
			if (index % 2 != 0)
				evenChar = evenChar + str.charAt(index);
		}
		return evenChar;
	}

	// method to return even position characters from given String in reverse
	String getEvenReverseString(String str) {
		String evenReverse = "";
		String evenString = getEvenPositionString(str);
		evenReverse = getReverseString(evenString);
		System.out.println("input: " + str);
		System.out.println("output: ");
		return evenReverse;
	}

	// method to return count of digits in a given string
	int getDigitCount(String str) {
		int count = 0;
		boolean flag;
		for (int index = 0; index <= str.length() - 1; index++) {
			flag = Character.isDigit(str.charAt(index));
			if (flag == true)
				count++;
		}
		System.out.println("input: " + str);
		System.out.println("output: ");
		return count;
	}

	// method to return sum of digits in a given string
	int getDigitSum(String str) {
		int sum = 0, digit = 0;
		char ch;
		boolean isDigit = true;
		for (int index = 0; index <= str.length() - 1; index++) {
			ch = str.charAt(index);
			isDigit = Character.isDigit(ch);
			if (isDigit) {
				digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		System.out.println("input: " + str);
		System.out.println("output: ");
		return sum;
	}
   public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		System.out.println("*************************Program1************************************");
		System.out.println( "input:Maulik Output: " +assignment17.getReverseString("Maulik"));
		System.out.println("*************************Program2************************************");
		System.out.println(" input:technocredits output: "+assignment17.getEvenPositionString("technocredits"));
		System.out.println("*************************Program3************************************");
		System.out.println(assignment17.getEvenReverseString("technocredits"));
		System.out.println("*************************Program4************************************");
		System.out.println(assignment17.getDigitCount("Te8chno3cred7it9s"));
		System.out.println("*************************Program5************************************");
		System.out.println(assignment17.getDigitSum("Te8chno3cred7it9s"));
	}
}	