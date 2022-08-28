package hindaviIngle;
class Example1{
	int bal=1000;
	
	void debitAmt(){	
		int bal = 3000;
		bal=bal-500;
		System.out.println("local bal is"+bal);
	}
	void creditAmt()
	{
		bal = bal +1000;
	}
	void display()
	{
	System.out.println("balalnce is"+bal);
	}
	public static void main(String[] a)
	{
		Example1 example1 = new Example1();
		example1.creditAmt();
		example1.debitAmt();
		example1.display();
	}
}