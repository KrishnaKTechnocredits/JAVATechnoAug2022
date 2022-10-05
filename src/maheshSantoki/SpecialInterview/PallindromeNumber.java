//Program 3 : 

//write a method to verify number is palindrome.
//
//input : 1221
//output : 1221 is a pallindrome number
//
//input : 1231
//output : 1231 is not a pallindrome number
package maheshSantoki.SpecialInterview;

public class PallindromeNumber {
	int reverseNumber(int num) {
		int revNum = 0;
		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			revNum = revNum * 10 + rem;
			num = num / 10;
		}
		return revNum;
	}

	void pallindromeNum(int originalNumber) {
		int revNum = reverseNumber(originalNumber);
		if (revNum == originalNumber)
			System.out.println(originalNumber + " is Pallindrome Number");
		else
			System.out.println(originalNumber + " is not Pallindrome Number");
	}

	public static void main(String[] args) {
		PallindromeNumber pallinnum = new PallindromeNumber();
		
		int input1 = 1221;
		pallinnum.pallindromeNum(input1);
		
		int input2 = 1231;
		pallinnum.pallindromeNum(input2);

	}
}
