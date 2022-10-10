/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/

package gauravSahu;

import java.util.Arrays;

public class Assignment33E {

	void getUniqueString(String[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean flag = true;
			for (int j = 0; j < input.length; j++) {
				if (input[i].toLowerCase().equals(input[j].toLowerCase()) && i != j) {
					flag = false;
					break;
				}
			}if(flag) {
				System.out.println("Unique String : " + input[i]);
			}
		
		}
	}

	public static void main(String[] args) {
		Assignment33E a33 = new Assignment33E();
		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		System.out.println("Given string : " + Arrays.toString(input));
		a33.getUniqueString(input);
	}

}
