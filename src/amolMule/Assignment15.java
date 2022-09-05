package amolMule;

public class Assignment15 {
	int sum;
	int count;
	int number = 2;
	
	int processData(int rangenum) {
		System.out.println("Prime numbers between the range are:");
		while (count != rangenum) {
			int flag = 0;

			for (int i = 2; i <= number / 2; i++) {
				if (number % i == 0) {
					flag = 1;
					// System.out.println("Not Prime");
					break;
				}
			}

			if (flag == 0) {
				// System.out.println("Its prime");
				System.out.print(" "+number);
				sum = sum + number;
				count++;
			}
			number++;
		}
		return sum;
	}

	public static void main(String args[]) {
		Assignment15 as = new Assignment15();
		int a = as.processData(5);//Returns integer so stored in integer variable.
		System.out.println();
		System.out.println("Sum of prime numbers is: "+a);
	}

}
