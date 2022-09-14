package nehaniG;

public class Assignment20 {
	int getSumOfAllNonPrime(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 2; j <= num[i] / 2; j++) {
				if (num[i] % j == 0) {
					sum += num[i];
					break;
				}
			}
		}
		return sum;
	}

	int getSumOfAllNonPrimeWIthDivisibility(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 2; j <= num[i] / 2; j++) {
				if (num[i] % j == 0 && num[i] % 5 == 0 && num[i] % 7 == 0) {
					sum += num[i];
					break;
				}
			}
		}
		return sum;
	}

	int getSumOfEvenNumbers(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum += num[i];
			}
		}
		return sum;
	}

	int getSumOfOddNumbers(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				sum += num[i];
			}
		}
		return sum;
	}

	int getDiffernceOfEvenAndOddNumbers(int[] num) {
		int sumOfEvenNumbers = getSumOfEvenNumbers(num);
		int sumOfOddNumbers = getSumOfOddNumbers(num);
		if (sumOfEvenNumbers >= sumOfOddNumbers) {
			return sumOfEvenNumbers - sumOfOddNumbers;
		}
		return sumOfOddNumbers - sumOfEvenNumbers;
	}
	
	int getCountOfVowels(String name)
	{
		name = name.toLowerCase();
		int count = 0;
		for(int index =0;index<name.length();index++) 
		{
			if (name.charAt(index) == 'a' ||
				name.charAt(index) == 'e' ||
				name.charAt(index) == 'i' || 
				name.charAt(index) == 'o' || 
				name.charAt(index) == 'u')
			{
				count++;
			}
		}		
		return count;
	}

	void getCountOfVowelsInArray(String[] name) {
		System.out.println("Q6-> Count of Vowels in given String Array");
		for(int i = 0; i< name.length; i++) {
			System.out.println(name[i] + "->" + getCountOfVowels(name[i]));
		}
	}
	
	String getMaxLength(String[] name) {
		int maxlength = name[0].length();
		String maxString = name[0];
		for (int index=1; index<name.length;index++){
			if (name[index].length()> maxlength) {
				maxString = name[index];
			}
		}
		return maxString;
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		int[] input1 = { 11, 13, 17, 22, 44 };
		System.out.println(
				"Q1-> Sum of all non prime numbers of the given input is " + assignment20.getSumOfAllNonPrime(input1));

		int[] input2 = { 11, 35, 17, 105, 44 };
		System.out.println("Q2-> Sum of all non prime numbers divisible by 5 and 7 of the given input is "
				+ assignment20.getSumOfAllNonPrimeWIthDivisibility(input2));

		int[] input3 = { 10, 11, 15, 6 };
		System.out.println("Q3-> Sum of all even numbers of the given input is " + assignment20.getSumOfEvenNumbers(input3));

		int[] input4 = { 10, 11, 15, 6 };
		System.out.println("Q4-> Difference of Sum of all even and odd numbers of the given input is " + assignment20.getDiffernceOfEvenAndOddNumbers(input4));
		
		String input5 = "Maulik";
		System.out.println("Q5-> Count of vowels of in " + input5+ " is " + assignment20.getCountOfVowels(input5));
		
		String[] input6 = {"Ashish", "Aditty", "Manjiri", "Ankita"};
		assignment20.getCountOfVowelsInArray(input6);
		
		String[] input7 = {"Ashish","Aditty","Manjiri","Ankita","Credits" };
		System.out.println("Q7-> Maximun return name of the given input is " +assignment20.getMaxLength(input7));
	}
}
