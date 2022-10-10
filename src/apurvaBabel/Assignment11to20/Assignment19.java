/*Assignment - 19 :

1) Write a method to return sum of all numbers in given array.
input : {10,11,15}
output : 36

2) Write a method to return sum of all prime numbers from given array.
input : {11,14,17,22,44}
output : 28
Hint : (11+17 = 28)

3) Write a method to return max number from array.
input : {11,4,55,23,43}
output : 55

4) Write a method to return min number from array.
input : {11,4,55,23,43}
output : 4

5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k
*/

package apurvaBabel.Assignment11to20;

public class Assignment19 {

	// Method to return sum of all numbers from given array
	int getSumOfAllNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;
	}

	// Method to return sum of all prime numbers from given array
	boolean isPrimeNumber(int num) {
		boolean isPrime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	int getSumOfPrimeNumbers(int[] num) {
		int sum = 0;
		for (int index = 0; index < num.length; index++) {
			if (isPrimeNumber(num[index])) {
				sum = sum + num[index];
			}
		}
		return sum;
	}

	// Method to return max number from array
	int getMaxNumber(int[] num) {
		int maxNum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (maxNum < num[index]) {
				maxNum = num[index];
			}
		}
		return maxNum;
	}

	// Method to return lowest number from array
	int getMinNumber(int[] num) {
		int minNum = num[0];
		for (int index = 0; index < num.length; index++) {
			if (minNum > num[index]) {
				minNum = num[index];
			}
		}
		return minNum;
	}

	// Method to print middle character of all array elements
	char getMiddleCharacter(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	void printMiddleCharacter(String[] name) {
		for (int index = 0; index < name.length; index++) {
			char ch = getMiddleCharacter(name[index]);
			System.out.println(name[index] + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		int[] input1 = { 10, 11, 15 };
		System.out.println("Sum of all the numbers from given array is " + assignment19.getSumOfAllNumbers(input1));

		int[] input2 = { 11, 14, 17, 22, 24 };
		System.out.println("Sum of prime numbers from given array is " + assignment19.getSumOfPrimeNumbers(input2));

		int[] input3 = { 11, 4, 55, 23, 43 };
		System.out.println("Max number from given array is " + assignment19.getMaxNumber(input3));
		System.out.println("Min number from given array is " + assignment19.getMinNumber(input3));

		String[] name = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("\nMiddle character of every array element : ");
		assignment19.printMiddleCharacter(name);
	}
}
