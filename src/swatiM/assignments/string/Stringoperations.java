/*
 Assignment - 17 : 7th Sep'2022

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
package swatiM.assignments.string;

public class Stringoperations {
    
	static String reverseName(String name) {
		String revName = "";
		for(int index = name.length()-1;index >=0;index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}
	static String evnString(String evnstr){
		int len = evnstr.length();
		String str = "";
		
		for(int index = 1; index < len ; index = index + 2){
			str = str + evnstr.charAt(index);
		}
		return str;
	}
	static String reverseEvenString(String evnstr){
		String str = evnString(evnstr);
		String reverseEvenChar = reverseName(str);
		return reverseEvenChar;
	}
	int getDigitCount(String name){
		int count = 0;
		for (int index = 0; index <= name.length() - 1; index++) {
			if (Character.isDigit(name.charAt(index))) {
				count++;
			}
		}
		return count;
	}
	int getSumOfDigitsInString(String stringInput) {
		int sum = 0;
		for (int index = 0; index < stringInput.length() - 1; index++) {
			char ch = stringInput.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Stringoperations reverseName1 = new Stringoperations();
	  String str1 = "Swati";
	  System.out.println("Reverse String of " + str1 + " is: \n" + Stringoperations.reverseName(str1));
	  String str2 = "technocredits";
	  System.out.println("even position characters from given String " + str2 + " is: \n" + Stringoperations.evnString(str2));
	  System.out.println("even position characters from given String in reverse " + str2 + " is: \n" + Stringoperations.reverseEvenString(str2));
      String str3 = "Te8chno3cred7it9s";
	  System.out.println("Digit count in " + str3 + " is: \n" + reverseName1.getDigitCount(str3));	 
	  System.out.println("Sum of Digits in " + str3 + " is: \n" + reverseName1.getSumOfDigitsInString(str3));

	}

}

