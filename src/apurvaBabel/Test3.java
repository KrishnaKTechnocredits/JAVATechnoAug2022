package apurvaBabel;

public class Test3 {

	// Return middle character of max length string from given array
	char getMiddleCharFromMaxLengthName(String[] name) {

		String tempName = "";
		int tempLength = 0;
		int strIndex;
		for (int index = 0; index < name.length; index++) {
			if (tempLength < name[index].length()) {
				tempLength = name[index].length();
				tempName = name[index];
			}
		}
		if (tempName.length() % 2 == 0) {
			strIndex = tempLength / 2 - 1;
		} else {
			strIndex = tempLength / 2;
		}
		char ch = tempName.charAt(strIndex);

		return ch;
	}

	// Return middle character of each element from given array
	char getMiddleChar(String str) {
		int i = 0;
		if (str.length() % 2 == 0) {
			i = str.length() / 2 - 1;
		} else {
			i = str.length() / 2;
		}
		return str.charAt(i);
	}

	char[] getMiddleCharOfName(String[] arr) {
		char[] output = new char[arr.length];
		int i = 0;
		for (int index = 0; index < arr.length; index++) {
			char ch = getMiddleChar(arr[index]);
			output[i] = ch;
			i++;
		}
		return output;
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		String[] nameArray = { "Krishna", "Maulik", "Aashvi", "Technocredits", "Harsh" };
		System.out.println(
				"Middle character of max string from array is " + test3.getMiddleCharFromMaxLengthName(nameArray));

		String[] input = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] ch = test3.getMiddleCharOfName(input);
		for (int index = 0; index < ch.length; index++) {
			System.out.println(input[index] + " -> " + ch[index]);
		}
	}

}
