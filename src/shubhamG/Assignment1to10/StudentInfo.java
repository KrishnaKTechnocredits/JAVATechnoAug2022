package shubhamG.Assignment1to10;


/**
 * Program-1: * Program Statement : Print all details of Student like Name,
 * Middle name, Surname, birthdate, Address, and Roll number.
 * 
 * 1. Create class called “StudentInfo” 2. Define 5 variables : Name, middle
 * name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber
 * as int. 3. Create two methods called studentName() and studentOtherDetails()
 * 4. studentName() method should print details like Name, middle name, surname.
 * 5. studentOtherDetails() method print details like birthdate, Address, and
 * Roll number. 6. Create a main method. 7. write a logic in the main method. a.
 * Create an object of the StudentInfo class. b. call studentName() and
 * studentOtherDetails() method on reference variable 8. Compile & Run
 */

class StudentInfo{	
	String name, middleName , surname, birhDate, address;
	int rollNo;
		
	void studentName( String name, String middleName,String surname){
		System.out.println(name + "\n" + middleName+ "\n" +  surname ); 
	}

	void studentOtherDetails(String birhDate,String address,int rollNo){
		System.out.println(birhDate + "\n" + address+ "\n" + rollNo ); 
	}

	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shubham","Santosh","Gupta");
		studentInfo.studentOtherDetails("18th Feb 1995","405, Global Lifestlye,Hinjewadi,pune",18);
	}
}