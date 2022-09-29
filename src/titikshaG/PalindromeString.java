//Program 1 :
//Write a method to find whether given String is pallindrome.
//input : radar
///output : radar is pallindrom

//Program2:
//input : aabcbaa
//output : aabcbaa is pallindrom


package titikshaG;

public class PalindromeString {
	void findPaindromeString(String str) {
		String revString = "";
		boolean flag=true;
		for (int index = str.length() - 1; index >= 0; index--) {
			revString = revString + str.charAt(index);}
			System.out.print("input : " + str + "\n");
		if (str.equals(revString) && flag)
			System.out.println("output : " + str + " is palindrome" + "\n");
		else
			System.out.println("output : " + str + " is  not a palindrome");}
	
	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.findPaindromeString("radar");
		palindromeString.findPaindromeString("aabcbaa");}
}
