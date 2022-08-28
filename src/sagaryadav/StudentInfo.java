/* 
1. Create class called “StudentInfo{}"
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

package sagaryadav;
class StudentInfo{
	
	String firstName;
	String middleName;
	String lastName;
	String birthdate;
	String address;
	int rollNumber;

	void studentName(String firstName, String middleName, String lastName){
		this.firstName=firstName;
		this.middleName=middleName;
		this.lastName=lastName;		
		System.out.println("First Name is: " +firstName);
		System.out.println("Middle Name is: " +middleName);
		System.out.println("Last Name is: " +lastName);		
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNumber){
		this.birthdate=birthdate;
		this.address=address;
		this.rollNumber=rollNumber;		
		System.out.println("Birthdate is: " +birthdate);
		System.out.println("Address is: " +address);
		System.out.println("Roll Number is: " +rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		System.out.println("Student Details are given below:");
		studentInfo.studentName("Sagar" , "Nivruti" , "Yadav");
		studentInfo.studentOtherDetails("5th December 1991" , "302, WhiteField B Wing, Wakad, Pune=57" , 7);
	
	}
}