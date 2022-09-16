/*
 * Program 4: Write a method to print all the words having no digits and uppercase.
String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
output : techno
         is
 */
package harshalRane.Assignments.assignment23;

public class Assignment23Program4 {
	int upper = 0;
	int lower = 0;
	int digit = 0;
	
	boolean isDigit(String input) {
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch) || Character.isUpperCase(ch))
				return false;	
		}
		return true;
	}
	
	void printWordWithLowerCase(String input) {
		String[] arr = input.split(" ");
		for(int index=0;index<arr.length;index++) {
			boolean flag = isDigit(arr[index]);
			if(flag) {
				System.out.println(arr[index]);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment23Program4 p4 = new Assignment23Program4();
		String input = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		System.out.println(input);
		p4.printWordWithLowerCase(input);
	}
}
