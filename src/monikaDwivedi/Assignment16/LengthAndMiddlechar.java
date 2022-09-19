// 1. write a method to return length of the given name
// int getNameLength(String name)

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
package monikaDwivedi.Assignment16;

public class LengthAndMiddlechar {
	String name;
	int getNameLength(String name) {
		int length = name.length();
		System.out.println("The length is - " + length);
		return length;
	}	
	void getMiddleChar(String name) {
		int len = name.length();
		if (len%2==0) {
			int middle = len/2-1;
			System.out.println("Middle char of "+name+" is "+ name.charAt(middle) );
		}else if (len%2!=0) {
			int middle = (len-1)/2;
			System.out.println("Middle char of "+name+" is "+ name.charAt(middle) );
		}
	}	
	public static void main(String[] args) {
		LengthAndMiddlechar lengthAndMiddlechar = new LengthAndMiddlechar();
		lengthAndMiddlechar.getNameLength("Monika");		
		lengthAndMiddlechar.getMiddleChar("Monika");
		
		lengthAndMiddlechar.getNameLength("AJINOMOTO");		
		lengthAndMiddlechar.getMiddleChar("AJINOMOTO");
	}
}
