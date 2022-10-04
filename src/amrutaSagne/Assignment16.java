package amrutaSagne;

public class Assignment16 {

	int getNameLength(String str) {

		int strLength = str.length();
		return strLength;
	}

	char getMiddleChar(String str) {

		int strIndex = 0;
		int strLength = getNameLength(str);

		if (strLength % 2 == 0)
			strIndex = strLength / 2 - 1;
		else
			strIndex = strLength / 2;

		return str.charAt(strIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment16 assignment16 = new Assignment16();

		String inputString = "Amruta";
		char result = assignment16.getMiddleChar(inputString);
		System.out.println("\nInput String - " + inputString);
		System.out.println("Length: " + assignment16.getNameLength(inputString));
		System.out.println("Middle character: " + result);

		String inputString1 = "Technocredits";
		char result1 = assignment16.getMiddleChar(inputString1);
		System.out.println("Input String - " + inputString1);
		System.out.println("Length: " + assignment16.getNameLength(inputString1));
		System.out.println("Middle character: " + result1);

	}

}
