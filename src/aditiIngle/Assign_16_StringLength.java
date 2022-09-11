package aditiIngle;

public class Assign_16_StringLength {

	int getNameLength(String name) {
		int length = 0;
		length = name.length();
		return length;
	}
	
	char getMiddleChar(String name) {
		int length =0;
		int index =0;
		length = name.length();
		if(length %2==0) {
			index = length/2 -1;
		}
		else {
			index = length/2;
		}
		return name.charAt(index);
	}
	
	public static void main(String[] args) {
		String str = "Aditi";
		Assign_16_StringLength assign_16_StringLength_1 = new Assign_16_StringLength();
		int length = assign_16_StringLength_1.getNameLength(str);
		System.out.println("Length of given string is "+length);
		
		String str_1 = "Technocredits";
		String str_2 = "Maulik";
		Assign_16_StringLength assign_16_StringLength_2 = new Assign_16_StringLength();
		char ch = assign_16_StringLength_2.getMiddleChar(str_1);
		System.out.println("Middle Character of "+str_1+" string is "+ ch);
	    ch = assign_16_StringLength_2.getMiddleChar(str_2);
	    System.out.println("Middle Character of "+str_2+" string is "+ ch);
	}
	
}
