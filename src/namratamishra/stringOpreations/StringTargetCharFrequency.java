package namratamishra.stringOpreations;
/*
 Find frequency of given character from given String. 
String str = "TechnoTtcredits";
char targetChar = 't';
output : 4
*/
import java.util.Scanner;

class StringTargetCharFrequency {
	int getTargetCharFrequency(String str, char targetChar) {
		int count = 0;
		str = str.toLowerCase();
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (ch == targetChar)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to find target charater frequency");
		String name = sc.nextLine();
		System.out.println("Enter target charater to find  frequency in given name");
		char targetChar = sc.next().charAt(0);
		System.out.println("The frequncy of target character " + targetChar + " in given name is: "
		+ new StringTargetCharFrequency().getTargetCharFrequency(name, targetChar));
		sc.close();
	}
}