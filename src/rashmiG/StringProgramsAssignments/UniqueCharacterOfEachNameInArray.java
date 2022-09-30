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
  i*/

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
  i*/

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
  i*/

package rashmiG.StringProgramsAssignments;

class UniqueCharacterOfEachNameInArray {

	private int getCountOfUniqueCharacters(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				count++;
			}
		}
		return count;
	}

	private char[] getUniqueCharacter(String name) {

		int count = getCountOfUniqueCharacters(name);
		char[] output = new char[count];
		int outputIndex = 0;

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				output[outputIndex] = ch;
				outputIndex++;
			}
		}
		return output;
	}

	public void printUniqueCharacters(String[] input) {
		for (int index = 0; index < input.length; index++) {
			char[] output = getUniqueCharacter(input[index]);
			System.out.println("Name is " + input[index]);
			for (char ch : output) {
				System.out.println(ch);
			}
			System.out.println("------------------");
		}
	}

	public static void main(String[] args) {
		String[] input = { "Maulik", "Kanani", "Mahesh", "Kanani", "678uio67u","abc678","8989i0"};
		new UniqueCharacterOfEachNameInArray().printUniqueCharacters(input);
	}
}
