//5) Write a method to print middle character of all array elements.
//input : {"Ashish","Aditty","Manjiri","Ankita"}
//output : Ashish -> h
//        Aditty -> i
//		 Manjiri -> j
//		 Ankita -> k

package shivaniLikhia;

public class FindMiddleCharInArray {

	char middleCharacter(String str) {
		char middleChar;
			if(str.length()%2==0) {
				middleChar = str.charAt(str.length()/2-1);
			}
			else {
				middleChar = str.charAt(str.length()/2);
			}
		return middleChar;
	}
	
	void middleCharOfArray(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			char ch = middleCharacter(arr[i]);
			System.out.println("Middle Character of the String "  +arr[i]+ " is : " +ch);
		}
	}
	public static void main(String[] args) {
		String[] arr1 = {"Ashish","Aditty","Manjiri","Ankita"};
		new FindMiddleCharInArray().middleCharOfArray(arr1);
	}
}
