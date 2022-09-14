package vibhaS.Assignment;

public class Assignment20_1 {

	boolean getNumIsEvenOrOdd(int num) {
		boolean isEven;
		if (num % 2 == 0) {
			isEven = true;
		} else {
			isEven = false;
		}
		return isEven;
	}

	void differenceOfEvenAndOddNum(int[] arr) {
		int evensum = 0;
		int oddsum = 0;
		int finalans = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean ans = getNumIsEvenOrOdd(arr[index]);
			if (ans == true)
				evensum = evensum + arr[index];
			else
				oddsum = oddsum + arr[index];
		}
		if (evensum > oddsum) {
			finalans = evensum - oddsum;
		} else {
			finalans = oddsum - evensum;
		}
		System.out.println(finalans);
	}

	void sumOfEvenNum(int[] arr) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean ans = getNumIsEvenOrOdd(arr[index]);
			if (ans == true) {
				sum = sum + arr[index];
			}
		}
		System.out.println("Sum of All even  number is => " + sum);
	}

	int isVowel(String str) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = Character.toLowerCase(str.charAt(index));
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	void getTotalVowelCount(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			int ans = isVowel(arr[index]);
			System.out.println(" Total vowel Count in " + arr[index] + " is  " + ans);
		}
	}

	public static void main(String[] args) {
		Assignment20_1 assignment20_1 = new Assignment20_1();
		int[] arr = { 10, 11, 15, 6 };
		assignment20_1.sumOfEvenNum(arr);
		System.out.println("");
		assignment20_1.differenceOfEvenAndOddNum(arr);
		System.out.println("");
		String[] arr1 = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		assignment20_1.getTotalVowelCount(arr1);
	}
}
