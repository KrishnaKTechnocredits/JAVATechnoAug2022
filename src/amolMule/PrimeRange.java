package amolMule;

public class PrimeRange {
	int count = 0;
	int sum = 0;

	void processRange(int startnum, int endnum) {
		System.out.println("Prime numbers are");
		for(int i = startnum; i <= endnum; i++) {
			processData(i);
		}
		System.out.println("Total count is "+count);
		System.out.println("Total sum is "+sum);
		System.out.println("Average is " + (sum/count));
	}

	void processData(int num) {
		int flag = 0;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = 1;
				// System.out.println("Not Prime");
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num);
			count++;
			sum = sum + num;
		}

	}
	public static void main(String args[]) {
		PrimeRange prime = new PrimeRange();
		prime.processRange(5, 13);
	}
}
