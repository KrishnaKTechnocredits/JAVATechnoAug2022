//Assignment 16(1) 6th Sep
// 1. write a method to return length of the given name
// int getNameLength(String name)

package shivaniLikhia;

public class LengthOfName {
	
	static int getNameLength(String name) {
		int length = name.length();
		return length;
	}
	public static void main(String[] args) {
		String name = "Shivani Likhia";
		System.out.println("The length of the given name is : " +name.length());
	}
}