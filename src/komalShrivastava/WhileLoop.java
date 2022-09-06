/*Assignment - 14 : 2nd Sep'2022
Using While loop

Program 1: 
Print first N prime numbers.
N should be passed as parameter in the method.
Hint : 5 pass as parameter, method should print first 5 prime numbers.

sample input : 5
output : 	  2
              3
              5
              7
              11 */

package komalShrivastava;

public class WhileLoop {
	
	private boolean primeFlag;

	void primeNumbers(int primeCount) {
		int count = 0;
		int number = 2;
		int index;
		while(count < primeCount) {
			boolean primeFlag = true;
			index = 2;
			while(number > index) {
				if(number%index == 0) {
				primeFlag = false;
				break;
				}
			index++;
			}
			if(primeFlag == true) {
				System.out.println(number + " ");
				count++;
			}
			number++;
		}	
	}

	public static void main(String[] args) {
		WhileLoop whileloop = new WhileLoop();
		whileloop.primeNumbers(5);
	}
}