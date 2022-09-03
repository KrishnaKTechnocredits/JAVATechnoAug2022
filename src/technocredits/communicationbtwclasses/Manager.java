package technocredits.communicationbtwclasses;

public class Manager {
	int x = 10;
	
	void processData() {
		System.out.println("2");
		Employee employee = new Employee();
		employee.sum(10,20);
		employee.average();
	}
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.processData();
	}
}
