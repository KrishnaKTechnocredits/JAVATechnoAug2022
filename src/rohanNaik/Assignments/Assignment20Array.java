/*1) Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)

2) Write a method to return sum of all non prime numbers 
and should be divisible by 5 & 7 from given array.
input : {11,35,17,105,44}
output : 140
Hint : (35+105 = 28)

3) Write a method to return sum of all even numbers in given array.
input : {10,11,15,6}
output : 16

4) Write a method to return difference of sum of all even numbers and odd numbers in given array.
input : {10,11,15,6}
output : 10
Hint : 16 - 26 = 10

5) Return count of vowels in a given String.
input : maulik
output : 3

6) Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3

7) Write a method to return name having maximum length.
input : {"Ashish","Aditty","Manjiri","Ankita","Credits"}
output : Credits


*/

package rohanNaik.Assignments;

public class Assignment20Array {
	
	String maxNameLength(String[] inputMaxNames) {
		String maxName = "";
		String[] str = inputMaxNames;
		for(int index = 0; index<str.length; index++) {
			if(str[index].length() > maxName.length()) {
				maxName = str[index];
			}	
		}		
		return maxName;
	}
	
	
	void vowelsCount(String[] inputNames) {

		String vowels = "aeiou";
		String[] names = inputNames;

		for (int x = 0; x < names.length; x++) {
			int count = 0;
			String str = names[x].toLowerCase();
			for (int index = 0; index < str.length(); index++) {
				for (int i = 0; i < vowels.length(); i++) {
					if (str.charAt(index) == vowels.charAt(i)) {
						count++;
					}
				}

			}
			System.out.println(names[x] + " count of vowels is : " + count);
		}
	}

	int getVowelsCount(String name) {
		int count = 0;
		
		String str = name;
		String vowels = "aeiou";
		
		for(int index = 0; index<str.length(); index++) {
			for(int i = 0; i<vowels.length(); i++) {
				if(str.charAt(index) == vowels.charAt(i)){
					count++;
				}
			}
		}
		
		return count;
	}

	int difference(int[] inputDifference) {
		int difference = 0;
		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < inputDifference.length; index++) {
			if (inputDifference[index] % 2 == 0) {
				evenSum = evenSum + inputDifference[index];
			} else if (inputDifference[index] % 2 != 0) {
				oddSum = oddSum + inputDifference[index];
			}
		}

		if (evenSum > oddSum)
			difference = (evenSum - oddSum);
		else
			difference = (oddSum - evenSum);

		return difference;
	}
	
	
	int evenSum(int[] evenInput) {
		
		int evenSum=0;
		
		for(int index=0;index<evenInput.length;index++) {
			if(evenInput[index]%2==0) {
				evenSum = evenSum + evenInput[index];
			}
		}
		
		return evenSum;
	}
	
	
	int divisible(int[] inputDivisible) {
		int divisibleSum = 0;

		for (int index = 0; index < inputDivisible.length; index++) {
			for (int i = 2; i <= inputDivisible[index] / 2; i++) {
				if (inputDivisible[index] % i == 0 && inputDivisible[index] % 5 == 0
						|| inputDivisible[index] % 7 == 0) {
					divisibleSum = divisibleSum + inputDivisible[index];
					break;
				}
			}
		}

		return divisibleSum;
	}

	int notPrimeSum(int[] input) {

		int sum = 0;

		for (int index = 0; index < input.length; index++) {
			for (int i = 2; i <= input[index] / 2; i++) {
				if (input[index] % 2 == 0) {
					sum = sum + input[index];
					break;
				}
			}
		}

		return sum;
	}

	public static void main(String[] args) {
		Assignment20Array obj = new Assignment20Array();
		/*
		 * int[] input = { 11, 13, 17, 22, 44 }; int sum = obj.notPrimeSum(input);
		 * System.out.println("Sum of non Prime numbers is : " + sum);
		 * 
		 * int[] inputDivisible = { 11, 35, 17, 105, 44 }; int divisibleSum =
		 * obj.divisible(inputDivisible);
		 * System.out.println("Sum of non Prime numbers and Divisible by 5 or 7 : " +
		 * divisibleSum);
		 * 
		 * int[] eveninput = {10,11,15,6}; int evenSum = obj.evenSum(eveninput);
		 * System.out.println("Sum of even elements in array : "+ evenSum);
		 * 
		 * int[] inputDifference = {10,11,15,6}; int difference =
		 * obj.difference(inputDifference);
		 * System.out.println("Difference of even and odd elemnts : "+ difference);
		 * 
		 * String name = "maulika"; int count = obj.getVowelsCount(name);
		 * System.out.println("Count of vowels is : "+ count);
		 */
		
		String[] inputNames = {"Ashish","Aditty","Manjiri","Ankita"};
		obj.vowelsCount(inputNames);
		
		String[] inputMaxNames = {"Ashish","Aditty","Manjiri","Ankita","RockyBhai"};
		String maxName = obj.maxNameLength(inputMaxNames);
		System.out.println("Name having maximum length is : "+maxName);
		
		
	}

}
