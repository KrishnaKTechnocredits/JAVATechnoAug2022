/*Assignment - 5 : 24th Aug'2022

Program-1: 
Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

*Output example:
*
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34.*/
package adittyThakare.basicconcepts;

class StudentInfo{
	String name ="Aditty", middleName = "V", surname = "Thakare", birthdate= "10 April 1989", address = "204, Mantri Park, Kothrud - 411056";
	int rollNo= 20;
	
	void studentName(String name, String middleName, String surname){
		System.out.println("Name: "+name);
		System.out.println("Middle Name: "+middleName);
		System.out.println("Surname: "+surname);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNo){
		System.out.println("Birthdate: "+birthdate);
		System.out.println("Address: "+address);
		System.out.println("Roll Number: "+rollNo);
	}

	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName(studentInfo.name, studentInfo.middleName, studentInfo.surname);
		studentInfo.studentOtherDetails(studentInfo.birthdate, studentInfo.address, studentInfo.rollNo);
	}
}		
		