package nehaniG;

public class Assignment31 {
	void getPallindromString(String str) {
		String rev = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			rev = rev + str.charAt(index);
		}
		if (str.equals(rev)) {
			System.out.println(str + " is a Pallindrom ");
		} else {
			System.out.println(str + " is not Pallindrom");
		}

	}
	
	void getPallindromStringFromArr(String str) {
		String rev = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			rev = rev + str.charAt(index);
		}
		if (str.equals(rev)) {
			System.out.println(str);
		}
	}


	void getPallindromString(String[] str) {
		for (int i = 0; i < str.length; i++) {

			getPallindromStringFromArr(str[i]);
		}
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String input1 = "radar";
		assignment31.getPallindromString(input1);

		String input2 = "aabcbaa";
		assignment31.getPallindromString(input2);

		String input3 = "abcabc";
		assignment31.getPallindromString(input3);
		System.out.println("-----------------------------------");
		String[] input4 =  {"radar","techhpet","madam","maulikkilum"};
		assignment31.getPallindromString(input4);
	}

}
