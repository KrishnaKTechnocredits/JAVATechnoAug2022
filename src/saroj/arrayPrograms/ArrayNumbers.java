package saroj.arrayPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumbers {

	void duplicateNumbers(int[] numbers) {
		int min = numbers[0];
		for (int index = 0; index < numbers.length; index++) {
			if (min > numbers[index]) {
				min = numbers[index];
			}
		}
		for (int index = 0; index < numbers.length; index++) {
			for (int innerIndex = index + 1; innerIndex < numbers.length; innerIndex++) {
				if (numbers[index] == numbers[innerIndex]) {
					System.out.println(numbers[index]);
					numbers[innerIndex] = min--;
				}
			}
		}
	}

	void uniqueNumber(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < numbers.length; innerIndex++) {
				if (numbers[index] == numbers[innerIndex]) {
					count++;
				}
			}
			if (count == 1)
				System.out.println(numbers[index]);
		}
	}

	void missingNumber(int[] numbers, int startRange, int endRange) {
		for (int index = startRange; index < endRange; index++) {
			boolean isMissingNum = true;
			for (int innerIndex = 0; innerIndex < numbers.length; innerIndex++) {
				if (index == numbers[innerIndex]) {
					isMissingNum = false;
					break;
				}
			}
			if (isMissingNum)
				System.out.println(index);
		}
	}

	void duplicateName(String[] input) {
		for (int index = 0; index < input.length; index++) {
			if (!input[index].equals("")) {
				for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
					if (input[index].toLowerCase().equals(input[innerIndex].toLowerCase())) {
						System.out.println(input[index]);
						input[innerIndex] = "";
					}
				}
			}
		}
	}

	void uniqueName(String[] input) {
		String[] newInputArray = new String[input.length];
		int indexArray = 0;
		for (int index = 0; index < input.length; index++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < indexArray; innerIndex++) {
				if (input[index].equals(newInputArray[innerIndex])) {
					flag = false;
					break;
				}
			}
			if (flag) {
				newInputArray[indexArray] = input[index];
				System.out.println(newInputArray[indexArray]);
				indexArray++;
			}
		}
	}

	void getUniqueContent(int[] numbers) {
		int[] newArray = new int[numbers.length];
		int newArrayIndex = 0;
		for (int index = 0; index < numbers.length; index++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < newArray.length; innerIndex++) {
				if (numbers[index] == newArray[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(numbers[index]);
				newArray[newArrayIndex] = numbers[index];
				newArrayIndex++;
			}
		}
	}

	void getNumberWithFrequency(int[] number) {
		int[] newArray = new int[number.length];
		int newArrayIndex = 0;
		for (int index = 0; index < number.length; index++) {
			boolean flag = true;
			for (int innerIndex = 0; innerIndex < newArray.length; innerIndex++) {
				if (number[index] == newArray[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				newArray[newArrayIndex] = number[index];
				newArrayIndex++;
			}
		}
		for (int index = 0; index < newArrayIndex; index++) {
			int count = 0;
			int num = newArray[index];
			for (int innerIndex = 0; innerIndex < number.length; innerIndex++) {
				if (num == number[innerIndex]) {
					count++;
				}
			}
			System.out.println(num + "-> " + count);
		}
	}

	public static void main(String[] args) {
		ArrayNumbers arrayNumbers = new ArrayNumbers();
		Scanner obj = new Scanner(System.in);

		System.out.println("Enter array Size: ");
		int length = obj.nextInt();
		int[] num = new int[length];
		System.out.println("Enter numbers");
		for (int index = 0; index < num.length; index++) {
			num[index] = obj.nextInt();
		}

		System.out.println("================================================");
		System.out.println("Present array is: " + Arrays.toString(num));
		System.out.println("================================================");
		System.out.println("Duplicate numbers are: ");
		arrayNumbers.duplicateNumbers(num);
		System.out.println("================================================");

		System.out.println("Enter array Size: ");
		int lengthArr = obj.nextInt();
		int[] num2 = new int[lengthArr];
		System.out.println("Enter numbers");
		for (int index = 0; index < num2.length; index++) {
			num2[index] = obj.nextInt();
		}

		System.out.println("================================================");
		System.out.println("Present array is: " + Arrays.toString(num2));
		System.out.println("================================================");
		System.out.println("Unique numbers are: ");
		arrayNumbers.uniqueNumber(num2);
		System.out.println("================================================");

		System.out.println("Enter array Size: ");
		int length1 = obj.nextInt();
		int[] num1 = new int[length1];
		System.out.println("Enter numbers");
		for (int index = 0; index < num1.length; index++) {
			num1[index] = obj.nextInt();
		}

		System.out.println("================================================");
		// int[] arr2 = { 1, 3, 9, 5, 6, 10 };
		System.out.println("Missing numbers are: ");
		arrayNumbers.missingNumber(num1, 1, 10);
		System.out.println("================================================");

		System.out.println("Enter string array Size: ");
		int length2 = obj.nextInt();
		String[] str = new String[length2];
		System.out.println("Enter strings");
		for (int index = 0; index < str.length; index++) {
			str[index] = obj.next();
		}
		System.out.println("================================================");
		System.out.println("Present string array is: " + Arrays.toString(str));
		System.out.println("================================================");
		System.out.println("Duplicate names are: ");
		arrayNumbers.duplicateName(str);
		System.out.println("================================================");

		System.out.println("Enter Array size: ");
		int length3 = obj.nextInt();
		String[] str1 = new String[length3];
		System.out.println("Enter String");
		for (int index = 0; index < str1.length; index++) {
			str1[index] = obj.next();
		}

		System.out.println("================================================");
		System.out.println("Present string array is: " + Arrays.toString(str1));
		System.out.println("================================================");
		System.out.println("Unique names are: ");
		arrayNumbers.uniqueName(str1);
		System.out.println("================================================");

		System.out.println("Enter Array size: ");
		int length4 = obj.nextInt();
		int[] str2 = new int[length4];
		System.out.println("Enter numbers");
		for (int index = 0; index < str2.length; index++) {
			str2[index] = obj.nextInt();
		}

		System.out.println("================================================");
		System.out.println("Present number array is: " + Arrays.toString(str2));
		System.out.println("================================================");
		System.out.println("Unique contents are: ");
		arrayNumbers.getUniqueContent(str2);
		System.out.println("================================================");

		System.out.println("Enter Array size: ");
		int length5 = obj.nextInt();
		int[] str3 = new int[length5];
		System.out.println("Enter numbers");
		for (int index = 0; index < str3.length; index++) {
			str3[index] = obj.nextInt();
		}

		System.out.println("================================================");
		System.out.println("Present number array is: " + Arrays.toString(str3));
		System.out.println("================================================");
		System.out.println("Numbers with frequency are: ");
		arrayNumbers.getNumberWithFrequency(str3);
		System.out.println("================================================");

		obj.close();

	}
}
