//Program 5 : Write a method to return sum of digits in a given string.
//input : "Te8chno3cred7it9s"
//output : 27
//Hint : ch = Character.charAt(index);
//Character.isDigit(ch);
//int num = Character.getNumericValue(ch); '9'

package shivaniLikhia;

public class SumOfDigits {
	
	int getSumOfDigitsInString(String name) {
		int sum = 0;
		int num = 0;
		boolean isDigitFlag;
		char ch;
		int nameLength = name.length();
		for(int index=0;index<=nameLength-1;index++) {
			ch = name.charAt(index);
			isDigitFlag = Character.isDigit(ch);
			if(isDigitFlag==true) {
				num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(new SumOfDigits().getSumOfDigitsInString("Te8chno3cred7it9s"));
	}

}
