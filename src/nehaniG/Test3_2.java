package nehaniG;

public class Test3_2 {

	char getMiddleCharacter(String name) {
		int length = name.length();
		int index = 0;
		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		return name.charAt(index);
	}

	char[] getMiddleCharFromName(String[] arr) {
		char[] middleCharArray = new char[arr.length];
		for (int index = 0; index < arr.length; index++) {
			middleCharArray[index] = getMiddleCharacter(arr[index]);
		}
		return middleCharArray;
	}

	public static void main(String[] args) {
		Test3_2 test3_2 = new Test3_2();

		String[] name = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] charArray = test3_2.getMiddleCharFromName(name);
		for(int i = 0; i < charArray.length; i++) {
			System.out.println(name[i] + "->" + charArray[i]);
		}

	}

}
