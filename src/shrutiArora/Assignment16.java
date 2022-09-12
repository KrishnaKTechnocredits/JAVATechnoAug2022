/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c*/
package shrutiArora;
public class Assignment16 {
	int getNameLength(String name) {
		int length = name.length();
		return length;
	}
	char getMiddleChar(String name) {
		int length = name.length();
		int index = 0;
		if(length%2==0) 
			 index = (length/2)-1;
		else 
			index = length/2;
		System.out.println("input: " + name);
		System.out.println("Output: ");
		return name.charAt(index);
	}
	public static void main(String[]args) {
		Assignment16 assignment16 = new Assignment16();
		String input = "Maulik";
		String name = "Technocredits";
		System.out.println("****************************Program to return length of string**************************");
		System.out.println("input: " + name);
		int ans = assignment16.getNameLength(name);
		System.out.println("Output: " + ans);
		System.out.println("****************************Program to return middle character of string**************************");
		System.out.println(assignment16.getMiddleChar(input));
		System.out.println(assignment16.getMiddleChar(name));
	}
}