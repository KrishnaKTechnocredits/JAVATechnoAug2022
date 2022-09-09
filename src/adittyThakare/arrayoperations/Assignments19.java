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
package adittyThakare.arrayoperations;
	
public class Assignments19 {
	
	int[] arr = {1,2,3,4};
	
	int getSumOfArrayElements(int[] inputArray) {
		int addition=0;
		
		for(int index=0;index<inputArray.length;index++) {
			addition = addition + inputArray[index];
		}
		
		return addition;	
	}
	
	boolean isPrime(int number) {
		
		for(int index=2;index<=number/2;index++){
			if(number%index==0){
				return false;
			}	
		}
		
		return true;
	}
	
	int getSumOfPrimeArrayElements(int[] inputArray) {
		int addition=0;
		
		for(int index=0;index<inputArray.length;index++) {
			if(isPrime(inputArray[index])) {
				addition = addition + inputArray[index];
			}
		}	
			
		return addition;	
	}
	
	int getMaxArrayElement(int[] inputArray) {
		int maxNumber = 0;
		
		for(int index=0;index<inputArray.length;index++) {
			if(maxNumber<inputArray[index]) {
				maxNumber = inputArray[index];
			}
		}	
			
		return maxNumber;
	}
	
	int getMinArrayElement(int[] inputArray) {
		
		int minNumber = inputArray[0];
		
		for(int index=0;index<inputArray.length;index++) {
			if(inputArray[index]<minNumber) {
				minNumber = inputArray[index];
			}
		}	
			
		return minNumber;
	}
	
	void getMiddleCharOfArrayElement(String[] inputArray) {
		int strIndex = 0;
		char[] outputArray= {};
		
		for(int index=0;index<inputArray.length;index++) {
			int strLength = inputArray[index].length();
			if(strLength%2==0) {
				strIndex = strLength/2-1;
				System.out.println(inputArray[index]+": "+inputArray[index].charAt(strIndex));
	
			}	
			else {	
				strIndex = strLength/2;
				System.out.println(inputArray[index]+": "+inputArray[index].charAt(strIndex));
			}
		}
		//return outputArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {10,11,15}, array2 = {11,14,17,22,44}, array3 = {11,4,55,23,43};
		String[] array4 = {"Ashish","Aditty","Manjiri","Ankita"};
		
		Assignments19 assignment19 = new Assignments19();
		
		System.out.println("Program for array operations!!");
		
		System.out.println("\n1. Sum of elements of array {10,11,15} is: "+assignment19.getSumOfArrayElements(array1));
		
		System.out.println("\n2. Sum of prime elements of array {11,14,17,22,44} is: "+assignment19.getSumOfPrimeArrayElements(array2));
		
		System.out.println("\n3. Maximum number from array {11,4,55,23,43} is: "+assignment19.getMaxArrayElement(array3));
		
		System.out.println("\n4. Minimum number from array {11,4,55,23,43} is: "+assignment19.getMinArrayElement(array3));
		
		System.out.println("\n5. Middle character of array elements {\"Ashish\",\"Aditty\",\"Manjiri\",\"Ankita\"}");
		assignment19.getMiddleCharOfArrayElement(array4);		
	}
}
