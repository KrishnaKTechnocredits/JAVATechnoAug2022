/*Assignment - 17 : 7th Sep'2022

Program 1 : Write a method to return reverse name
input : Maulik
output : kiluaM

Program 2 : Write a method to return even position characters from given String. 
input : technocredits
output : ehordt

Program 3 : Write a method to return even position characters from given String in reverse.
input : technocredits
output : tdrohe

Program 4 : Write a method to return count of digits in a given string.
input : "Te8chno3cred7it9s"
output : 4

Program 5 : Write a method to return sum of digits in a given string.
input : "Te8chno3cred7it9s"
output : 27
Hint : ch = Character.charAt(index);
Character.isDigit(ch);
int num = Character.getNumericValue(ch); '9'*/

package chaitanyaMankar.String;

public class StringOperations 
{
	String reverseName(String Name)
	{
		String rName = "";
		for(int i = Name.length()-1;i>=0;i--)
		{
			rName = rName + Name.charAt(i);
		}
		return rName;
	}
	
	String evenPosition(String Name)
	{
		String rName = "";
		for(int i=0;i<=Name.length()-1;i++)
		{
			if(i % 2 != 0)
			{
				rName = rName + Name.charAt(i);
			}
		}
		return rName;
	}
	
	String reverseEvenName(String Name)
	{
		String rName = "";
		for(int i = Name.length()-1;i>=0;i--)
		{
			if(i % 2 != 0)
			{
				rName = rName + Name.charAt(i);
			}
		}
		return rName;
	}
	
	int countDigit(String Name)
	{
		int count =0;
		for(int i=0;i<Name.length()-1;i++)
		{
			boolean ch = Character.isDigit(Name.charAt(i));
			if(ch==true)
			{
				count++;
			}
		}
		return count;
	}
	
	int sumDigit(String Name)
	{
		int count =0;
		for(int i=0;i<Name.length()-1;i++)
		{
			boolean ch = Character.isDigit(Name.charAt(i));
			if(ch==true)
			{
				int n1 =Character.getNumericValue(Name.charAt(i));
				count = count + n1;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		StringOperations sope = new StringOperations();
		String C = sope.reverseName("Maulik");
		String at = sope.evenPosition("technocredits");
		String rev = sope.reverseEvenName("technocredits");
		int count = sope.countDigit("Te8chno3cred7it9s");
		int sum = sope.sumDigit("Te8chno3cred7it9s"); 
				
		System.out.println("String Reverese: "+C);
		System.out.println("Even Postions in String: "+at);
		System.out.println("Reverse Even Position: "+rev);
		System.out.println("Number of Digits: "+count);
		System.out.println("Sum of Digits: "+sum);
	}
}
