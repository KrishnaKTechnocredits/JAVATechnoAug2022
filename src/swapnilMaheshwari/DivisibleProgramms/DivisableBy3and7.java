package swapnilMaheshwari.DivisibleProgramms;

public class DivisableBy3and7 {
	int i,count=0;
	void processData(int srange , int erange) 
	{
		for (i=srange; i<erange; i++ ) 
		{
			if(i%3==0 && i%7==0 )
			{
				System.out.println("Number is divisable by 3 and 7 is "+i);
				count++;
			}
			if(count==3)
			{
				break;
			}
		}
	}
	public static void main (String[] args)
	{
		DivisableBy3and7 divisableBy3and7= new DivisableBy3and7();
		divisableBy3and7.processData(20, 100);
		
	}

}
