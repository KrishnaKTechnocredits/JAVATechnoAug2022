package pujaSah.assignments20_30;

public class NoDigitsAndUpperCase {

	void displayWordsWithNoDigitsAndUpperCase(String inStr) {
		String[] outArr = inStr.split(" ");
		for (int i = 0; i < outArr.length - 1; i++) {
			boolean flag = true;
			for (int j = 0; j <= outArr[i].length() - 1; j++) {
				if (Character.isDigit(outArr[i].charAt(j)) || Character.isUpperCase(outArr[i].charAt(j))) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(outArr[i]);
			}
		}
	}

	public static void main(String[] args) {
		NoDigitsAndUpperCase obj = new NoDigitsAndUpperCase();

		String inStr = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println("Input String: " + inStr);

		System.out.println("Words with no Digits and Upper case are : " + "\n");
		obj.displayWordsWithNoDigitsAndUpperCase(inStr);
	}
}
