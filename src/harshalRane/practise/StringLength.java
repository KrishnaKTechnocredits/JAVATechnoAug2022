package harshalRane.practise;

public class StringLength {
	static int getLength(String str) {
		int length = str.length();
		return length;
	}
	
	static int getIndex(String str) {
		int index = 0;
		int length = getLength(str);
		
		if(length%2==0) {
			index = length / 2 - 1;
		}else {
			index = length / 2;
		}
		return index;
	}
	
	static char getChar(String str) {
		int index = getIndex(str);
		char ch = str.charAt(index);
		return ch;
	}
	
	public static void main(String[] args) {
		String input = "Maulik";
		
		System.out.println("Length of Given String "+input+" is: "+ StringLength.getLength(input));
		System.out.println("Index of Given String "+input+" is: " +StringLength.getIndex(input));
		System.out.println("Middle Character of Given String "+input+" is: " +StringLength.getChar(input));
	}
}
