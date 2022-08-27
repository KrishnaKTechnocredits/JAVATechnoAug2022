package nehaniG;

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
	StaticExample staticExample1 = new StaticExample();
	staticExample1.processData();
	staticExample1.display();
	
	StaticExample staticExample2 = new StaticExample();
	staticExample1.processData();
	staticExample2.display();
	}
}	