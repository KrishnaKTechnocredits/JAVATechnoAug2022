package namratamishra.stringOperations;

/*
Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4
*/
import java.util.Scanner;

class CountDgtStr {
	int getCountDgt(String str) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			boolean flag = Character.isDigit(ch);
			if (flag)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for finding the digit in given name");
		String name = sc.nextLine();
		System.out
				.println("total no. of digit in given name: " + name + " is : " + +new CountDgtStr().getCountDgt(name));
		sc.close();
	}
}