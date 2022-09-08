package nehaniG;

public class NameOperation2 {

	String reverseName(String name) {
		String revName = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revName = revName + name.charAt(index);
		}
		return revName;
	}

	String evenPosition(String str) {
		String name = "";
		for (int index = 1; index < str.length(); index = index + 2) {
			char ch = str.charAt(index);
			name = name + ch;
		}
		return name;
	}

	String reverseEvenPosition(String str) {
		String evenName = "";
		for (int index = str.length() - 2; index >= 0; index = index - 2) {
			char ch = str.charAt(index);
			evenName = evenName + ch;
		}
		return evenName;
	}

	int digitCount(String str) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}
	int sumOfDigits(String str) {
		int sum = 0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if (Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}			
		}
		return sum;
	}

	public static void main(String[] args) {
		NameOperation2 nameOperation2 = new NameOperation2();
		System.out.println(nameOperation2.reverseName("Maulik"));
		System.out.println(nameOperation2.evenPosition("Technocredits"));
		System.out.println(nameOperation2.reverseEvenPosition("Technocredits"));
		System.out.println(nameOperation2.digitCount("Te8chno3cred7it9s"));
		System.out.println(nameOperation2.sumOfDigits("Te8chno3cred7it9s"));
	}

}
