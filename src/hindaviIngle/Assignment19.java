
/*
 Assignment - 19 : 9th Sep'2022

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
package hindaviIngle;

public class Assignment19 {

	int getSum(int[] arry) {
		int sum = 0;
		for (int index = 0; index < arry.length; index++) {
			// System.out.println("length "+arry.length);
			sum = sum + arry[index];
		}
		return sum;
	}

	boolean isPrime(int num) {
		boolean isPrime;
		int status = 0;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				status = 1;
				break;
			}
		}
		if (status == 0) {
			isPrime = true;
			System.out.println("prime no is :" + num);
		} else {
			isPrime = false;
		}

		//System.out.println(isPrime);
		return isPrime;

	}

	int getSumofPrimeNo(int[] arry) {
		int sum = 0;
		for (int index = 0; index < arry.length; index++) {
			boolean flag = isPrime(arry[index]);
			if (flag) {
				sum = sum + arry[index];
			}
		}
		return sum;

	}

	int maxNo(int[] arr) {
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			if (max < arr[index]) {
				max = arr[index];
			}
			// System.out.println("max no is"+max);
		}
		return max;

	}

	int minNo(int[] arr) {
		int min = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (min > arr[index]) {
				min = arr[index];
			}
		}
		return min;
	}

	void middleCharOfArrya(String[] strArr) {
		for (int index = 0; index < strArr.length; index++) {
			int index1 = 0;
			int len = strArr[index].length();
			if (len % 2 == 0) {
				index1 = len / 2 - 1;
			} else {
				index1 = len / 2;
			}
			System.out.println(strArr[index] + "--->" + strArr[index].charAt(index1));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment19 ao = new Assignment19();
		int[] num = { 10, 20, 10 };
		System.out.println("Sum of array is :" + ao.getSum(num)+"\n");
		int[] num1 = { 17, 53, 20 };
		System.out.println("Sum of prime no  is :" + ao.getSumofPrimeNo(num1)+"\n");
		int[] num3 = { 17, 51, 20 };
		System.out.println("Max no  is :" + ao.maxNo(num3)+"\n");
		int[] num4 = { 18, 17, 51, 20, 5 };
		System.out.println("Min no  is :" + ao.minNo(num4)+"\n");
		String[] strarr = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		System.out.println("Middle character of all array\n");
		ao.middleCharOfArrya(strarr);

	}
}
