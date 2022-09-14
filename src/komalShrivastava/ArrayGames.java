// Assignment - 19 : 9th Sep'2022

package komalShrivastava;

public class ArrayGames {

	//method to return sum of all numbers in given array // 3mins
	
	int getSumOfArray(int[] arr) {
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}
	
	//method to return sum of all prime numbers from given array //7 mins
	
	boolean isPrime(int num) {
		boolean primeFlag = true;
		for(int index = 2; index < num; index++) {
			if(num%index == 0) {
				primeFlag = false;
				break;
		    }
		}
		return primeFlag;
	}
	
	int getSumOfPrimeNumArray(int [] arr) {
		int sum = 0;
		for(int index = 0; index < arr.length; index++) {
			if(isPrime(arr[index])) 
				sum = sum + arr[index];
		}
		return sum;
	}
	
	//method to return max number from array. #5 mins
	
	int getMaxNumInArray(int arr[]) {
		int max = 0;
		int index = 0;
		while(index < arr.length) {
			if(max < arr[index]) 
				max = arr[index];
			index++;
		}
		return max;
	}
	
	//method to return min number from array. //8 mins
	
	int getMinNumInArray(int []arr) {
		int min = arr[0];
		for (int index = arr.length-1; index >= 0; index--) {
			if(min > arr[index])
				min = arr[index];
		}
		return min;	
	}
	
	//method to print middle character of all array elements. //11mins
	
	char getMiddleCharacter(String name) {
			int index = 0;
			if(name.length()%2 == 0) 
				index = name.length()/2 - 1;
			else
				index = name.length()/2;		
			return name.charAt(index);
	}
	
	public static void main(String[] args) {
		ArrayGames arrayGames = new ArrayGames();
		
		System.out.println("Array Games\n-----------");
		
		int[] sumArray = {10, 12, 14, 16, 18, 20};
		int sum = arrayGames.getSumOfArray(sumArray);
		System.out.println("Sum of all array elements is : " + sum);
		
		System.out.println("---------------------------------------------");
		
		int [] sumPrimeNumArray = {21, 5, 13, 9, 2};
		int sumPrimeNum = arrayGames.getSumOfPrimeNumArray(sumPrimeNumArray);
		System.out.println("Sum of all Prime Numbers in array is : " + sumPrimeNum);
		
		System.out.println("---------------------------------------------");
		
		int maxNumArray[] = {34, 65, 23, 12, 87, 22, 01};
		int maxNum = arrayGames.getMaxNumInArray(maxNumArray);
		System.out.println("Maximum number in array is : " + maxNum);
		
		System.out.println("---------------------------------------------");
		
		int []minNumArray = {34, 65, -1, 12, 87, 22, 1};
		int minNum = arrayGames.getMinNumInArray(minNumArray);
		System.out.println("Minimum number in array is : " + minNum);
		
		System.out.println("---------------------------------------------");
		
		String[] name = {"Palak", "Anurag", "Trixie", "Komal"};
		System.out.println("Middle Characters");
		for(int index = 0; index < name.length; index++) {
			char ch = arrayGames.getMiddleCharacter(name[index]);
			System.out.println(name[index] + " --> " + ch);
		}
		System.out.println("---------------------------------------------");	
	}
}
