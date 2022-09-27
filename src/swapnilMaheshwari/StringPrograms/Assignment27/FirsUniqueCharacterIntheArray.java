/*Program - 2.  Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n 
 */

package swapnilMaheshwari.StringPrograms.Assignment27;

public class FirsUniqueCharacterIntheArray {
	void getFirstUniqueChar(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			System.out.println("Name is : " + str);
			for (int j = 0; j < str.length(); j++) {
				char ch = str.charAt(j);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) 
				{
					System.out.println(ch);
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		String[] str = { "Maulik", "Swapnil", "aakansha", "KananiK" };
		new FirsUniqueCharacterIntheArray().getFirstUniqueChar(str);
	}

}
