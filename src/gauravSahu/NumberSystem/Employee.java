
package gauravSahu.NumberSystem;

class Employee {
	int empid = 15;
	String empname = "Gaurav";

	void display() {
		String empname = "Garvis";
		int empid = 50;
		empid = empid + 100;
		System.out.println(empname);
		System.out.println(empid);
	}

	void update() {
		System.out.println(empname);
		System.out.println(empid);
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.display();
		employee.update();
	}
}