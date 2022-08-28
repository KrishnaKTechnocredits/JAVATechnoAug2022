package ankitaBarwad;

class StudentInfo{
	
	String name="Shikha";
	String middleName="Amit";
	String surname="Patel";
	String birthdate="10th Aug 1998";
	String address="G-809, Heaven Apartment, Baner, Pune";
	int rollNumber=34;
	
	void studentName(){
		System.out.println(name + "\n" + middleName + "\n" + surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate + "\n" + address + "\n" + rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}