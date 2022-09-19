package shubhamG.Assignment11to20;

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
output : 27*/

public class StringPractice {

	String getReverseName(String str) {
		String reverseName = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverseName = reverseName + str.charAt(i);
		}
		return reverseName;
	}

	String getEvenPositionLetter(String str) {
		String evenChar = "";
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 1)
				evenChar = evenChar + str.charAt(i);
		}
		return evenChar;
	}

	String getEvenPositionReverse(String str) {
		String evenCharRev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (i % 2 == 1)
				evenCharRev = evenCharRev + str.charAt(i);
		}
		return evenCharRev;
	}

	int getCountOfDigits(String str) {
		int countDigit = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				countDigit++;
		}
		return countDigit;
	}

	int getsumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}

	public static void main(String[] args) {
		StringPractice stringPractice = new StringPractice();

		System.out.println("Name in Reverse Order is : " + stringPractice.getReverseName("shubham"));
		System.out.println(
				"Even letters from the given string are : " + stringPractice.getEvenPositionLetter("Technocredits"));
		System.out.println("Even letters from the given string in reverse order are : "
				+ stringPractice.getEvenPositionReverse("Technocredits"));
		System.out.println(
				"Count of digit in giving string are : " + stringPractice.getCountOfDigits("Te8chno3cred7it9s"));
		System.out.println("Sum of digit in giving string is : " + stringPractice.getsumOfDigits("Te8chno3cred7it9s"));
	}
}
