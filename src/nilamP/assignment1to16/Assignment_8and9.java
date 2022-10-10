/*
Assignment - 8 & 9 : 26th Aug'2022
Write a program to find if a given number is prime or not.

input : 15
output : 15 number is not a prime number

input : 17
output : 17 is a prime number

input : -90
output : not a valid number

*/
package nilamP.assignment1to16;



public class Assignment_8and9 {
	void isPrimeNumber(int number) {
		boolean flag = true;

		if (number < 1) {
			System.out.println(number + " is invalid input");
		} else {
			for (int index = 2; index <= number / 2; index++) {
				if (number % index == 0) {
					flag = false;
					System.out.println(number + " is not a prime number");
					break;
				}
			}
			if (flag == true)
				System.out.println(number + " is a prime number");
		}
	}

	public static void main(String[] args) {
		Assignment_8and9 a = new Assignment_8and9();
		System.out.println("Assignment 8 & 9 output : ");
		a.isPrimeNumber(15);
		a.isPrimeNumber(17);
		a.isPrimeNumber(-90);

	}
}
