package technocredits.communicationbtwclasses;

public class Employee {
	int sum = 0;
	
	void processData() {
		System.out.println("1");
		Manager mng = new Manager();
		mng.processData();
	}
	
	void sum(int num1,int num2) {
		sum = num1+num2;
	}
	
	void average() {
		System.out.println(sum/2);
	}
	
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.processData();
	}
}
