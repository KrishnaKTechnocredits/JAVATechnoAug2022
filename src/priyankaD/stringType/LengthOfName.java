//Assignment16
package priyankaD.stringType;
//Assignment_16
//1. write a method to return length of the given name
//int getNameLength(String name)

public class LengthOfName {
	void getLength(String name) {
	int length=name.length();
	System.out.println(length);
	}
	public static void main(String[]args) {
		new LengthOfName().getLength("Technocredits");
	}
}
