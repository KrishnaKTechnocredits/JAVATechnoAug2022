package mohiniA;

class ExampleStatic{
	static int x =10;
	int y= 15;
	
	void processData(){
			x = x+1;
			y= y+1;
	}		 
	
	void display (){
		System.out.println( x +" : " +y);
				
	}
		
	public static void main(String[] args){
		ExampleStatic example11 = new ExampleStatic();
		ExampleStatic example12 = new ExampleStatic();
		example11.processData();
		example11.display();	
		example12.processData();
		example12.display();
		
	}


}


 