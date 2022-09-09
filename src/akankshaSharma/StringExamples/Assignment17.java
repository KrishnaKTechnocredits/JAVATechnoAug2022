package akankshaSharma.StringExamples;

public class Assignment17 {

	String getReverse(String name) {
		String revNumber = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			revNumber = revNumber + name.charAt(index);
		}
		return revNumber;
	}

	String getEvenPosition(String name) {
		String revNumber = "";
		for (int index = 1; index < name.length(); index = index + 2) {
			revNumber = revNumber + name.charAt(index);
		}
		return revNumber;
	}

	String getEvenPositionReverse(String name) {
		String revNumber = "";
		for (int index = name.length() - 2; index > 0; index = index - 2) {
			revNumber = revNumber + name.charAt(index);
		}
		return revNumber;
	}

	int getCountOfDigit(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			if (Character.isDigit(name.charAt(index))) {
				count++;
			}
		}
		return count;
	}

	int getSumOfDigit(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		System.out.println(new Assignment17().getReverse("Akanksha") + "\n");
		System.out.println(new Assignment17().getEvenPosition("Technocredits")+ "\n");
		System.out.println(new Assignment17().getEvenPositionReverse("Technocredits")+"\n");
		System.out.println(new Assignment17().getCountOfDigit("Te8chno3cred7it9s")+"\n");
		System.out.println(new Assignment17().getSumOfDigit("Te8chno3cred7it9s")+"\n");
	}
}
