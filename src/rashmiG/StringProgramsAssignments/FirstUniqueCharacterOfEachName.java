/*Assignment-27 : 23rd Sep'2022

Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n */

package rashmiG.StringProgramsAssignments;

class FirstUniqueCharacterOfEachName {

	void printFirstUniqueCharacterOfName(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.println("Name is " + name + " : " + ch);
				System.out.println("--------------------------");
				break;
			}
		}
	}

	void printFirstUniqueCharOfNamesInArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			printFirstUniqueCharacterOfName(input[index]);
		}
	}

	public static void main(String[] args) {

		String[] arr = { "Maulik", "KananiK", "akanksha" ,"9090","7897i0oo"};
		new FirstUniqueCharacterOfEachName().printFirstUniqueCharOfNamesInArray(arr);
	}
}