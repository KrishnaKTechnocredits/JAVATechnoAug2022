package shivaniLikhia;
class StaticExample{
	
	static int x = 10;
	int y = 15;
	
	void processData(){
		x++;
		y++;
	}
	
	void display(){
		System.out.println(x + ":" + y);
	}
	
	public static void main(String[] args){
		
		StaticExample staticExample11 = new StaticExample();
		StaticExample staticExample12 = new StaticExample();
		
		staticExample11.processData();
		staticExample11.display();
		
		staticExample12.processData();
		staticExample12.display();	
	}	
}