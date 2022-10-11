/*Return count of vowels in a given String.
input : maulik
output : 3
*/
package jagruti.Assignment20;
public class CountOfVowels 
{
	
	int getCountOfVowels(String name)
	{
		int count = 0;
		name = name.toLowerCase();
		for (int index=0; index<name.length();index++)
		{
			if(name.charAt(index)=='a' || name.charAt(index)=='e' ||
					name.charAt(index)=='i' || name.charAt(index)=='o' || 
					name.charAt(index)=='u')
				count++;
		}
		return count;		
	}
	public static void main(String[] args)
	{
		CountOfVowels countOfVowels = new CountOfVowels();		
		System.out.println("Number of vowels in given string : "+countOfVowels.getCountOfVowels("maulik"));
	}

}
