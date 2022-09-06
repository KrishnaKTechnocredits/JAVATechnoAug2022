package technocredits.returntype;

// 1. write a method to return length of the given name
// int getNameLength(String name) : if method is returning any value except boolean, method name should start with get
// boolean isPrimeNumber() : if method is returning boolean value, name should start with is
// display() : if method is not returning anything, any name would be ok but dont just start it with get or is.
// printInfo() : if method is prininting something, we can start method name with print keyword.

//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c

// Note : Method name convention when it returns value.
//
public class Example2 {

	char m1(String str) {
		int length = str.length();
		int index = 0;
		if(length % 2 == 0) {
			index = length/2 -1;
		}else {
			index = length/2;
		}
		return str.charAt(index);
	}
	
	
	public static void main(String[] args) {
		String str = "Technocredits";
		System.out.println(str.length());
		
		str = "maulik"; // u
		int index = str.length()/2-1; // 3
		char ch = str.charAt(2);
		System.out.println(ch);
	}
}
