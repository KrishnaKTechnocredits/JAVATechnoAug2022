/*Program-1: 
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
34
*/
package pranjaliV;

class StudentInfo{
	
	String name;
	String middleName;
	String surName;
	String birthdate;
	String address;
	int rollNo;
	
	void studentName(String name, String middleName , String surName){
		System.out.println("Name : " + name);
		System.out.println("Middle Name : " + middleName);
		System.out.println("Surname : " + surName);
	}
	
	void studentOtherDetails(String birthdate, String address , int rollNo){
		System.out.println("Birthdate : " + birthdate);
		System.out.println("Address : " + address);
		System.out.println("Roll Number : " + rollNo);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shahid" , "Pankaj" , "Kapoor");
		studentInfo.studentOtherDetails("1st Jan 1990" , "A-105, Sterling Apartment, Miramar, Goa" , 18);
		studentInfo.studentName("Shikha" , "Amit" , "Patel");
		studentInfo.studentOtherDetails("10th Aug 1998" , "G-809, Heaven Apartment, Miramar, Goa" , 34);
	}	
}