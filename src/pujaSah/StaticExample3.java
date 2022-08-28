package pujaSah;

class StaticExample3{

	int num1= 1;
	int num2= 2;
	static int num3= 5;
		
	void processData(){
		num1=num2;
		num3=num1+num2+num3;
	}
	
	void display(){
		System.out.println(num3);
	}
	
	public static void main(String[] args){
		StaticExample3 staticExample31=new StaticExample3();
		staticExample31.processData();
		staticExample31.display();
		
		StaticExample3 staticExample32=new StaticExample3();
		staticExample32.processData();						
		staticExample32.display();
		}
}
	
		
		
		
		
		
		
		
 