/*
Assignment - 16 : 6th Sep'2022

1. write a method to return length of the given name
int getNameLength(String name)


2. return middle character from given name.
Hint : char getMiddleChar(String name)

input : Maulik
output : Middle character in name Maulik is u

input : Technocredits
output : Middle character in name Technocredits is c

Note : 
Method name convention:  

1.int getNameLength(String name) : if method is returning any value except boolean, method name should start with get
2. boolean isPrimeNumber() : if method is returning boolean value, name should start with is
3. display() : if method is not returning anything, any name would be ok but dont just start it with get or is.
4. printInfo() : if method is prininting something, we can start method name with print keyword.
*/
package pankajBhatt;

public class Assignment15_6_Sep2022 {
	
	int getNameLength(String name) {
		return name.length();
	}
	
	char getMiddleChar(String name) {
		if ( getNameLength(name) % 2 == 0) {
			return name.charAt(name.length() / 2 - 1);
		}
		else {
			return name.charAt(name.length() / 2);
		}
	}

	public static void main(String[] args) {
		Assignment15_6_Sep2022 assignment15_6_Sep2022 = new Assignment15_6_Sep2022();
		System.out.println(assignment15_6_Sep2022.getNameLength("Pankaj Bhatt"));
		System.out.println(assignment15_6_Sep2022.getMiddleChar("Technocredits"));

	}

}
