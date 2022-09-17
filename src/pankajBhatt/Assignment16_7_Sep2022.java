/*Program 1 : Write a method to return reverse name
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

package pankajBhatt;

public class Assignment16_7_Sep2022 {
	
	String reverseString(String str) {
		String reversedString = "";
		if(str != null && str.length() > 1) {
			for(int i = str.length()-1 ; i >= 0 ; i--) {
				reversedString = reversedString + str.charAt(i);
			}
		}		
		return reversedString;
	}
	
	String evenPositioncharactersString(String str) {
		String evenPositioncharsString = "";
		if(str != null && str.length() > 1) {
			for(int i = 0 ; i <str.length() ; i++) {
				if(i % 2 != 0) {
					evenPositioncharsString = evenPositioncharsString + str.charAt(i);
				}
			}
		}		
		return evenPositioncharsString;
	}
	
	String evenPositioncharactersStringInReverse(String str) {
		String evenPositioncharsStringInReverse = "";
		if(str != null && str.length() > 1) {
			for(int i = str.length()-1 ; i >= 0 ; i--) {
				if(i % 2 != 0) {
					evenPositioncharsStringInReverse = evenPositioncharsStringInReverse + str.charAt(i);
				}
			}
		}		
		return evenPositioncharsStringInReverse;
	}
	
	int countOfDigitsInString(String str) {
		int count = 0;
		for(int i = 0 ; i< str.length()-1; i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}			
		}
		return count;
	}
	
	int sumOfDigitsInString(String str) {
		int sum = 0;
		for(int i = 0 ; i< str.length()-1; i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}			
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment16_7_Sep2022 assignment16_7_Sep2022 = new Assignment16_7_Sep2022();
		System.out.println(assignment16_7_Sep2022.reverseString("Pankaj"));
		System.out.println(assignment16_7_Sep2022.evenPositioncharactersString("technocredits"));
		System.out.println(assignment16_7_Sep2022.evenPositioncharactersStringInReverse("technocredits"));
		System.out.println(assignment16_7_Sep2022.countOfDigitsInString("Te8chno3cred7it9s"));
		System.out.println(assignment16_7_Sep2022.sumOfDigitsInString("Te8chno3cred7it9s"));
	}
}
