package sagaryadav;
class Example4{

	int x=10;
	int y=20;
	int z;
	
	void processData(){
		//z= x+y;
		x=x+10;
		y=y+20;
	
	}
	
	void display(){
		System.out.println("Sum is " + x+ y);
		System.out.println(x+y + " is my answer");
		System.out.println("Sum is " + (x+y));	
	}
	
	public static void main(String[] args){
		Example4 example4= new Example4();
		example4.processData();
		example4.display();		
	}
}



