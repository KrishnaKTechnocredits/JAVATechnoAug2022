/*   ASSIGNMENT 19 
 
 
 *1) Write a method to return sum of all numbers in given array.
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

package rohanNaik.Assignments;

public class Assignment19Array {
	
	
	void midChar(String[] fifthArray) {

		int index = 0;
		char ch = ' ';
		int len = 0;

		for (index = 0; index < fifthArray.length; index++) {
			String str = fifthArray[index];
			len = str.length();
			if (len % 2 == 0) {
				ch = str.charAt(len / 2 - 1);
			} else if (len % 2 != 0) {
				ch = str.charAt(len / 2);
			}
			System.out.println(str + ":" + ch);
		}
	}
	
	int getMinNum(int[] num) {
		int index = 0;
		int minNum = num[index];

		for (index = 0; index < num.length; index++) {
			if (num[index] < minNum) {
				minNum = num[index];
			}
		}

		return minNum;
	}
	 
	
	int getMaxNum(int[] num) {

		int maxNum = 0;

		for (int index = 0; index < num.length; index++) {
			if (num[index] > maxNum) {
				maxNum = num[index];
			}
		}

		return maxNum;
	}
	

	
	int getSum(int[] num) {

		int sum = 0;

		for (int index = 0; index < num.length; index++) {
			sum = sum + num[index];
		}
		return sum;

	}
	
	int getPrimeSum(int[] num) {

		int sum = 0;
		boolean flag = true;

		for (int arrayIndex = 0; arrayIndex < num.length; arrayIndex++) {

			for (int index = 2; index <= num[arrayIndex] / 2; index++) {
				if (num[arrayIndex] % index == 0) { // System.out.println(n + " is not prime");
					flag = false;
					break;
				} else
					flag = true;
			}

			if (flag == true) {
				sum = sum + num[arrayIndex];

			}
		}

		return sum;
	}
	 

	public static void main(String[] args) {
		Assignment19Array array = new Assignment19Array();

		int[] firstArray = { 10, 11, 15, 10 };
		int Asum = array.getSum(firstArray);
		System.out.println(Asum);
		System.out.println("--------------------");
		
		int[] secondArray = { 11, 4, 55, 23, 43 };
		int Bsum = array.getPrimeSum(secondArray);
		System.out.println(Bsum);
		System.out.println("--------------------");


		int[] thirdArray = { 11, 4, 55, 23, 43, 78 };
		int max = array.getMaxNum(thirdArray);
		System.out.println(max);
		System.out.println("--------------------");


		int[] forthArray = { 11, 3, 55, 23, 43, 78 };
		int min = array.getMinNum(forthArray);
		System.out.println(min);
		System.out.println("--------------------");

		
		String[] fifthArray = { "Rohan", "Ashish", "Aditty", "Manjiri", "Ankita" };
		array.midChar(fifthArray);
		System.out.println("--------------------");

		

	}

}
