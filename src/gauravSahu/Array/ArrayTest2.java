package gauravSahu.Array;

public class ArrayTest2 {

	char[] getMiddleCharacterOfString(String[] name) {
		char[] ch = new char[name.length];

		for (int index = 0; index < name.length; index++) {
			int length = name[index].length();
			if (length % 2 == 0) {
				ch[index] = name[index].charAt(length / 2 - 1);
			} else {
				ch[index] = name[index].charAt(length / 2);
			}
		}
		return ch;
	}

	public static void main(String[] arg) {

		ArrayTest2 midchar2 = new ArrayTest2();
		String[] a = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char[] result = new char[a.length];
		result = midchar2.getMiddleCharacterOfString(a);
		for (int index = 0; index < a.length; index++) {
			String output2 = a[index] + " " + result[index];
			System.out.println("Middle char " + output2);
		}
	}

}
