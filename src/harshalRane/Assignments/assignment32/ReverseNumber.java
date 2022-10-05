/*
 * Program 2 : 
Write a method to return reverse number.
input : 123
output : 321
 */
package harshalRane.Assignments.assignment32;

public class ReverseNumber {
	int reverseNumber(int number) {
		int revNum = 0;
		int remainder=0;
		System.out.println("Given Number is: " + number);
		
		while (number>0) {
			remainder = number % 10;
			revNum = revNum * 10 + remainder;
			number = number/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		ReverseNumber reverse = new ReverseNumber();
		int rev = reverse.reverseNumber(123);
		System.out.println("Reverse Number is: " +rev);
	}
}
