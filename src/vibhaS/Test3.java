package vibhaS;

public class Test3 {

	char getMidlleCharOfMaxName(String[] arr) {
		int maxLength = arr[0].length();
		String maxName = "";
		int i = 0;
		for (int index = 0; index < arr.length; index++) {
			if (maxLength < arr[index].length()) {
				maxName = arr[index];
			}
		}
		if (maxName.length() % 2 == 0) {
			i = maxName.length() / 2 - 1;
		} else {
			i = maxName.length() / 2;
		}
		char ch = maxName.charAt(i);
		return ch;
	}

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
		String[] arr = { "Krishna", "Maulik", "Aashvi", "Technocreditds", "Harsh" };
		char ch = test3.getMidlleCharOfMaxName(arr);
		System.out.println("Middle character of Maximun length is => " + ch);
		System.out.println("");
		String[] str = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] ans = test3.getMiddleCharOfName(str);
		for (int index = 0; index < ans.length; index++) {
			System.out.println("Middle character of " + str[index] + " => " + ans[index]);
		}
	}

}
