package shraddhaRekhate.Assignment32;

public class Pallindrome {
	void checkPallindrome(int number) {
		int remainder=0;
		int originalNumber=number;
		int revNumber=0;
		while(number>0) {
			remainder=number%10;
			revNumber=revNumber*10+remainder;
			number=number/10;
		}
		if(revNumber==originalNumber) {
			System.out.println(originalNumber+" "+"is  pallindrome");
		}else
			System.out.println(originalNumber+" "+"is not @ pallindrome");
	}
	public static void main(String[] args) {
		Pallindrome pallindrome=new Pallindrome();
		pallindrome.checkPallindrome(1221);
		pallindrome.checkPallindrome(1231);
	}

}
