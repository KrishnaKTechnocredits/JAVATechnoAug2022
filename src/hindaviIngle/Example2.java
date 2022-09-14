package hindaviIngle;
class Example2{
 int x = 10;
 int y = 20;
 
	void processData()
	{
		int z = x + y;
		x = x+10;
		y = y+10;		
	}
	
	void display()
	{
		System.out.println("sum is "+ x+y);
		System.out.println(x+y +"  answer is");
		System.out.println("sum is "+(x+y));		
	}
	public static void main(String[] a){
		Example2 example2 = new Example2();
		example2.processData();
		example2.display();
	}
}