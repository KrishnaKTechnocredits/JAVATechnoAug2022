/*Test 4 - 11th Sep'2022

Expected time : 15 mins
Program 1 :
Write a method to return sum of all the digits present in each elements from given array.
input : {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"}
output : Mahesh -> 5
         Avni -> 9
         Puja -> 9
         Harshal -> 0
         Aditty -> 8
         Rahul -> 0

*/

package chaitanyaMankar.String;

public class ReturnNumInString 
{
	
	int ReturnSum(String[] Name)
	{
		int output[] = new int [Name.length];
		int count =0;
		
		for(int i=0;i<Name.length;i++)
		{
			String tName = Name[i];
			for(int j=0;j<tName.length();j++)
			{
				boolean ch = Character.isDigit(tName.charAt(j));
				if(ch==true)
				{
					int n1 =Character.getNumericValue(tName.charAt(j));
					count = count + n1;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) 
	{
		ReturnNumInString nu = new ReturnNumInString();
		String[] input = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		int output = nu.ReturnSum(input);
		System.out.println("Sum of Numbers: "+output);
		
	}
}
