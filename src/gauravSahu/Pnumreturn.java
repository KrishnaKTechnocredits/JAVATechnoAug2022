package gauravSahu;

public class Pnumreturn {

	int count = 0;

	boolean isPrime(int num) {
		boolean status = true;
		int index = 2;
		while (index <= num / 2) {
			if (num % index == 0) {
				status = false;
				return false;
			}
			index++;
		}
		if (status == true) {
			count++;
			return true;
		} else
			return false;
	}

	void sumOfFirstFiveNum(int counting) {

		int num = 2;
		int sum = 0;
		{
			while (count != counting) {

				boolean status = isPrime(num);
				if (status) {
					System.out.println(num + " is a prime number ");
					sum = sum + num;
				}
				num++;
			}
			System.out.println("\n"+sum + " is sum of first five prime num ");
		}
	}

	public static void main(String[] args) {
		Pnumreturn pnumreturn = new Pnumreturn();
		pnumreturn.sumOfFirstFiveNum(5);

	}

}
