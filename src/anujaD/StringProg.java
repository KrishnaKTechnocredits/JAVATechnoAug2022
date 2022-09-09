/*Assignment - 17 : 7th Sep'2022

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

*Program 2 : Write a method to return even position characters from given String. *
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

package anujaD;

public class StringProg {

	String getReverseName(String name) {
		String revsname = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revsname = revsname + name.charAt(index);

		}
		return revsname;

	}

	String evenChar(String input) {

		String evencharname = "";
		for (int index = 1; index < input.length(); index += 2) {
			evencharname = evencharname + input.charAt(index);
		}

		return evencharname;

	}

	String reverse(String evenstr) {
		String str = evenChar(evenstr);
		String reversestring = getReverseName(str);
		return reversestring;

	}

	int getDigit(String str) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {

			if (Character.isDigit(str.charAt(index))) {
				count++;
			}
		}
		return count;

	}
	int sumofDigit(String name) {
		int sum=0;
		for (int index = 0; index <= name.length() - 1; index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum+num;
			}
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		StringProg stringprog = new StringProg();
		String name = "Aditi";
		String name1 = "technocredits";
		String name2 = "Te8chno3cred7it9s";
		
		System.out.println("Reverse name of  " + name + " is: " + stringprog.getReverseName(name));
		System.out.println("Even position characters from " + name1 + " are: " + stringprog.evenChar(name1));
		System.out.println("Even position reverse characters from " + name1 + " are: " + stringprog.reverse(name1));
		System.out.println("Count of digit from " + name2 + " are: " + stringprog.getDigit(name2));
		System.out.println("Sum of digit from " + name2 + " are: " + stringprog.sumofDigit(name2));
	}

}
