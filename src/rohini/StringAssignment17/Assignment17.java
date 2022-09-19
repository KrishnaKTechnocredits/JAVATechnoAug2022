package rohini.StringAssignment17;

public class Assignment17 {
//Prgram1
	String getreverseString(String name) {
		String revName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}
//Program2
	String getevenPosition(String name) {
		String evenNum = "";
		for (int index = 0; index < name.length(); index++) {
			if (index % 2 == 1) {
				evenNum = evenNum + name.charAt(index);
			}
		}
		return evenNum;
	}
//Program3
	String reverseEven(String n) {
		String str = getevenPosition(n);
		String reverseEvenStr = getreverseString(str);
		return reverseEvenStr;
	}
//Program4
	int getDigitCount(String name) {
		int count = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
//Program5
	int sumofDigit(String name) {
		int sum = 0;
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		String name1 = "Rohini";
		String name2 = "Technocredits";
		String name3 = "Te8chno3cred7it9s";

		System.out.println("Input String: " + name1 + "\nReverse String: " + new Assignment17().getreverseString(name1));
		System.out.println("\nInput String: " + name2 + "\nEven position Characters:" + new Assignment17().getevenPosition(name2));
		System.out.println("\nInput String: " + name2 + "\nReverse Even position Characters:"+ new Assignment17().reverseEven(name2));
		System.out.println("\nInput String: " + name3 + "\nNumber of digits: " + new Assignment17().getDigitCount(name3));
		System.out.println("\nInput String: " + name3 + "\nSum of digits: " + new Assignment17().sumofDigit(name3));
	}
}
