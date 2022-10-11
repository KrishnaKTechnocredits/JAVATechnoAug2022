/* Assignment-27 : 23rd Sep'2022
  1. Write a program to print unique character of each name in given string array.
 
 String[] arr = {"Maulik", "Kanani","Mahesh", "Kanani"};
  
  Name is Maulik :
  M
  a
  u
  l
  i
  k
  ----------------------
  Name is Kanani : 
  K
  I
*/

package namratamishra.Array;
public class ArrayStringWordsHavingUniqueChar 
{

	void getArrayStringWordsHavingUniqueChar(String[] str)
	{
		for (int i = 0; i < str.length; i++)
		{
			String uniqueCheck = str[i];
			System.out.println("Name is " + str[i]+":");

			for (int j = 0; j < uniqueCheck.length(); j++)

			{
				char ch = uniqueCheck.charAt(j);
				int count = 0;
				for (int k = 0; k < uniqueCheck.length(); k++)
				{

					if (k != j && ch == uniqueCheck.charAt(k))
					{
						count++;
					}
				}
				if (count == 0)
					System.out.println(ch);
			}

		}

	}

	public static void main(String[] args) {
		String[] arr = { "Maulik", "Kanani", "Mahesh", "Kanani" };
		ArrayStringWordsHavingUniqueChar ashuc = new ArrayStringWordsHavingUniqueChar();
		ashuc.getArrayStringWordsHavingUniqueChar(arr);

	}
}
