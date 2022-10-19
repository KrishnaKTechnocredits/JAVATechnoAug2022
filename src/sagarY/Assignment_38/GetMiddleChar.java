/*Program 3 : Return list of Middle character from given name if length of the name is more than 6 characters.

input : {"Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"}
output : ['j','n']
*/

package sagarY.Assignment_38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMiddleChar {

	ArrayList<String> getMiddleChar(ArrayList<String> listOfNames) {
		ArrayList<String> output = new ArrayList<String>();

		for (int index = 0; index < listOfNames.size(); index++) {
			char ch = 'a';
			String name = listOfNames.get(index);
			
			if (name.length() > 6) {
				if (name.length() % 2 == 0)
					ch = name.charAt(name.length() / 2 - 1);
				else
					ch = name.charAt(name.length() / 2);

				output.add(Character.toString(ch));
			}
		}

		return output;

	}

	public static void main(String[] args) {
		System.out.println("Program 3 : Return list of Middle character from given \nname if length of the name is more than 6 characters.");
		System.out.println("----------------------------------------------------------");
		String[] arrayString = { "Manjiri", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak" };
		List<String> arr = Arrays.asList(arrayString);
		ArrayList<String> listOfNames = new ArrayList<String>(arr);
		System.out.println("Input: " + listOfNames);
		ArrayList<String> output = new GetMiddleChar().getMiddleChar(listOfNames);
		System.out.println("Output is: "+output);
	}
}
