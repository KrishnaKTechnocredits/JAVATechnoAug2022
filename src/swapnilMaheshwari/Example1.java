package swapnilMaheshwari;

class Example1
{
	int accNumber=123;
	String name="Hi";
	
	void processData()
	{
		String name="Techno";
		int accNumber=567;
		accNumber=912;
	}
	
	void printInfo()
	{
		System.out.println(name);
		System.out.println(accNumber);
	}
	
	public static void main(String[] args)
	{
		Example1 example1=new Example1();
		example1.processData();
		example1.printInfo();
	}
}