/*We need to do sum of first 5 prime number, using return keyword
output: (2 + 3 + 5 + 7 + 11) = 28 */

package sagarY.returnType;

public class ReturnType {
	static int sum = 0;
	int count;

	int showPrime() {
		int num = 2;
		boolean status = true;
		while (num >= 2 && count < 5) {
			status = true;
			for (int index = 2; index <= Math.sqrt(num); index++) {
				if (num % index == 0) {
					status = false;
					num++;
					break;
				}
			}
			 if (status == true) {
				System.out.print(num + "  ");
				count++;
				sum = sum + num;
				num++;
			 }
		}
		
		System.out.print("\nCount is:" + count);
		System.out.print("\nSum of that numbers is:" + sum);
		return sum;
	}

	public static void main(String[] args) {
		ReturnType return1 = new ReturnType();
		System.out.print("First five Prime number are: ");
		return1.showPrime();
	}
}
