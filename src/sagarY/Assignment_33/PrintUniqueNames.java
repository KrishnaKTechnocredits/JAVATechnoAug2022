/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/

package sagarY.Assignment_33;
class PrintUniqueNames {

	void printUniqueNames(String[] input) {
		System.out.println("Output: ");

		for (int i = 0; i < input.length; i++) {
			if (input[i] != "") {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i].equals(input[j]) && i != j) {
						input[j] = "";
					}
				}
				System.out.println(": " + input[i]);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Program 5 : Print all names \nones from given array.");
		System.out.println("----------------------------");
		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		new PrintUniqueNames().printUniqueNames(input);
	}

}