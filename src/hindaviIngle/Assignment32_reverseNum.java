package hindaviIngle;

public class Assignment32_reverseNum {
	void findReverseNumber(int num) {
		System.out.println("Orignal Number " + num);
		int revNum = 0;
		while (num > 0) {
			int r = num % 10;
			revNum = revNum * 10 + r;
			num = num / 10;
		}
		System.out.println("Reverse number " + revNum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_reverseNum a32 = new Assignment32_reverseNum();
		a32.findReverseNumber(123);

	}

}
