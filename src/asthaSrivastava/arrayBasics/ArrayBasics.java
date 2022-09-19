/*1) Write a method to return sum of all numbers in given array.
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
		 Assignment19_Array_Astha #684*/
package asthaSrivastava.arrayBasics;

public class ArrayBasics {
	int getSumofNumbers(int[] arry) { // Program 1
		int sum = 0;

		for (int index = 0; index < arry.length; index++) {
			sum = sum + arry[index];
		}
		return sum;
	}

	boolean isPrimeNumber(int num) {
		boolean flag = true;
		for (int input = 2; input <= num / 2; input++) {
			if (num % input == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Prime Number from given array are :" + num);
		}
		return flag;
	}

	int getPrimeNumberSum(int[] arry) { // Program2
		int sum = 0;

		for (int index = 0; index < arry.length; index++) {
			boolean flag = isPrimeNumber(arry[index]);
			if (flag)
				sum = sum + arry[index];
		}
		return sum;
	}

	int getMaxNumber(int[] arry) {
		int maxNum = 0;
		for (int index = 0; index < arry.length; index++) {
			if (maxNum < (arry[index])) {
				maxNum = (arry[index]);
			}
		}

		return maxNum;
	}

	int getMinNumber(int[] arry) { // Program 4
		int minNum = arry[0];
		for (int index = 0; index < arry.length; index++) {
			if (minNum > (arry[index])) {
				minNum = (arry[index]);
			} 
		}
		return minNum;
	}

	char getMiddleChar(String name) { // Program 5
		name.length();
		int index = 0;
		if (name.length() % 2 == 0) {
			index = name.length() / 2 - 1;
		} else {
			index = name.length() / 2;
		}
		return name.charAt(index);

	}

	void printMiddleChar(String[] name) {
		for (int index = 0; index < name.length; index++) {
			char ch = getMiddleChar(name[index]);
			System.out.println("Middle character of elements in " + name[index] + "-" + ch);

		}
	}

	public static void main(String[] args) {
		ArrayBasics arrayOp = new ArrayBasics();
		int[] num = { 10, 11, 15 };
		System.out.println("Sum of array is :" + arrayOp.getSumofNumbers(num) + "\n");

		int[] num1 = { 11, 14, 17, 22, 44 };
		System.out.println("Sum of Prime Numbers from given array is :" + arrayOp.getPrimeNumberSum(num1) + "\n");

		int[] num2 = { 11, 4, 55, 23, 43 };
		System.out.println("Maximum number from given array is :" + arrayOp.getMaxNumber(num2) + "\n");

		int[] num3 = { 11, 4, 55, 23, 43 };
		System.out.println("Minimum number from given array is :" + arrayOp.getMinNumber(num3) + "\n");

		String[] name = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		arrayOp.printMiddleChar(name);

	}
}
