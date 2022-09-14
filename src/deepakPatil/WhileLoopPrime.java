/*Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 2
              3
              5
              7
              11*/

package deepakPatil;

public class WhileLoopPrime {

	void findFirstNPrime(int n) {

		int count = 1;
		int num = 2;
		while (count <= n) {

			boolean status = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					status = false;
					break;
				}
			}
			if (status == true) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		new WhileLoopPrime().findFirstNPrime(5);
	}

}
