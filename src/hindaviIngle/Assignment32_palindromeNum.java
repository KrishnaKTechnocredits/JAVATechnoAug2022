package hindaviIngle;

public class Assignment32_palindromeNum {
	void findPalindromNumber(int num) {
		int orignalNum = num;
		System.out.println("Orignal Number " + num);
		int revNum = 0;
		while (num > 0) {
			int r = num % 10;
			revNum = revNum * 10 + r;
			num = num / 10;

		}
		if (orignalNum == revNum) {
			System.out.println(revNum + " is a Palidrom number ");
		} else {
			System.out.println(revNum + " not a Palidrom number ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_palindromeNum a32 = new Assignment32_palindromeNum();
		a32.findPalindromNumber(1221);
	}

}
