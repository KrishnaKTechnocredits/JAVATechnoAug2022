/*
Write a method to print all pallindrome input from given array.

input : {"radar","techhpet","madam","maulikkilum"};
output : radar
         madam
*/

package namratamishra.assignment31;

public class PalendromeStringMultpleCheck {

	boolean getPalendromeStringMultpleCheck(String str) {
		boolean flag = true;
		for (int i = 0, j = str.length() - 1; i < j; i++, j--)

		{
			if (str.charAt(i) != str.charAt(j)) {
				flag = false;
				break;
			}

		}
		return flag;
	}

	public static void main(String[] args)

	{

		
		String[] str = { "techhpet", "madam", "maulikkilum", "radar" };

		PalendromeStringMultpleCheck ps = new PalendromeStringMultpleCheck();
		System.out.println("The  palendrome strings in given string array is");
		for (int i = 0; i < str.length; i++)

		{

			boolean flag = ps.getPalendromeStringMultpleCheck(str[i]);
			if (flag)
				System.out.println(str[i]);

		}

	}
}
