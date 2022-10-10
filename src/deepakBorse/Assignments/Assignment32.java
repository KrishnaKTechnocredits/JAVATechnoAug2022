/*
 * Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 
Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
 */
package deepakBorse.Assignments;

public class Assignment32 {

// Write a method to verify number is Armstrong or not.
	void Armstrongnumber(int input) {
		int orignumber = input;
		int revnumber = 0, armstrong = 0;

		while (input != 0) {
			revnumber = input % 10; // get the last digit
			armstrong = armstrong + (revnumber * revnumber * revnumber);// to check number is armstrong or not
			input = input / 10; // reduce one digit from input number
		}

		if (orignumber == armstrong) {// compare original and Armstrong
			System.out.println(orignumber + " - Number is Armstrong");
		} else
			System.out.println(orignumber + " - Number is not Armstrong");
	}

//Program#2 Write a method to return reverse number.
	int reversenumber(int input) {
		int revnumber = 0, revnum = 0;

		while (input != 0) {
			revnum = input % 10;// get the last digit
			revnumber = (revnumber * 10) + revnum;// rebuild the number using this formulae
			input = input / 10;// reduce one digit from input number

		}
		// System.out.println(revnumber);
		return revnumber;
	}

//Program 3 : write a method to verify number is palindrome.
	void palendrome(int input) {
		int orignum = input;
		int revnumber = reversenumber(input); // get reverse number from method

		if (orignum == revnumber) { // check where number is Palindrome or not
			System.out.println(orignum + " - Number is Palindrome");
		} else
			System.out.println(orignum + " - Number is not Palindrome");
	}

	public static void main(String[] args) {
		Assignment32 assignment = new Assignment32();

		assignment.Armstrongnumber(153); // call the Armstrong
		assignment.Armstrongnumber(123);// call the Armstrong
		System.out.println("Reverse number output :"+assignment.reversenumber(123)); // call the reverse method
		assignment.palendrome(1221); // call the Palindrome method
		assignment.palendrome(1231); // call the Palindrome method
	}

}
