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

package rashmiG.primeNumber;

class Assignment14FirstNPrimeNos {
	void printFirstNPrimeNumbers(int num) {
		int startNum = 2;
		int count = 0;
		while (count < num) {
			boolean primeFlag = true;
			int index = 2;
			while (index <= startNum / 2) {
				if (startNum % index == 0) {
					primeFlag = false;
					break;
				}
				index++;

			}
			if (primeFlag) {
				System.out.println(startNum);
				count++;

			}
			startNum++;
		}
	}

	public static void main(String[] args) {
		Assignment14FirstNPrimeNos primeNo = new Assignment14FirstNPrimeNos();
		primeNo.printFirstNPrimeNumbers(5);
	}
}
