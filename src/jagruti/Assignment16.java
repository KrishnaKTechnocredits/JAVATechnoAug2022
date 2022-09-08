/*Assignment - 16 : 6th Sep'2022
// 1. write a method to return length of the given name
// int getNameLength(String name)
//2. return middle character from given name.
// Hint : char getMiddleChar(String name)
// input : Maulik
// output : Middle character in name Maulik is u
// input : Technocredits
// output : Middle character in name Technocredits is c
Note : 
Method name convention: 
1.int getNameLength(String name) : if method is returning any value except boolean, method name should start with get
2. boolean isPrimeNumber() : if method is returning boolean value, name should start with is
3. display() : if method is not returning anything, any name would be ok but dont just start it with get or is.
4. printInfo() : if method is prininting something, we can start method name with print keyword.*/
package jagruti;

public class Assignment16 
{
	int getNameLength(String name)
	{
		int length = name.length();
		return length;		
	}
	char getMiddleChar(String name) {
		int index = 0;
		int length = getNameLength(name);

		if (length % 2 == 0) {
			index = length / 2 - 1;
		} else {
			index = length / 2;
		}
		char ch = name.charAt(index);
		return ch;
	}
	public static void main(String[] args)
	{
		Assignment16 ass16 = new Assignment16();
		String inputString1 = "Jagruti";
		System.out.println();
		System.out.println("Length of " + inputString1 + " is: " + ass16.getNameLength(inputString1));
		System.out.println("Middle character in name " + inputString1 + " is: " + ass16.getMiddleChar(inputString1));
		System.out.println();

		String inputString2 = "Technocredits";
		System.out.println("Length of " + inputString2 + " is: " + ass16.getNameLength(inputString2));
		System.out.println("Middle character in name " + inputString2 + " is: " + ass16.getMiddleChar(inputString2));
	}
}
