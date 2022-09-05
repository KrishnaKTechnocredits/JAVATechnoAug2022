package vibhaS;

public class Assignment15 {
	int sum;

	int getSumOfPrime(int n) {
		int count = 0;
		int num = 2;

		while (count != n) {
			boolean flag = true;
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					flag = false;
					break;
				}
			}
			num++;
			if (flag == true) {
				System.out.println("Given number is prime => " + num);
				count++;
				sum = sum + num;
			} else {
				sum = sum + 0;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		int ans = assignment15.getSumOfPrime(5);
		System.out.println(" ");
		System.out.println("sum of  prime num => " + ans);
	}
}
