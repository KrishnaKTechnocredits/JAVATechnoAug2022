/*Test - 3 : 10th Sep'2022

Program 1 : (20 mins)
Return middle character of max length String from given array.
input : {"Krishna","Maulik","Aashvi","Technocredits","Harsh"}
output : c

Program 2: (40 mins)
Write a method to return middle character of each elements from given array.
input : {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"}
output : Mahesh -> h
              Avni -> v
              Puja -> u
              Harshal -> s
              Aditty -> i
              Rahul -> h

2nd problem : 

char[] getMiddleCharFromName(String[] arr){
}

char[] ch = new char[arr.length];

sop(input[0] + "->" + output[0])

sop(input[index] + "->" + output[index])*/

package chaitanyaMankar.Array;

public class ReturnMiddleChar 
{
	char[] RChar(String[] Names)
	{
		char[] output = new char[Names.length];
		for(int i=0;i<Names.length;i++)
		{
			String tName = Names[i];
			char ch = ' ';
			if(tName.length()%2==0)
			{
				ch = tName.charAt(tName.length()/2-1);
			}
			else
			{
				ch = tName.charAt(tName.length()/2);
			}
			output[i]=ch;
		}
		return output;
		
	}
		
	public static void main(String[] args) 
	{
		ReturnMiddleChar rm = new ReturnMiddleChar();
		String[] input = {"Mahesh","Avni","Puja","Harshal","Aditty","Rahul"};
		char[] output = rm.RChar(input);

		for(int i=0;i<input.length;i++)
		{
			System.out.println(input[i] +"-->"+output[i]);
		}
	}
}
