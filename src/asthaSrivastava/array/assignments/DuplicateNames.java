/*program 4: print duplicate names from given array (do not consider case sensitivity). 
input : {"Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc","Hello"};
output : Hello
         ptc*/
package asthaSrivastava.array.assignments;

public class DuplicateNames {

	void printDuplicateNames(String[] arr) {
		System.out.println("Duplicate Name are :");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					arr[j] = "";
					count++;
				}
			}
			if (count > 1 && (!arr[i].equals(""))) {
				System.out.println(arr[i]);
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNames dupName = new DuplicateNames();
		String[] arr = { "Hi", "HELLO", "Techno", "Globant", "ptc", "Ptc", "Hello" };
		dupName.printDuplicateNames(arr);
	}
}
