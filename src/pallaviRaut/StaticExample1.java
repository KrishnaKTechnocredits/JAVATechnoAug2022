package pallaviRaut;
class StaticExample1{

	static int x=10;
	int y=15;
	
	void processData()
	{
		x++;
		y++;
	}
    
	void display()
	{
		System.out.println(x + ":" + y);
				
	}
	
		
	public static void main(String[] args)
	{
		StaticExample1 staticexample11=new StaticExample1();
		staticexample11.processData();
		
		StaticExample1 staticexample12=new StaticExample1();
		staticexample12.processData();
		
		staticexample11.display();// 12 16
		staticexample12.display();// 12 16
	}	
}
