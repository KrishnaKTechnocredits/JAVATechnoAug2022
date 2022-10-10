package namratamishra.stringOperations;

/*Write a method to return even position characters from given String. 
input : technocredits
output : ehordt
*/
import java.util.Scanner;

class ReturnEvenPositionChar {
	String getEvenChar(String str) {
		String even = "";
		for (int index = 1; index <= str.length() - 1; index += 2)
			even = even + str.charAt(index);
		return even;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name for finding even position characters");
		String name = sc.nextLine();
		System.out.println("Even Position Charaters from the given name: " + name + " is "
				+ new ReturnEvenPositionChar().getEvenChar(name));
		sc.close();
	}

}