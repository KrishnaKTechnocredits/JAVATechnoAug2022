/*Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

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

package namratamishra.Basic_Operations;

public class Studentinfo {

	String Name, middleName, surname, birthdate;
	int rollNo;

	void studentName(String Name, String middleName, String surname) {
		System.out.println("Name of the student is: " + Name);
		System.out.println("Middle name of the student is: " + middleName);
		System.out.println("surnamename of the student is: " + surname);
	}

	void studentOtherDetails(String birthdate, String Address, int rollNo) {
		System.out.println("D.O.B of the student is: " + birthdate);
		System.out.println("Addres of the student is: " + Address);
		System.out.println("RollNo of the student is: " + rollNo);
	}

	public static void main(String[] args) {
		Studentinfo si = new Studentinfo();
		si.studentName("Shikha", "Amit", "Patel");
		si.studentOtherDetails("10th Aug 1988", "G-809, Heaven Apeartment,Baner,Pune", 34);
	}
}
