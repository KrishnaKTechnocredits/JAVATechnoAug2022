package ashishBramhe;

class A5_StudentDetails{
	int rollNo;
	String name, middleName, surname, birthDate, address;
	
	void setData(){
		name = "Ashish";
		middleName = "Uday";
		surname = "Brahme";
		birthDate = "28th Oct 1992";
		address = "G-809, Heaven Apartment, Baner, Pune.";	
		rollNo = 21;
	}
	
	void printStudentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void printStudentDetails(){
		System.out.println(rollNo);
		System.out.println(birthDate);
		System.out.println(address);
	}
	
	public static void main(String args[]){
		A5_StudentDetails studentDetails = new A5_StudentDetails();
		studentDetails.setData();
		studentDetails.printStudentName();
		studentDetails.printStudentDetails();
	}
}