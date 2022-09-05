package chaitanyaMankar;

public class Test2 
{
	void findRequiredNumbers(int targetNum)
	{
		int count = 0;
		int temp=0;
		int sum = 0;
		
		while(sum<targetNum)
		{
			temp++;
			sum=sum+temp;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) 
	{
		Test2 test2 = new Test2();
		test2.findRequiredNumbers(17);
	}
}

