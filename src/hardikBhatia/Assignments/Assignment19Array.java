package hardikBhatia.Assignments;

public class Assignment19Array {

	// 1) Write a method to return sum of all numbers in given array.
	int sumOfarraryValues(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum;
	}

	// 2) Write a method to return sum of all prime numbers from given array.
	boolean isPrimeNumber(int number) {
		boolean isPrime = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}

	int sumPrimenumberArrary(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (isPrimeNumber(numbers[i])) {
				sum += numbers[i];
			}
		}
		return sum;
	}

	// 3) Write a method to return max number from array.
	int maxNumberArray(int[] numbers) {
		int maxNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (maxNumber < numbers[i]) {
				maxNumber = numbers[i];
			}
		}
		return maxNumber;
	}

	// 4) Write a method to return min number from array.
	int minNumberArray(int[] numbers) {
		int minNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (minNumber > numbers[i]) {
				minNumber = numbers[i];
			}
		}
		return minNumber;
	}
	
	//5) Write a method to print middle character of all array elements.
	void findMiddleCharacter(String[] names) {
		for (int i = 0; i < names.length; i++) {
			int middleCharIndex = 0;
			int length = names[i].length();
			if (length % 2 == 0) {
				middleCharIndex = length / 2 - 1;
			} else {
				middleCharIndex = length / 2;
			}
			System.out.println(names[i] + "-->" + names[i].charAt(middleCharIndex));
		}
	}

	public static void main(String[] args) {
		Assignment19Array assignment19Array = new Assignment19Array();

		int numbers[] = { 10, 11, 15 };
		System.out.println("input : {10,11,15}");
		System.out.println(assignment19Array.sumOfarraryValues(numbers));
		System.out.println("===========================");

		int primeNumbers[] = { 11, 14, 17, 22, 44 };
		System.out.println("input : {11,14,17,22,44}");
		System.out.println(assignment19Array.sumPrimenumberArrary(primeNumbers));
		System.out.println("===========================");

		int maxNumbers[] = { 11, 4, 55, 23, 43 };
		System.out.println("input : {11,4,55,23,43}");
		System.out.println(assignment19Array.maxNumberArray(maxNumbers));
		System.out.println("===========================");
		System.out.println("input : {11,4,55,23,43}");
		System.out.println(assignment19Array.minNumberArray(maxNumbers));
		System.out.println("===========================");
		
		String nameList[] = { "Ashish","Aditty","Manjiri","Ankita" };
		System.out.println("input : { Ashish,Aditty,Manjiri,Ankita }");
		assignment19Array.findMiddleCharacter(nameList);
		System.out.println("===========================");

	}

}
