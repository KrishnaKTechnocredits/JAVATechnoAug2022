package hindaviIngle;

public class FirstNPrimeNumber {

	void isPrime(int num) {
		int counter = 0;
		int no = 2;
		while (counter < num) {
			int status = 0;
			
			for (int index = 2; index < no; index++) {
				if (no % index == 0) {
					status = 1;
					break;
				}
			}
			if (status == 0) {
				System.out.println(no);
				counter++;
			}
			no++;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNPrimeNumber primeExample = new FirstNPrimeNumber();
		System.out.println("First "+5+" Prime Numbers: \n ");
		primeExample.isPrime(5);
	}

}
