package nikeshM.prime;

public class FirstPrime {
	int count = 0;
	int sum = 0;
	int avg = 0;

	void processData(int num) {
		boolean status = true;

		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = false;
				break;
			}
		}
		if (status) {
			System.out.println(num + " Current number is prime");
			count++;
			sum = sum + count;
			avg = sum / count;
		}

	}

	void data(int startIndex, int endIndex) {

		for (int num = startIndex; num <= endIndex; num++) {
			processData(num);
		}
		System.out.println("Total Prime Within Range (" + startIndex + ", " + endIndex + ") are " + count);
		System.out.println("Total Prime Count is " + count);
		System.out.println("Total Prime Sum is " + sum);
		System.out.println("Total Prime Average is " + avg);

	}

	public static void main(String[] args) {
		FirstPrime primenumber = new FirstPrime();
		primenumber.data(2, 12);

	}
}
