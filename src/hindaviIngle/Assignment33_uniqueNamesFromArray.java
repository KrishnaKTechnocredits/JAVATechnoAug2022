/*
 * program 5 : print unique names from given array. 
input : {"Hi", "Hello", "Hello","Techno","Credits","Techno"};
output : Hi
         Hello
		 Techno
		 Credits
 */

package hindaviIngle;

public class Assignment33_uniqueNamesFromArray {

	void printUniqueNames(String[] arry) {
		for (int i = 0; i < arry.length; i++) {
			int count = 0;
			if (!arry[i].equals("")) {
				String str1 = arry[i].toLowerCase();
				for (int j = i + 1; j < arry.length; j++) {
					String str2 = arry[j].toLowerCase();
					if (str1.equals(str2) && i != j) {
						count++;
						arry[j] = "";
					}
				}
				if (count == 0) {
					System.out.println(arry[i]);
				}
			}
		}
	}

	// Alternate way
	void printUniqueNames1(String[] arry) {
		for (int i = 0; i < arry.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arry.length; j++) {
				if (arry[i].equals(arry[j]) && i != j) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Unique " + arry[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_uniqueNamesFromArray a = new Assignment33_uniqueNamesFromArray();
		System.out.println("print unique names from given array");
		String[] strArry = { "Hi", "Hello", "Hello", "Techno", "Credits", "Techno" };
		 a.printUniqueNames(strArry);
		//a.printUniqueNames1(strArry);
	}

}
