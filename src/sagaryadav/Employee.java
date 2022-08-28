package sagaryadav;

class Employee{
	int empID;
	String empName;
	int salary;
	
	void getInfo(int empID, String empName, int salary){
		this.empID=empID;
		this.empName=empName;
		this.salary=salary;	
		display();
	}
	
	void display(){
		System.out.print("The Employee ID is:" +empID + "  ");
		System.out.print("The Employee name is:" +empName+ "  ");
		System.out.println("The salary is:" +salary);		
	}
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.getInfo(1, "Sagar Yadav", 25000);
		employee.getInfo(2, "SaeeSa Yadav", 23000);
		employee.getInfo(3, "Krishna Yadav", 27000);
		employee.getInfo(4, "Vinayak Yadav", 24000);	
		employee.display();
	}

}