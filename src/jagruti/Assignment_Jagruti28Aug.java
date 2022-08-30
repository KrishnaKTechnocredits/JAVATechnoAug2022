package jagruti;

class Assignment_Jagruti28Aug
{
	int number;
	int checkcount = 0;
	
	
	void IsDivisible(int number1, int number2)
	{
		for(number=number1; number<number2; number++)
		{
			if(number%3==0 && number%7 ==0)
			{
				System.out.println(number+ " is divisible by 3 and 7");
				checkcount++;
			}
			if(checkcount>=3)
				break;			
		}
	}
	
	public static void main(String[] a)
	{//1
		Assignment_Jagruti28Aug assignment_Jagruti28Aug = new Assignment_Jagruti28Aug();
		assignment_Jagruti28Aug.IsDivisible(20, 100);
		 
	}
	
}