package jagruti;

class Assignment10_JagrutiM
{
	int number;
	int checkcount = 0;
	
	
	void IsDivisible(int number1, int number2)
	{
		for(number=number2; number>number1; number--)
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
		Assignment10_JagrutiM assignment10_JagrutiM = new Assignment10_JagrutiM();
		assignment10_JagrutiM.IsDivisible(10, 200);
		 
	}
}
