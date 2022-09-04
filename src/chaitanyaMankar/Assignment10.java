/* Assignment - 10 : 30th Aug'2022
Find last 3 numbers divisible by 3 and 7.

Input : 10 to 200
Output : 189
              168
              147   */

package chaitanyaMankar;

public class Assignment10 
{
	void divisible(int sValue,int eValue)
	{
	int count=0;
	for(int i=eValue;eValue>=eValue;i--)
				{
					if(i%3==0 && i%7==0)
						{
							System.out.println("Values divisible by 3 & 7 are :"+i);
							count++;
						}
					if(count>=3) {
						break;
					}
				}
	}
	
	
public static void main(String[] args)
{
	Assignment10 assignment_10 = new Assignment10();
	assignment_10.divisible(10, 200);
}
}
