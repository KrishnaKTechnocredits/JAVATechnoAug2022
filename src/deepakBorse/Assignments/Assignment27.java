/*Assignment-27 : 23rd Sep'2022
 
Program - 1. Write a program to print unique character of each name in given string array.
 
 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
  
  Name is Maulik :
  M
  a
  u
  l
  i
  k
  ----------------------
  Name is Kanani : 
  K
  i

Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"}; 
 */

package deepakBorse.Assignments;

public class Assignment27 {

	//Program - 1. Write a program to print unique character of each name in given string array.
	void getuniqueCharacter(String str) {

		System.out.println("Unique characters from " + str);
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int firstindex = str.indexOf(ch);
			int lastindex = str.lastIndexOf(ch);

			if (firstindex == lastindex) {
				System.out.println(ch);
			}
		}

	}

	//Program - 2.  Write a program to print 1st unique character of each name in given string array.
	void getfirstuniqueCharacter(String input) {

		System.out.println("First unique character from string " + input + " is");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int firstindex = input.indexOf(ch);
			int lastindex = input.lastIndexOf(ch);

			if (firstindex == lastindex) {
				System.out.println(ch);
				break;
			}
		}

	}

	void printuniquecharcter(String[] input) {
		for (int index = 0; index < input.length; index++) {
			getuniqueCharacter(input[index]);
			// getfirstuniqueCharacter(input[index]);
		}
	}

	void printFirstuniquecharcter(String[] input) {
		for (int index = 0; index < input.length; index++) {
			getfirstuniqueCharacter(input[index]);
		}
	}

	public static void main(String[] args) {

		Assignment27 Assignment = new Assignment27();
		String[] input = { "Maulik", "Kanani", "Mahesh", "Deepak" };
		Assignment.printuniquecharcter(input);
		String[] input2 = { "Maulik", "KananiK", "akanksha" };
		Assignment.printFirstuniquecharcter(input2);

	}
}