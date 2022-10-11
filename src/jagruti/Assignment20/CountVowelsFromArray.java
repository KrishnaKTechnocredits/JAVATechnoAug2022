/*Write a method to count vowels of each name in given array.
input : {"Ashish","Aditty","Manjiri","Ankita"}
output : Ashish -> 2
         Aditty -> 2
		 Manjiri -> 3
		 Ankita -> 3
*/
package jagruti.Assignment20;

public class CountVowelsFromArray
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
	int [] getCountOfVowelsFromArray(String[] name)
	{
		int[] output = new int[name.length];
		for (int index=0; index<name.length; index++)
		{
			output[index] = getCountOfVowels(name[index]);
		}
		return output;
	}
	public static void main(String[] args)
	{
		CountVowelsFromArray countOfVowels = new CountVowelsFromArray();
		String[] input = {"Ashish","Aditty","Manjiri","Ankita"};
		int[] output = countOfVowels.getCountOfVowelsFromArray(input);
		countOfVowels.display(input, output);
		
	}
	private void display(String[] name, int[] output) 
	{		
		for (int index=0; index<name.length; index++)
		{
			System.out.println(name[index] + "------>" + output[index]);
		}
		
	}
}
