package nikeshM;

class Test2{
	int x = 10;
	int y = 20; 
	
	void processData (){
		x= x+1;
		y= y+1;
	}
	
	void display (){
	System.out.println(x+ " : "+y);
	}
	
	public  static void main (String [] args){
	Test2 test21 = new Test2();
	Test2 test22 = new Test2();
	test21.processData();
	test21.display();
	test22.display();
	}
}