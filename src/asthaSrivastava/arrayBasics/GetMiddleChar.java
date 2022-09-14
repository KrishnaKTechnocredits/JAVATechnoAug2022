/*Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h*/
package asthaSrivastava.arrayBasics;

public class GetMiddleChar {

	char getMiddleChar(String str) {
		str.length();
		char ch = ' ';
		if (str.length() % 2 == 0) {
			ch = str.charAt(str.length() / 2 - 1);
		} else {
			ch = str.charAt(str.length() / 2);
		}
		return ch;

	}

	public static void main(String[] args) {
		GetMiddleChar arryOp1 = new GetMiddleChar();
		String[] output = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };

		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index] + "-> " + arryOp1.getMiddleChar(output[index]));
		}
	}

}
