/*5) Write a method to print middle character of all array elements.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> h
         Aditty -> i
		 Manjiri -> j
		 Ankita -> k
		 /*/

package akankshaVyas.Arraypkg;

public class MiddleCharacterOfArray {

	char getMiddleCharacterOfString(String str) {
		int index = 0;
		if (str.length() % 2 == 0) {
			index = str.length()/ 2 - 1;
		} else  {
			index = str.length() / 2;
		}
		char mid = (str.charAt(index));
		return mid;

	}

	void getMiddleCharatcerOfArray(String[] arr) {
		String str = "";
		for (int index = 0; index < arr.length; index++) {
			str = arr[index];
			char ch = getMiddleCharacterOfString(str);
			System.out.println(arr[index] + "->" + ch);
		}
	}

	public static void main(String[] args) {
		String[] arr = { "Ashish", "Aditty", "Manjiri", "Ankita" };
		new MiddleCharacterOfArray().getMiddleCharatcerOfArray(arr);
	}
}
