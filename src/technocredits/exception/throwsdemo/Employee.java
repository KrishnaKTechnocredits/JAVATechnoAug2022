package technocredits.exception.throwsdemo;

import java.io.FileNotFoundException;

public class Employee {

	void m1() throws FileNotFoundException{
		Manager manager = new Manager();
		manager.processData();
		System.out.println("Hi");
		System.out.println("Hello");
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		Employee emp = new Employee();
		try {
			emp.m1();
		}catch(Exception fe) {
			System.out.println("In catch");
		}
		System.out.println("end");
	}
}
