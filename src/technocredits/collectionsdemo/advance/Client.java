package technocredits.collectionsdemo.advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Client {

	void getEmployeeList() {
		HashSet<Employee> listOfEmployee = new HashSet<Employee>();
		
		listOfEmployee.add(new Employee(1,"Harshal","Rane", "hrane"));
		listOfEmployee.add(new Employee(2,"Akanksha","Vyas","avyas"));
		listOfEmployee.add(new Employee(3,"Puja","Sah","psah"));
		listOfEmployee.add(new Employee(1,"Harshal","Rane", "hrane"));
		
		
		System.out.println(listOfEmployee.size());
	}
	
	
	public static void main(String[] args) {
		new Client().getEmployeeList();
	}
}
