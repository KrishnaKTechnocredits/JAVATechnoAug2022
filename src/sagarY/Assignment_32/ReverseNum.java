/*Program 2 : Write a method to return reverse number.
input : 123
output : 321*/

package sagarY.Assignment_32;
public class ReverseNum {

	void reverseNum(int num) {
		System.out.println("Input: "+num);
		int reverseNum = 0;

		while (num > 0) {
			int remainder = num % 10;     //will get 

			num = num / 10;

			reverseNum = reverseNum * 10 + remainder;

		}
		System.out.println("Reverse of the number is: "+reverseNum +"\n");
	}

	public static void main(String[] args) {
		System.out.println("Program 2 : Write a method to return \nreverse number.");
		System.out.println("----------------------------------------------------");
		new ReverseNum().reverseNum(123);
		new ReverseNum().reverseNum(246);
	}
}
