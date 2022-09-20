package nikeshM.ReturnTypeNikesh;

public class DigitCount {

	int getDigitCount(String name) {
		int length = name.length();
		int count = 0;
		int range = 2;
		for (int index = 0; index <= length; index++) {
			if (index % range == 0) {
				char ch = name.charAt(index);
				boolean isDigiFlag = Character.isDigit(ch);
				if (isDigiFlag) {
					count++;
					System.out.println("No Of Digit Are" + count);
				}
			}

		}
		return length;
	}

	public static void main(String[] args) {
		DigitCount count = new DigitCount();
		count.getDigitCount("ni1k3e4shr6");
	}
}
