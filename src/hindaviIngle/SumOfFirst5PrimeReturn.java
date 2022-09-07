package hindaviIngle;

public class SumOfFirst5PrimeReturn {
	int getPrimeNumber(int num) {
		for (int index = 2; index <= num / 2; index++) {
			if (num / index == 2) {
			}
		}
		return num;
	}

	int sumOfPrimeNum(int range1, int range2) {
		int sum = 0;
		int sum1;
		for (int i = range1; i <= range2; i++) {

			sum1 = getPrimeNumber(i);
			sum = (sum + sum1);
			System.out.println(sum);
		}
		return sum;
	}

	void display(int sum, int range1, int range2) {
		System.out.println("The sum of all prime numbers " + range1 + " and " + range2 + " is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfFirst5PrimeReturn sumOfFirst5PrimeReturn = new SumOfFirst5PrimeReturn();

		int totalsum = sumOfFirst5PrimeReturn.sumOfPrimeNum(5, 50);

		sumOfFirst5PrimeReturn.display(totalsum, 5, 50);

	}

}
