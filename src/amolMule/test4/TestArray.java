package amolMule.test4;

import java.util.Arrays;

/*public class TestArray {

	int[] getSumDigitStringArray(String[] arr) {
		int sum = 0;
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			String s = arr[i];
			for (int j = 0; j < s.length(); j++) {
				char ch = s.charAt(j);
				// boolean b= Character.isDigit(ch)
				if (Character.isDigit(ch)) {
					int n = Character.getNumericValue(ch);
					sum = sum + n;
					output[i] = sum;
				}
			}
		}

		return output;
	}

	// getsumDigitStringArray()

	public static void main(String[] args) {
		TestArray t = new TestArray();
		String[] input = { "A12m", "2AB5" };
		int[] output= new int[input.length];
		output = t.getSumDigitStringArray(input);

		System.out.println(output);
	}

}*/

public class TestArray {

	int getSumDigitString(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			boolean b = Character.isDigit(ch);
			if (b) {
				sum = sum + (Character.getNumericValue(ch));
			}
		}
		return sum;
	}

	int[] getSumDigitStringArray(String[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {

			int n = getSumDigitString(arr[i]);
			output[i] = n;
		}

		return output;
	}
 
	public static void main(String[] args) {

		TestArray t = new TestArray();
		// t.getSumDigitString(null)
		String[] arr = { "ABC123", "23PQR" };
		int[] out = new int[arr.length];
		out = t.getSumDigitStringArray(arr);
		System.out.println(Arrays.toString(out));
		
		
	}

}
