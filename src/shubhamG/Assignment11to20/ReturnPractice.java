package shubhamG.Assignment11to20;

/*Assignment - 16 : 6th Sep'2022

//1. write a method to return length of the given name
//int getNameLength(String name)


//2. return middle character from given name.
//Hint : char getMiddleChar(String name)
*/
public class ReturnPractice {

	int getNameLength(String name) {
		return (name.length());
	}

	char getMiddleChar(String middle) {
		int size = middle.length();
		int index = 0;
		if (size % 2 == 0)
			index = (size / 2 - 1);
		else
			index = (size / 2);
		return (middle.charAt(index));
	}

	public static void main(String[] args) {
		ReturnPractice returnPractice = new ReturnPractice();

		System.out.println("Total length of string is " + returnPractice.getNameLength("Shubham"));
		System.out.println("\nMiddle character of string is " + returnPractice.getMiddleChar("Shubham"));
		System.out.println("\nMiddle character of string is " + returnPractice.getMiddleChar("Maulik"));
	}
}
