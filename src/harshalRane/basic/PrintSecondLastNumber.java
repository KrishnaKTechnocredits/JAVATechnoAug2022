package harshalRane.basic;

class PrintSecondLastNumber{
	
	void processData(int startRange, int endRange)
	{
		System.out.println("Second last number divisible by 3 and 7 are:");
		int count=0;
		for(int num=endRange;num>=startRange;num--)
		{
			if(num%3==0 && num%7==0)
			{
				count++;
			}
			if(count==2)
			{
				System.out.println(num);
				break;
			}
		}
	}
	
	public static void main(String[] args){
		new PrintSecondLastNumber().processData(20,100);
	}
}