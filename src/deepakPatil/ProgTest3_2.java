/*Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Harshal -> s
              Aditty -> i
              Rahul -> h
*/
package deepakPatil;

public class ProgTest3_2 {

	char getMiddleChar(String name) {
		int nameLength = name.length();
		char middleChar;
		if (nameLength % 2 == 0)
			middleChar = name.charAt(nameLength / 2 - 1);
		else
			middleChar = name.charAt(nameLength / 2);

		return middleChar;
	}
	
	char[] getMiddleCharFromArrayString(String[] arr){
		char[] middleChar= new char[arr.length];
		for(int i=0; i<arr.length;i++) {
			middleChar[i]=getMiddleChar(arr[i]);
		}
		return middleChar;		
	}

	public static void main(String[] args) {
		String[] names = { "Mahesh", "Avni", "Puja", "Harshal", "Aditty", "Rahul" };
		char []output= new ProgTest3_2().getMiddleCharFromArrayString(names);
		System.out.println("**Middle Character**");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + "->" + output[i]);
		}
	}
}
