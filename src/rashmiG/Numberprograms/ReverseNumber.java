/*Assignment - 32 : 30th Sep'2022

Program 2 : 
Write a method to return reverse number.
input : 123
output : 321*/

package rashmiG.Numberprograms;

class ReverseNumber {

	int getReverseNumber(int num) {
		int reverseNo = 0;
		while (num > 0) {
			int r = num % 10;
			reverseNo = reverseNo * 10 + r;
			num = num / 10;
		}
		return reverseNo;
	}

	public static void main(String[] args) {
		ReverseNumber number = new ReverseNumber();
		System.out.println(number.getReverseNumber(123));
	}
}
