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
34 */

package chaitanyaMankar;
class StudentInfo
{
	void studentName(String name,String mname,String sname)
	{
		System.out.println("Name: "+name);
		System.out.println("Middle Name: "+mname);
		System.out.println("Surname: "+sname);
	}
	void studentOtherDetails(String bdate,String Address,int rollno)
	{
		System.out.println("Birthdate: "+bdate);
		System.out.println("Address: "+Address);
		System.out.println("Roll Number: "+rollno);
	}
	
	public static void main(String[] args)
	{
		StudentInfo studentinfo = new StudentInfo();
		{
			studentinfo.studentName("Chaitanya","S","Mankar");
			studentinfo.studentOtherDetails("07Aug1993","Pune",2700);
		}
	}
}

