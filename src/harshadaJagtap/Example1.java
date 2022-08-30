package harshadaJagtap;

class Example1{
	int x=10;
	int y=20;
	
	void prrocessData(){
		int z=x+y;
		x=x+10;
		y=y+10;
	}
	
	void display(){
		System.out.println("sum is "+ x+y);
		System.out.println(x+y + " is my ans");
		System.out.println("sum is "+ (x+y));
	}

	public static void main (String[]args){
		Example1 example1= new Example1();
		example1.prrocessData();
		example1.display();
	}
}



