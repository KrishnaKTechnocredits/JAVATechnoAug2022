package avni;
class Example4{

	int x = 10;
	int y = 20 ;
	
	void processData(){
		x = x+10;
		y = y+10 ;
		}
	
	void display(){
	System.out.println("sum is" + x+y);
	System.out.println(x+y +"is my ans ");
	System.out.println("sum is"+(x+y));
	}
	
	public static void main (String[] agrs){
		Example4 example4 = new Example4();
		example4.processData();
		example4.display();
	}
}