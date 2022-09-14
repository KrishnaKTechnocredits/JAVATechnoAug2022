package swapnilMaheshwari.Assignment1;
class Example3
{
	int accNumber=123;
	String name;
	
	void processData()
	{
		String name="Tecno";
		int accNumber=456;
		accNumber=789;
	}
	
	void printInfo()
	{
		System.out.println(name);
		System.out.println(accNumber);
	}
	
	public static void main(String[] args)
	{
		Example3 example3 = new Example3();
		example3.processData();
		example3.printInfo();
	}
}

// it should be display error as name is local variable and we are trying to display in another variable that is not allowed.