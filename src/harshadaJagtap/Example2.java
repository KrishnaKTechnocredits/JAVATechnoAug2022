package harshadaJagtap;

class Example2{
	int x=10;
	int y=20;
	
	void prrocessData(){
		x=x+1;
		y=y+1;
	}
	
	void display(){
		System.out.println(x + ":" + y);
	}

	public static void main (String[]args){
		Example2 example11= new Example2();
		Example2 example12= new Example2();
		example11.prrocessData();
		example12.prrocessData();
		example12.prrocessData();
		example11.display();
		example12.display();
	}
}