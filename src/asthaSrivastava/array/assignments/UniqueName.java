/*program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits*/
package asthaSrivastava.array.assignments;

public class UniqueName {
	// method to print Unique Name
	void printUniqueName(String[] arr) {
		System.out.println("Unique names are :");
		for (int i = 0; i < arr.length; i++) {
			String name = arr[i];
			boolean flag = true;
			for (int j = i + 1; j < arr.length; j++) {
				if (name.equals(arr[j]) && i != j) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		String[] input = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		new UniqueName().printUniqueName(input);
	}
}
