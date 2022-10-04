package jagruti.Test3and4;

public class Test4 
{
	int getDigit(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				int num = Character.getNumericValue(name.charAt(index));
				sum = sum + num;
			}
		}
		return sum;
	}

	int[] getDigitFromArray(String[] name) {
		int[] output = new int[name.length];
		for (int index = 0; index < name.length; index++) {
			output[index] = getDigit(name[index]);
		}
		return output;
	}

	void display(String[] input, int[] output) {
		for (int index = 0; index < input.length; index++) {
			System.out.println(input[index] + " -> " + output[index]);
		}
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		String[] input = { "Ma1he4sh", "A9vni", "P1uj3a5", "Harshal", "A4d4itty", "Rahul" };
		int[] output = test4.getDigitFromArray(input);
		test4.display(input, output);
	}

}
