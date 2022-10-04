package maheshSantoki.arrayExamples;

public class Test4Array {
	/*
	 * Program 1 : Write a method to return sum of all the digits present in each
	 * elements from given array. input
	 * :{"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"} \ output :
	 * Mahesh-> 5 Avni -> 9 Puja -> 9 Harshal -> 0 Aditty -> 8 Rahul -> 0
	 */
	int getSumOfDigit(String str) {
		int sum = 0;
		char ch1 = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int[] get(String[] name) {
		int length = name.length;
		int[] sum = new int[length];
		for (int i = 0; i < length; i++) {
			sum[i] = getSumOfDigit(name[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		Test4Array test4array = new Test4Array();

		String input[] = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		System.out.println("sum of all the digits present in each elements : ");

		int[] output = test4array.get(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(input[i] + " --> " + output[i]);
		}
	}
}
