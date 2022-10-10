package komalShrivastava;
import java.util.Arrays;

public class StringPalindrome {
	
	//method to find whether given String is palindrome
	
	static boolean isPalindrome(String name) {
		for(int index=0, j=name.length()-1; index<j; index++, j--) {
			if(name.charAt(index) != name.charAt(j)) //madam
				return false;
		}
		return true;
	}
	
	//method to find print given String is palindrome
	
	static void printPalindrome(String name) {
		boolean palindromeFlag = isPalindrome(name);
		if(palindromeFlag)
			System.out.println("Input : " + name + "\n" + name + " is Palindrome");
		else
			System.out.println("Input : " + name + "\n" + name + " is not Palindrome");
	}
	
	//method to print all palindrome input from given array
	
	void getPalindrome(String[] arrInput) {
		System.out.print("Input : " + Arrays.toString(arrInput) + "\nPalindrome String are : ");
		for(int index=0; index<arrInput.length; index++) {
			boolean palindromeFlag = isPalindrome(arrInput[index]);
			if(palindromeFlag)
				System.out.print(arrInput[index] + " ");
		}
	}

	public static void main(String[] args) {
		
		//to find whether given String is palindrome
		
		String name = "madam";
		printPalindrome(name);
		printPalindrome("Komal");
		System.out.println("---------------------------------------");
			
		//to find all palindrome in given Array
		
		String[] input = {"radar","techhpet","madam","maulikkilum"};
		new StringPalindrome().getPalindrome(input);
	}
}