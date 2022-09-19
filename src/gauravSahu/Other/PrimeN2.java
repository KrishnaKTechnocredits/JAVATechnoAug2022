package gauravSahu.Other;

public class PrimeN2 {

	 void primecheck(int n) {
		new Banking().userDetails("Gaurav");
		int sum = 0;
		int num = 2;

		while (sum != n) {
			boolean flag = false;
			for (int index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println(num);
				sum = sum + num;
			}
			num++;
			if (sum > n)
				break;
		}

	}
	
	

	public static void main(String[] args) {
		new PrimeN2().primecheck(50);
		
	}}
