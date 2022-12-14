/* *Program-1: *
 
Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.
1. Create class called StudentInfo
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run
*/

package akankshaVyas.basicExamples;
class StudentInfo{

	void studentName(String name, String middleName, String surname){
		System.out.println("Student name is "+name+" "+middleName+" "+surname);
	}
	
	void studentOtherDetails(String birthDate,String address,int rollNumber){
		System.out.println("Birthday is "+ birthDate);
		System.out.println("Address is " + address);
		System.out.println("Roll number is "+ rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Akanksha", "Rajendra", "Vyas");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven Apartment, Baner, Pune.",1);
	}
}