/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c
*/

package deepakPatil;

public class StringClassExample {
	
	int getNameLength(String name) {
		return name.length();
	}
	
	char getMiddleChar(String name) {
		char middleChar;
		if(name.length()%2==0)
			middleChar=name.charAt(name.length()/2-1);
		else
			middleChar= name.charAt(name.length()/2);
		
		return middleChar;
	}
	
	public static void main(String[]args) {
		StringClassExample stringClassExample=new StringClassExample();
		String name="DeepakP";
		System.out.println("Length of name "+name+" is "+ stringClassExample.getNameLength(name));
		System.out.println("Middle character in name "+name+" is "+ stringClassExample.getMiddleChar(name));
		
		name="Technocredits";
		System.out.println("\nLength of name "+name+" is "+ stringClassExample.getNameLength(name));
		System.out.println("Middle character in name "+name+" is "+ stringClassExample.getMiddleChar(name));		
	}
}
