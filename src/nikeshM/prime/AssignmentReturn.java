package nikeshM.prime;

public class AssignmentReturn {
	int sum = 0;

	int m2(int num) {

		boolean isPrimeNumber = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrimeNumber = false;
				break;

			}
		}
			 if (isPrimeNumber) {
				sum += num;
				
			}
		
		return sum;

	}

	void data(int startNum, int endNum) {
		for (int num = startNum; num <= endNum; num++) {
			m2(num);

		}
		System.out.println( " Sum is " + sum );
	}

	public static void main(String[] args) {
		AssignmentReturn assignmentreturn = new AssignmentReturn();
		assignmentreturn.data(2, 11);

	}
}
