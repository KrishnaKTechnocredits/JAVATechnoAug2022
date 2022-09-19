package shubhamG;

/*
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h
*/
public class Test3Program2 {

	char[] getMiddleCharFromName(String[] arr) {
		int totalLength = arr.length;
		System.out.println("Middle Characters from strings are as follows- \n");
		char[] ch = new char[totalLength];
		for (int i = 0; i < totalLength; i++) {

			if (arr[i].length() % 2 == 0) {
				ch[i] = arr[i].charAt((arr[i].length() / 2) - 1);
			} else {
				ch[i] = arr[i].charAt((arr[i].length() / 2));
			}
			System.out.println(arr[i] + " -> " + ch[i]);
		}
		return ch;
	}

	public static void main(String[] args) {
		Test3Program2 test3Program2 = new Test3Program2();

		String[] str1 = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		test3Program2.getMiddleCharFromName(str1);
	}
}
