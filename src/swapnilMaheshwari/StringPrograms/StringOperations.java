/*

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

package swapnilMaheshwari.StringPrograms;

public class StringOperations {

	String getReverseName(String str) {
		int length = str.length();
		String revName = "";
		for (int index = length - 1; index >= 0; index--) {
			revName = revName + str.charAt(index);
		}
		return revName;
	}

	String getEvenPositionCharacter(String str) {
		int length = str.length();
		String evenPosition = " ";
		for (int index = 0; index <= length - 1; index++ ) {
			if (index % 2==0)
			{

			evenPosition = evenPosition + str.charAt(index);
			}
		}
		return evenPosition;
	}
	
	String getEvenReverse (String str) {
		int length = str.length();
		String evenPosition = " ";
		String evenReverse=" ";
		for (int index = 0; index <= length - 1; index++ ) {
			if (index % 2==0)
			{
			evenPosition = evenPosition + str.charAt(index);
			
			}
		}
		for ( int index = evenPosition.length()-1; index>=0; index--) {
			evenReverse=evenReverse+evenPosition.charAt(index);
		}
			
		return evenReverse;
	}

	int getCountOfDigits(String str) {
		int length = str.length();
		int count = 0;
		boolean countOfDig;
		for (int index = 0; index <= length - 1; index++) {
			char ch = str.charAt(index);
			countOfDig = Character.isDigit(ch);
			if (countOfDig == true) {
				count++;
			}
		}
		return count;
	}

	int getSumOfDigitInString(String str) {
		//int length = str.length();
		//boolean countOfDig;
		int sum = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			//countOfDig = Character.isDigit(ch);
			if (Character.isDigit(ch)) {
				//int number = Character.getNumericValue(ch);
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		StringOperations stringOperations = new StringOperations();
		String str = stringOperations.getReverseName("technocredits");
		System.out.println("The reverse string is:" + str);
		
		String evenCharacters = stringOperations.getEvenPositionCharacter("technocredits");
		System.out.println("The even character of the string :" + evenCharacters);
		//String evenReverseString = stringOperations.getReverseName(evenCharacters);
		
		String evenReverseString = stringOperations.getEvenReverse("technocredits");
		System.out.println("Even position reverse String is : " + evenReverseString);
		
		int stringCount = stringOperations.getCountOfDigits("Te8chno3cred7it9s");
		System.out.println("The total number in the string :" + stringCount);
		
		int stringSum = stringOperations.getSumOfDigitInString("Te8chno3cred7it9s");
		System.out.println("The sum of the number in the string" + stringSum);
	}
}
