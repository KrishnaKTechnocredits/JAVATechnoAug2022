package technocredits.staticnonstatic;

public class Example6 {

	static int x = 5;// 8 //9
	int y = 10; // example61 -> 13 // example62 -> 11
	
	void processData() {
		x++;
		y++;
	}
	
	void display() {
		System.out.println(x + ":" + y);
	}
	
	public static void main(String[] args) {
		Example6 example61 = new Example6();
		example61.processData();
		example61.processData();
		example61.processData();
		example61.display(); // 8 : 13
		
		Example6 example62 = new Example6();
		example62.processData();
		
		example61.display(); // 9 : 13
		example62.display(); // // 9 : 11
		
		x = 0;
		example61.y = 0;
		example61.display(); // 0 : 13 // 0 : 13
	}
}
