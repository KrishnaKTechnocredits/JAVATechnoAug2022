package swapnilMaheshwari;

class Example2
{
	int bal=1000;
	
	void debitAmt()
	{
		int bal=3000;
		bal=bal-2500;
	}
	
	void creditAmt()
	{
		bal=bal+500;
	}
	
	void display()
	{
		System.out.println("New balance is"+bal);
	}
	
	public static void main (String [] args)	
	{
		Example2 example2 = new Example2 ();
		example2.creditAmt();
		example2.debitAmt();
		example2.display();
	}
}