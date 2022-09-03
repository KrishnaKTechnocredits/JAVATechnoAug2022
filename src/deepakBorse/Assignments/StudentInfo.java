/*Program-1: *
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
package deepakBorse.Assignments;

class StudentInfo{
	String Name, middleName, surname, birthdate, Address;
	int rollNumber;
	
	void studentName(String Name,String middleName,String surname){
		System.out.println(Name+"\n"+middleName+"\n"+surname);
	}

	void studentOtherDetails(String birthdate, String Address, int rollNumber){
		System.out.println(birthdate+"\n"+Address+"\n"+rollNumber);
	}

	public static void main(String[] args){
		StudentInfo StudentInfo1=new StudentInfo();
		StudentInfo1.studentName("Haaresh", "Deepak", "Borse");
		StudentInfo1.studentOtherDetails("18-July-2012", "10/B, Sadhashiv CHS, Bhelke Nagar, Kothrud, Pune-411038", 27);
		
	}

}	
	
	
