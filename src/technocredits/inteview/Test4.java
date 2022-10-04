package technocredits.inteview;

public class Test4 {
	
	int sumOfDigitsInEachElement(String[] arr) {
		int totalSum = 0;
		for (int index = 0; index < arr.length; index++) {
			int sum = getSumOfDigits(arr[index]);
			totalSum = totalSum+sum;
			System.out.println(arr[index] + "--" + sum);
		}	
		return totalSum;
	}

	int getSumOfDigits(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	boolean isDigit(String name) {
		boolean flag = true;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4 test4 = new Test4();
		String[] arr = { "Ma1he4sh", "A9vni", "p1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		int totalSum = test4.sumOfDigitsInEachElement(arr);
		System.out.println(totalSum);
	}

}