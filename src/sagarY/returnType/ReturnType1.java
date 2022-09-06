/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c  */

package sagarY.returnType;

public class ReturnType1 {

	static String name="";
	
	int getNameLength(String name) {
		this.name=name;
		System.out.println("Given String is : " + name);
		System.out.print("Length of the String" + name+ " is : \n");
		return (name.length());
	} 

	char getMiddleChar(String name1) {
		name1=this.name;
		if (name.length() % 2 != 0) {
			System.out.print("\nMiddle char of the String is : ");
			return (name.charAt(name.length() / 2));
		} else {
			System.out.print("\nMiddle char of the String is: ");
			return (name.charAt(name.length() / 2 - 1));
		}
	}

	public static void main(String[] args) {
		ReturnType1 return1 = new ReturnType1();
		int length = return1.getNameLength("ILoveJavaAndTechnoCredits");
		System.out.print(length);
		char ch = return1.getMiddleChar(name);
		System.out.print(ch);
	}
}
