package swapnilMaheshwari.PrimeNumberAllPrograms;

public class NprimeNumberUsingFunction {
	int index = 2;
	int sum = 0;

	int primeCheck(int num) {
		boolean flag = true;
		int count = 0;
		while (count < num) {
			for (int i = 2; i < index; i++) {

				if (index % i == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println("First " + num + " Prime number are " + index);
				count++;
				sum = sum + index;

			}
			index++;
			flag = true;

		}
		return sum;

	}

	public static void main(String[] args) {
		int primeSum;
		NprimeNumberUsingFunction nprimeNumberFun = new NprimeNumberUsingFunction();
		primeSum = nprimeNumberFun.primeCheck(5);
		System.out.println("Sum of firs 5 prime number are: " + primeSum);
	}

}
