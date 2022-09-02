package pujaSah.basicJavaConcepts;

class StaticExample2{

	int num1= 1;
	int num2= 2;
	static int num3= 5;
		
	void processData(){
		num1=num2;
		num3=num1+num2;
	}
	
	void display(){
		System.out.println(num3);
	}
	
	public static void main(String[] args){
		StaticExample2 staticExample21=new StaticExample2();
		staticExample21.processData();
		staticExample21.display();
		
		StaticExample2 staticExample22=new StaticExample2();
		staticExample22.processData();						
		staticExample22.display();
		}
}
	
		
		
		
		
		
		
		
 