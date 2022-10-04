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
              11
              */

package deepakBorse.Assignments;

public class Assignment14_PrimeNo {

	void PrimeNo(int primecount) {
		int index, countp = 0;
		int num = 2;
		while (countp != primecount) {
			boolean primeflag = true;
			for (index = 2; index <= num / 2; index++) {
				if (num % index == 0) {
					primeflag = false;
					break;
				}
			}
			if (primeflag == true) {
				System.out.println("Prime Number :" + num);
				countp++;
			}
			num++;
		}
	}

	public static void main(String[] args) {
		new Assignment14_PrimeNo().PrimeNo(10);

	}

}
