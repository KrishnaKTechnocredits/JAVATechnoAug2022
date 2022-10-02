/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : hello
         ptc*/

package manjiri.arrayEx.assignment33;

public class DuplicateNames {
	
	void printDuplicateNames(String[] input) {
		for(int index = 0; index < input.length; index++) {
			boolean flag = false;
			for(int innerIndex = index+1; innerIndex < input.length; innerIndex++) {
				if(input[index].equalsIgnoreCase(input[innerIndex])) {
					input[innerIndex] = "";
					flag = true;
				}
			}
			if (flag) {
				System.out.println(input[index].toLowerCase());
			}
		}
	}
	
	public static void main(String[] args) {
		String[] inputArr = {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
		new DuplicateNames().printDuplicateNames(inputArr);
	}

}
