package narendraD;

class StaticExample {
	
	static int x = 10;
	int y = 15;
	
	void processData() {
		x++;
		y++;
	}
	
	void display() {
		System.out.println(x + " : " + y);
	}
	
	public static void main(String[] args){
		
		StaticExample staticExample1 = new StaticExample();
		staticExample1.processData();
		
		StaticExample staticExample2 = new StaticExample();
		staticExample2.processData();
		
		staticExample1.display();
		staticExample2.display();
	}
		
	
}