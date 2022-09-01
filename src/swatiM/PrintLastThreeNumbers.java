package swatiM;

public class PrintLastThreeNumbers {

	void processData(int startIndex, int endIndex)
	{
		System.out.println("Last three numbers divisible by 3 and 7 are:");
		int count=0;
		for(int num=endIndex;num>=startIndex;num--)
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
	
	public static void main(String[] args) {
		new PrintLastThreeNumbers().processData(10,200);

	}

}
