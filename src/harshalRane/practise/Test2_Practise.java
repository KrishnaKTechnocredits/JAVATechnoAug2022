package harshalRane.practise;

class Test2_Practise{

	void findRequiredNumbers(int targetNum)
	{
		int count=0;
		int sum =0;
		int num = 1;
			
		while(sum<targetNum)
		{
			sum = sum + num;
			num++;
			while(sum!=targetNum)
			{
				count++;
				break;
			}
			System.out.println(count);
		}
	 }
	
	public static void main(String[] args)
	{
		new Test2_Practise().findRequiredNumbers(50);
	}
}