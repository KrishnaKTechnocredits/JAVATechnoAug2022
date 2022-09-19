/*Assignment - 16 : 6th Sep'2022

// 1. write a method to return length of the given name
// int getNameLength(String name)


//2. return middle character from given name.
// Hint : char getMiddleChar(String name)

// input : Maulik
// output : Middle character in name Maulik is u

// input : Technocredits
// output : Middle character in name Technocredits is c*/

package chaitanyaMankar;

public class StringReturn 
{
	int getNameLength(String str)
	{
		int length = str.length();
		return(length);
	}

	char getMiddleChar(String str)
	{
		int length = str.length();
		int index = 0;
		
		if(length % 2 ==0)
		{
			index = length/2 - 1;
		}
		else if(length % 2 !=0)
		{
			index = length/2;
		}
		return str.charAt(index);
		
	}
	public static void main(String[] args) 
	{
		StringReturn stringreturn = new StringReturn();
		
		int length = stringreturn.getNameLength("Maulik");
		System.out.println("String Length: "+length);
		char c = stringreturn.getMiddleChar("Maulik");
		System.out.println("Char: "+c);
		char c1 = stringreturn.getMiddleChar("TechnoCredits");
		System.out.println("Char: "+c1);
	}

}
