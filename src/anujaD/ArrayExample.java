/*Assignment - 19 : 9th Sep'2022

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
		 Ankita -> k*/

package anujaD;

public class ArrayExample {

	int add(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		return sum;
	}

	boolean isPrime(int num1) {
		boolean flag = true;
		for (int i = 2; i < num1/2; i++) {
			if (num1 % i == 0){
				flag = false;
				break;
			}
		}

		return flag;

	}

	int getSumOfPrime(int[] num2) {
		int sum = 0;
		for (int i = 0; i < num2.length; i++) {
			if (isPrime(num2[i])) {
				sum = sum + num2[i];
			}
		}
		return sum;

	}
	int getMaxNum(int[] num) {
		
		int max= num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		return max;
		
	}
	int getMinNum(int[] num) {
		int min =num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i] < min)
				min=num[i];
		}
		return min;
		
	}
	char getMiddle(String name) {
		int index=0;
		if(name.length() % 2 == 0) {
			index=name.length()/2-1;
			}else {
				index=name.length()/2;
				
			}
		return name.charAt(index);
		
	}

	public static void main(String[] args) {
		ArrayExample arrayEx = new ArrayExample();
		int[] arr = { 10, 11, 15 };
		int sum = arrayEx.add(arr);
		System.out.println("sum of all numbers is : " + sum);
		int[] arr1 = { 11, 14, 17, 22, 44 };
		int sumOfPrime = arrayEx.getSumOfPrime(arr1);
		System.out.println("sum of all prime numbers is : " + sumOfPrime);
		int[] arr3 = {11,4,55,23,43};
		int maxNum = arrayEx.getMaxNum(arr3);
		System.out.println("max number from given array is : " +maxNum);
		int[] arr4={11,4,55,23,43};
		int minNum = arrayEx.getMinNum(arr4);
		System.out.println("min number from given array is : " +minNum);
		
		String[] name= {"Anuja","Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("Middle characters");
		
		for(int i =0;i< name.length ;i++) {
			char ch = arrayEx.getMiddle(name[i]);
			System.out.println(name[i] + "-" +ch);
			
		}

	}

}
