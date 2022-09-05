package sohail.basic_program;

class Example{
	int x=10;
	int y=20;
	
	void processData(){
		int z=x+y;
		x=x+10;
		y=y+10;
	}
	
	void display(){
		System.out.println("Sum is " + x+y);
		System.out.println(x+y + " is my answer");
		System.out.println("sum is " + (x+y));
		
	}
	public static void main (String [] args){
	
		Example example=new Example();
		example.processData();
		example.display();
	}
}
