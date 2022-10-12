package sagarY.Assignment_34;
import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {

	boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("Input: ");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String: ");
		String str1 = sc.nextLine();
		System.out.print("Enter Second String: ");
		String str2 = sc.nextLine();
		boolean isAnagram = new IsAnagram().isAnagram(str1, str2);
		System.out.println("Is given string Anagram ? \nAnswer:" + isAnagram);
		sc.close();
	}

}
