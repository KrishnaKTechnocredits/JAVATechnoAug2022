
/*Write a method to return word having maximum uppercase.

String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
output : FR3ienDs
*/

package namratamishra.stringOperations;

public class ArrayWordsHavingMaxUpperCase {
	void getArrayWordsHavingMaxUpperCase(String[] brr) {

		// int max = brr[0].length();
		// String maxUpperCaseWord = brr[0];
		String maxUpperCaseWord = "";
		int max = 0;
		for (int i = 0; i < brr.length; i++)
		{
			int count = 0;
			for (int index = 0; index < brr[i].length(); index++)
			{

				char ch = brr[i].charAt(index);
				if (Character.isUpperCase(ch))

					count++;

			}
			if (count > max) 
			{
				max = count;
				maxUpperCaseWord = brr[i];
			}
		}
		System.out.println(maxUpperCaseWord);
	}

	public static void main(String[] args) {
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		String[] arr = input.split(" ");
		ArrayWordsHavingMaxUpperCase awhmuc = new ArrayWordsHavingMaxUpperCase();
		awhmuc.getArrayWordsHavingMaxUpperCase(arr);

	}
}
