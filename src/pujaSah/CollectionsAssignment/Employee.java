/*Assignment - 41 : 20th Oct'2022
Create POJO class Employee.
Sort Employee object based on Salary.
Employee class should have empName, empId, empSalary, empDeptId as parameters.
Print all instance variable of employee after sorting.*/

package pujaSah.CollectionsAssignment;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>{
String empName;
int empId, empSalary, empDeptId ;

Employee(String  name,int id, int salary, int deptId){
	this.empName = name;
	this.empId = id;
	this.empSalary = salary;
	this.empDeptId = deptId;
}

public String getEmpName(){
	return this.empName;
};

public int getEmpId(){
	return this.empId;
};

public int getEmpSalary(){
	return this.empSalary;
};

public int getEmpDepId(){
	return this.empDeptId;
}

//implementing compareTo() method of Comparable Interface
@Override
public int compareTo(Employee o){
	if (this.empSalary != o.empSalary){
		return (this.empSalary - o.empSalary);
	}
	else if (! this.empName.equals(o.empName )){
		return this.empName.compareTo(o.empName);
	}
	else if (this.empDeptId != o.empDeptId){
		return (this.empDeptId - o.empDeptId);
	}
	else {
		return (this.empId - o.empId);
	}
}

public static void main(String[] args){
	ArrayList<Employee> listOfEmployee = new ArrayList<Employee>();
	
	Employee empDetail1 = new Employee("Abhilasha", 6, 1000, 3001);
	Employee empDetail2 = new Employee("Priya", 2, 2000, 3003);
	Employee empDetail3 = new Employee("Priya", 3, 7000, 3002);
	Employee empDetail4 = new Employee("Santosh", 1, 5000, 3004);
	Employee empDetail5 = new Employee("Rahul", 5, 1000, 3003);
	Employee empDetail6 = new Employee("Abhi", 7, 9000, 3002);
	Employee empDetail7 = new Employee("Priyanka", 4, 2000, 3004);
	Employee empDetail8 = new Employee("Priya", 8, 2000, 3001);
	Employee empDetail9 = new Employee("Rahul", 5, 1000, 3003);
	
	listOfEmployee.add(empDetail1);
	listOfEmployee.add(empDetail2);
	listOfEmployee.add(empDetail3);
	listOfEmployee.add(empDetail4);
	listOfEmployee.add(empDetail5);
	listOfEmployee.add(empDetail6);
	listOfEmployee.add(empDetail7);
	listOfEmployee.add(empDetail8);
	listOfEmployee.add(empDetail9);

	Collections.sort(listOfEmployee);
	
	System.out.println("Employee Details in the order: Name-> DeptId-> empId-> Salary are: \n");
	for(Employee employee : listOfEmployee){
		System.out.println(employee.getEmpName() + ", -> " + employee.getEmpDepId() + ", -> " + employee.getEmpId() + ", -> " + employee.getEmpSalary() );
	}
}
}