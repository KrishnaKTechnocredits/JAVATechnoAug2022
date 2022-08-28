package pujaSah;

class StaticExample1{

	static int x= 10;
	int y= 15;
		
	void processData(){
		x++;
		y++;
	}
	
	void display(){
		System.out.println(x+ ":" +y);
	}
	
	public static void main(String[] args){
		StaticExample1 staticExample11=new StaticExample1();
		staticExample11.processData();
		
		StaticExample1 staticExample12=new StaticExample1();
		staticExample12.processData();
						
		staticExample11.display();
		staticExample12.display();
	}
}
	
		
		
		
		
		
		
		
 