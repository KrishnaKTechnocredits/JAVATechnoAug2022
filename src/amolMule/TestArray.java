package amolMule;

public class TestArray {

	char getMiddleChar(String str) {
		char ch = ' ';
		int len = str.length();
		if (len % 2 == 0) {
			int j = ((len / 2) - 1);
			char ch1 = str.charAt(j);
			ch = ch1;
		} else {
			int j = ((len / 2));
			char ch1 = str.charAt(j);
			ch = ch1;
		}
		return ch;
	}

	void dispaly(String[] arr) {

		char[] output = new char[arr.length];
		String[] input = new String[arr.length];
		System.out.println("******************INPUT CHAR FROM STRING ARRAY************************************");
		for (int i = 0; i < arr.length; i++) {
			input[i] = arr[i];
			output[i] = getMiddleChar(arr[i]);
			System.out.println("input word is " + input[i] + "-- And middle char is " + output[i]);
			
		}

	}

	String maxLengthStr(String[] arr) {
		String s = " ";
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i].length()) {
				max = arr[i].length();
				s = arr[i];
			}
		}

		return s;

	}

	public static void main(String[] args) {
		TestArray ta = new TestArray();
		String[] arr1 = { "Amol", "ABCDEFGHIJKL", "Shiva", "AMOLBALASAHEBMULE", "ShambhooM" };
		ta.dispaly(arr1);
		System.out.println("");
		System.out.println("*****************************************************************");
		String p = ta.maxLengthStr(arr1);
		System.out.println("Max lengh string from given array is -> " + p);
		char m = ta.getMiddleChar(p);
		System.out.println("middle character of max length string is ->  " + m);

	}

}
