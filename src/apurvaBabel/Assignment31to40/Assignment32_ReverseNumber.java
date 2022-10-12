/*Program 2 : 
Write a method to return reverse number.
input : 123
output : 321
*/

package apurvaBabel.Assignment31to40;

public class Assignment32_ReverseNumber {

	// Method to return reverse number
	int getReverseNumber(int num) {
		int originalNum = num;
		int reverseNum = 0;
		int reminder;
		System.out.println("Original number --> " + originalNum);

		while (num > 0) {
			reminder = num % 10;
			reverseNum = reverseNum * 10 + reminder;
			num = num / 10;
		}
		return reverseNum;
	}

	public static void main(String[] args) {
		Assignment32_ReverseNumber assignment32 = new Assignment32_ReverseNumber();
		int input = 123;
		int output = assignment32.getReverseNumber(input);
		System.out.println("Reverse number --> " + output);
	}
}
