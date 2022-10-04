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
		 Ankita -> k

Day - 20 : 9th Sep'2022*/
package shrutiArora;
import java.util.Arrays;
public class Assignment19 {
	//1) Write a method to return sum of all numbers in given array.
	int getSumOfArrayElements(int[]arr) {
		int sum = 0;
		for(int index = 0 ; index<arr.length;index++) {
			sum += arr[index];
		}
		return sum ;
	}
	 static private boolean isPrime(int num ) {
		boolean flag = true;
		for(int index = 2 ; index<= num/2 ; index++) {
			if(num%2==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	 //Write a method to return sum of all prime numbers from given array.
	int getsumOfPrimeInarray(int[]input) {
		int sum = 0;
		
		for(int arrayElement : input) {
			boolean isPrime = isPrime(arrayElement);
			if(isPrime)
				sum+= arrayElement;
		}
		return sum ;
	}
	//3) Write a method to return max number from array.
	int getMaxNumFromArray(int[]input1) {
		int max = 0 ;
		for(int element : input1) {
			if(max < element) {
				int temp = max;
				max = element;
				element = temp;
			}
		}
		return max;
	}
	//4) Write a method to return min number from array.
	int getMinNumFromArray(int[] input2) {
		 int min = input2[0] ;
		 for(int index = 0 ;index<input2.length ;index++) {
			 if(min > input2[index]) {
				 int temp = min;
				 min = input2[index];
				 input2[index] = temp;
			 }
		 }
		 return min ;
	}
//Write a method to print middle character of all array elements.
	void printMiddleCharOfArray(String[] str) {
		for(int index = 0 ; index<str.length;index++) {
			char ch = getMiddleCharacter(str[index]);
			System.out.println(str[index]+ " -> " + ch);
		}
	}
	 static private char getMiddleCharacter(String name) {
		int length = name.length();
		int index = 0;
		if(length%2==0) 
			index = (length/2)-1;
		else
			index = length/2;
		return name.charAt(index);
	}
	 public static void main(String[] args) {
		 Assignment19 assignment19 = new Assignment19();
		 int[]arr =  {10,11,15};
		 System.out.println("****************************************Program1***********************************");
		 System.out.println("input " + Arrays.toString(arr));
		 System.out.println("Output: " +assignment19.getSumOfArrayElements(arr));
		 int[] input = {11,14,17,22,44};
		 System.out.println("****************************************Program2***********************************");
		 System.out.println("input " + Arrays.toString(input));
		 System.out.println("output: " +assignment19.getsumOfPrimeInarray(input));
		 System.out.println("****************************************Program3***********************************");
		 int[] input1 = {11,4,55,23,43};
		 System.out.println("input " + Arrays.toString(input1));
		 System.out.println("Output: " +assignment19.getMaxNumFromArray(input1));
		 System.out.println("****************************************Program4***********************************");
		 System.out.println("input " + Arrays.toString(input1));
		 System.out.println("Output: " +assignment19.getMinNumFromArray(input1));
		 System.out.println("****************************************Program5***********************************");
		 String[] name = {"Ashish","Aditty","Manjiri","Ankita"};
		 System.out.println("input " + Arrays.toString(name));
		 System.out.println("Output: ");
		 assignment19.printMiddleCharOfArray(name);
	 }
}