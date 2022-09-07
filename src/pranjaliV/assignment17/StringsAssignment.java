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
int num = Character.getNumericValue(ch); '9'
*/

package pranjaliV.assignment17;

public class StringsAssignment {

	String getReverseName(String name) {
		String revName= "";
		for(int index=name.length()-1 ; index>=0 ; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}
	
	String getEvenPositionChar(String name) {
		String evenPosChar = "";
		int length = name.length();
		
		for (int index=0 ; index<length;index++) {
			if(index%2!=0) {
				evenPosChar = evenPosChar + name.charAt(index);
			}
		}
		return evenPosChar;
	}
	
	String getReverseEvenPositionChar(String name) {
		String revEvenPosChar = "";
		String evenPosChar = getEvenPositionChar(name);
		revEvenPosChar = getReverseName(evenPosChar);
		return revEvenPosChar;
	}
	
	int getCountDigit(String name) {
		int length = name.length();		
		int count = 0;
		for(int index=0 ; index<= length-1 ; index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	
	int getSumDigit(String name) {
		int sum = 0;
		int length = name.length();
		int digit = 0;
		for(int index=0; index<length; index++) {
			char ch = name.charAt(index);
			if(Character.isDigit(ch)) {
				digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		return sum;
	}
	
	void printInfo1(String name) {
		String revName = getReverseName(name);
		System.out.println("Reverse of " + name + " is : " + revName);
		System.out.println("Even position characters of " + name + " are : " + getEvenPositionChar(name));
		System.out.println("Even position characters of " + name + " are in Reverse order : " + getReverseEvenPositionChar(name));
	}

	void printInfo2(String name) {
		System.out.println("Count of digits in a given string " + name + " is : " + getCountDigit(name));
		System.out.println("Sum of digits in a given string " + name + " is : " + getSumDigit(name));
	}
	
	public static void main(String[] args) {
		StringsAssignment stringsAssignment = new StringsAssignment();
		stringsAssignment.printInfo1("Technocredits");
		stringsAssignment.printInfo2("Te8chno3cred7it9s");
		
	}

}
