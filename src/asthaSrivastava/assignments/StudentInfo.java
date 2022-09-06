/*Program-1: *
Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create a main method.
7. write a logic in the main method.
	a. Create an object of the StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

*Output example:
*
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34
*/

package asthaSrivastava.assignments;

public class StudentInfo {   //Program 1 24Aug22
	void studentName(String name, String middleName, String surName){
		System.out.println("Name is "+ name);
		System.out.println("Middle name as "+ middleName);
		System.out.println("Surname is "+ surName);
		}
		
	void studentOtherDetails(String birthdate,String address, int rollNumber){
		System.out.println("Birthdate is "+birthdate);
		System.out.println("Address is "+address);
		System.out.println("RollNumber is "+rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		
		studentInfo.studentName("Shikha" ,"Kumari","Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune", 34);
	}
}