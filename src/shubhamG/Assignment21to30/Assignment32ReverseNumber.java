package shubhamG.Assignment21to30;

public class Assignment32ReverseNumber {

	int getReverseNumber(int num) {
		System.out.println("Given input number is: " + num);
		int revNum = 0;
		int r=0;
		while (num > 0) {
			r = num % 10;
			revNum=revNum*10+r;
			num = num / 10;
		}
		return revNum;
	}

	public static void main(String[] args) {
		Assignment32ReverseNumber reverseNumber = new Assignment32ReverseNumber();
		
		System.out.println("Number in reverse order is: "+reverseNumber.getReverseNumber(123));

	}
}
