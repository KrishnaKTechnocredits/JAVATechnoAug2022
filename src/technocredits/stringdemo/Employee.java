package technocredits.stringdemo;

public class Employee {
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String toString() {
		return id + "-" + name;
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Maulik");
		Employee emp2 = new Employee(2,"Aashvi");
		Employee emp3 = new Employee(3,"Techno");
		System.out.println(emp1); // MA
		System.out.println(emp2);
		System.out.println(emp3);
	}
}
