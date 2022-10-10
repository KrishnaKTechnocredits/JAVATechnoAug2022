/*Assignment - 10 : 30th Aug'2022
Find the last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
              168
              147  
*/
package nilamP.assignment1to16;

public class Assignment10and11 {
	void printPrimeNumbers(int startRange, int endRange) {
		System.out.println("Last three numbers divisible by 3 and 7 are:");
		int count = 0;
		for (int num = endRange; num >= startRange; num--) {
			if (num % 3 == 0 && num % 7 == 0) {
				System.out.println(num);
				count++;
			}
			if (count == 3) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Assignment 10 & 11 output : ");
		new Assignment10and11().printPrimeNumbers(10, 200);
	}
}
