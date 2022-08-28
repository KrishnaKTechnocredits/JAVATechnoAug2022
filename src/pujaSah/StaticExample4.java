package pujaSah;

class StaticExample4{

	int num1= 1;
	int num2= 2;
	static int num3= 5;
		
	void processData(){
		num1=num2;
		num3=num1+num2+num3;
	}
	
	void display(){
		int num3=100;
		System.out.println(num3);
	}
	
	public static void main(String[] args){
		StaticExample4 staticExample41=new StaticExample4();
		staticExample41.processData();
		staticExample41.display();
		
		StaticExample4 staticExample42=new StaticExample4();
		staticExample42.processData();						
		staticExample42.display();
	}
}
	
		
		
		
		
		
		
		
 