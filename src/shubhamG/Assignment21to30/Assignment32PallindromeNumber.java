package shubhamG.Assignment21to30;

/*Program 3 : 
write a method to verify number is palindrome.

input : 1221
output : 1221 is a palindrome number

input : 1231
output : 1231 is not a palindrome number
*/

public class Assignment32PallindromeNumber {

	void checkIfNumberIsParrindrome(int num) {
		int orgNum = num;
		int revNum = 0;
		int r = 0;
		while (num > 0) {
			r = num % 10;
			revNum = revNum * 10 + r;
			num = num / 10;
		}
		if (orgNum == revNum) {
			System.out.println(orgNum + " is a pallindrome number");
		} else {
			System.out.println(orgNum + " is not a pallindrome number");
		}
	}

	public static void main(String[] args) {
		Assignment32PallindromeNumber pallindrome=new Assignment32PallindromeNumber();
		pallindrome.checkIfNumberIsParrindrome(1221);
		pallindrome.checkIfNumberIsParrindrome(1231);

	}
}
