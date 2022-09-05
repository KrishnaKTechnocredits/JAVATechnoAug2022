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
              11 */

package pankajBhatt;

class Assignent13_2Sep2022 {
	int initial = 2;

	void printFirstFivePrimes(int number) {
		while(number != 0) {
			boolean flag = true;

			for(int i = 2 ; i <= initial/2; i ++) {
				if(initial % i == 0) {	
					flag = false;
					break;
				}
			}

			if(flag == true) {
				System.out.println(initial);
				number--;
			}
			initial++;
		}		
	}

	public static void main(String[] args) {
		new Assignent13_2Sep2022().printFirstFivePrimes(5);
	}
}
