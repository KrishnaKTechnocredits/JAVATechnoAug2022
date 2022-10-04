package shraddhaRekhate;

class StaticExample{

    int num1=1;
	int num2=2;
	static int num3=5;
 
    void processData(){
	   num1=num2;
       num3=num3+num1+num2;
    }
	
	void display(){
		System.out.println(num3);
	}
	
	public static void main(String[] args){
		StaticExample staticExample=new StaticExample();
		staticExample.processData();
		staticExample.display();
		
		StaticExample staticExample1=new StaticExample();
		staticExample1.processData();
		staticExample1.display();
	}
}