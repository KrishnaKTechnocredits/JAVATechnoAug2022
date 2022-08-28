package chaitanyaMankar;

public class FirstThree 
{	
	void processData(int sRange, int eRange)
	{	
		int count=0;
		
		for(int i=sRange;sRange<=eRange;i++)
		{
			if(i%3==0 && i%7==0)
				{
					System.out.println("Values divisible:"+i);	
					count++;
				}
			if (count>=3)
				break;
		
		}
	}
	

	public static void main(String[] args) 
	{
		FirstThree first_three = new FirstThree();
		first_three.processData(20,100);
	}
}
