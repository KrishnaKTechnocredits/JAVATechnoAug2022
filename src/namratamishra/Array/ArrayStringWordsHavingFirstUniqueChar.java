/* Write a program to print 1st unique character of each name in given string array.
 
 String[] arr = {"Maulik", "KananiK", "akanksha"};
 
 Name is Maulik : M
 -------------------
 Name is KananiK : i
 -------------------
 Name is akanksha : n 
*/
package namratamishra.Array;

public class ArrayStringWordsHavingFirstUniqueChar {

	void getArrayStringWordsHavingUniqueChar(String[] str) {
		for (int i = 0; i < str.length; i++) {
			String uniqueCheck = str[i];
			// System.out.println("Name is " + str[i]);

			for (int j = 0; j < uniqueCheck.length(); j++)

			{
				char ch = uniqueCheck.charAt(j);
				int count = 0;
				for (int k = 0; k < uniqueCheck.length(); k++) {

					if (k != j && ch == uniqueCheck.charAt(k)) {
						count++;

					}
				}

				if (count == 0) {
					System.out.println("Name is " + str[i] + " ......>" + ch);
					System.out.println("------------------------------------");
					break;
				}
			}

		}
	}

	public static void main(String[] args) {
		String[] arr = { "Maulik", "KananiK", "akanksha" };
		ArrayStringWordsHavingFirstUniqueChar ashuc = new ArrayStringWordsHavingFirstUniqueChar();
		ashuc.getArrayStringWordsHavingUniqueChar(arr);

	}
}
