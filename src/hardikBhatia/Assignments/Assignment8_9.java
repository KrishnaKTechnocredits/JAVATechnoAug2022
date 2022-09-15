package hardikBhatia.Assignments;

public class Assignment8_9 {

	void checkNumberPrimeOrNot(int number) {
		boolean isprime = true;
		if(number > 0) {
			for(int num = 2; num <= number / 2; num++ ) {
				if(number% num == 0) {
					isprime = false;
				}
			}
			if(isprime) {
				System.out.println(number + " number is a prime number");
			}else {
				System.out.println(number + " number is not a prime number");
			}
		}else {
			System.out.println(number + " not a valid number");
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment8_9 assignment8_9 = new Assignment8_9();
		assignment8_9.checkNumberPrimeOrNot(15);
		assignment8_9.checkNumberPrimeOrNot(17);
		assignment8_9.checkNumberPrimeOrNot(-90);
	}

}
