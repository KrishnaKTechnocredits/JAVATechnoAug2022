package shraddhaRekhate.Assignment32;

public class ReverseNumber {
	int getReverseNumber(int number) {
		int revNumber=0;
		int remainder=0;
		while(number>0) {
			remainder=number%10;
			revNumber=revNumber*10+remainder;
			number=number/10;
		}
		return revNumber;
	}
	public static void main(String[] args) {
		ReverseNumber reverseNumber=new ReverseNumber();
		int reverse=0;
		reverse=reverseNumber.getReverseNumber(123);
		System.out.println("Reverse number is->"+reverse);
	}

}
