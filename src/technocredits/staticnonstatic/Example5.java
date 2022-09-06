package technocredits.staticnonstatic;

public class Example5 {
	int num1=10; //11 // 11
	static int num2 = 20; // 31 // 42
	
	void processData() {
		num1++;
		num2 = num2 + num1;
	}
	
	void displayData() {
		System.out.println(num1 + ":" + num2);
	}
	
	public static void main(String[] args) {
		Example5 example51 = new Example5();
		example51.processData();
		
		Example5 example52 = new Example5();
		example52.processData();
		
		example51.displayData(); // 11 : 42
		example52.displayData(); // 11 : 42 
	}
}
