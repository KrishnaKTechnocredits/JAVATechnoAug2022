/*
 *Test - 2: 4th Sep'2022
void findRequiredNumbers(int targetNum){
	int count = 0;
	while(sum<targetNum){		
		count++;
	}
	sop(count);}
-----------------------------
findRequiredNumbers(50);
input : 50
output : 10
input : 17
output : 6
1+2+3+4+5+6+7+8+9+10 = 55
 */
package jagruti;
public class Assignment15 
{
	void findRequiredNumbers(int targetNum)
	{
		int count=0;
		int sum =0;
		int num = 1;		
		while(sum<targetNum)
		{
			sum = sum + num;
			num++;
			count++;
			System.out.println(count);
		}
	}  
	public static void main(String[] args)
	{
			new Assignment15().findRequiredNumbers(50);
	}
}



