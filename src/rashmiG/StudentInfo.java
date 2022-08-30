//Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

package rashmiG;

class StudentInfo{
	
	void studentName(String name,String middleName, String surname){
		
		if(name!=" ")
			System.out.println("Name is "+name);
		if(middleName!=" ")
		System.out.println("Middlename is "+middleName);
		if(surname!=" ")
		System.out.println("Surname is "+surname);
	}
	
	void studentOtherDetails(String birthdate, String address, int rollno){
		System.out.println("Birthdate is "+birthdate);
		System.out.println("Address is "+address);
		System.out.println("rollno is "+rollno);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName(" "," "," ");
		studentInfo.studentOtherDetails("28th Feburary 1996","Sadashiv nagar ,3rd cross, 2nd stage , Belgaum",30);
	}
}
		