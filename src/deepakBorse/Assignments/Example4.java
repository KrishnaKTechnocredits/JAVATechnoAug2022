package deepakBorse.Assignments;


class Example4{
	int x=10; //20
	int y=20; //30
	
	void processData(){
		int z=x+y;
		x=x+10;
		y=y+10;
	}

	void displayInfo(){
		System.out.println("Sum is"+ x+y); //Concate 20
		System.out.println(x+y +"Sum is my answer");
		System.out.println("Sum is"+ (x+y));
	}	
	
	public static void main(String[] args){
		Example4 example4= new Example4();
		example4.processData();
		example4.displayInfo();
	}
	

}