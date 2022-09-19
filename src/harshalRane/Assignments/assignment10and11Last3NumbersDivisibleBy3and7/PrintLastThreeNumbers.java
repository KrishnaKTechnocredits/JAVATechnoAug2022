package harshalRane.Assignments.assignment10and11Last3NumbersDivisibleBy3and7;

class PrintLastThreeNumbers{
	
	void processData(int startRange, int endRange)
	{
		System.out.println("Last three numbers divisible by 3 and 7 are:");
		int count=0;
		for(int num=endRange;num>=startRange;num--)
		{
			if(num%3==0 && num%7==0)
			{
				System.out.println(num);
				count++;
			}
			if(count==3)
			{
				break;
			}
		}
	}
	
	public static void main(String[] args){
		new PrintLastThreeNumbers().processData(10,200);
	}
}