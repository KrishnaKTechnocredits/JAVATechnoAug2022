package mohiniA.basic;

class Example1{
	int x =10;
	int y= 20;
	
	void processData(){
			x = x+1;
			y= y+1;
	}		 
	
	void display (){
		System.out.println( x +" : " +y);
				
	}
		
	public static void main(String[] args){
		Example1 example11 = new Example1();
		Example1 example12 = new Example1();
		example11.processData();
		example11.display();	
		example12.display();
		
	}


}