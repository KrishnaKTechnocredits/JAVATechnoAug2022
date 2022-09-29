package vibhaS.Assignment;

public class Assignment31 {

	// Write a method to find whether given String is Palindrome
	void findPalindrome(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("String is palindrome => " + str);
		} else {
			System.out.println("String is not palindrome => " + str);
		}
	}

	// Write a method to print all palindrome input from given array
	void printAllPlaindrome(String[] arr) {
		for (String str : arr) {
			findPalindrome(str);
			System.out.println(" ..................");
		}
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		String str = "radar";
		String str1 = "aabcbaa";
		assignment31.findPalindrome(str);
		System.out.println(" ");
		assignment31.findPalindrome(str1);
		System.out.println(" ");
		String[] arr = { "radar", "techhpet", "madam", "maulikkilum" };
		assignment31.printAllPlaindrome(arr);
	}
}
