/*
 program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
 */

package swapnilMaheshwari.ArrayPrograms.Assignment33;

public class AllUnquieNameOnce {
	void printAllUnquieNameonce(String[] arr) {
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j]) && i != j) {
					flag = false;
					break;
				}
			}
			if (flag)
				System.out.println(arr[i]);
			flag = true;
		}
	}

	public static void main(String[] args) {
		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		new AllUnquieNameOnce().printAllUnquieNameonce(input);
	}
}
