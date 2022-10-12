//program 5 : print unique names from given array. 
//input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
//output : Hi
//         Hello
//		 Techno
//		 Credits
package maheshSantoki.SpecialInterview;

import java.util.Arrays;

public class UniqeNames {
	void uniqueNames(String[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] != "") {
				for (int j = i + 1; j < input.length; j++) {
					if (input[i].equals(input[j]) && i != j) {
						input[j] = "";
					}
				}
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		UniqeNames uniqname = new UniqeNames();
		String input[] = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("Given Array : " + Arrays.toString(input) + "\n" + "Unique Names : ");
		uniqname.uniqueNames(input);
	}
}
