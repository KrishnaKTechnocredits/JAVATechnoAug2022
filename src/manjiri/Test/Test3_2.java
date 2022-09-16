/*Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h*/

package manjiri.Test;

public class Test3_2 {

	char[] getMiddleCharOfEachElement(String[] input) {
		char[] ch = new char[input.length];
		
		for (int index = 0; index < input.length; index++) {
			int length = input[index].length();
			if (length % 2 == 0) {
				ch[index] = input[index].charAt(length/2-1);
			}
			else {
				ch[index] = input[index].charAt(length/2);
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		Test3_2 test32 = new Test3_2();
		String[] stringArray = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] result = new char[stringArray.length];
		result = test32.getMiddleCharOfEachElement(stringArray);
		for (int index = 0; index < stringArray.length; index++) {
			System.out.println(stringArray[index] +" "+"-> "+ result[index]);
		}		
	}
}
