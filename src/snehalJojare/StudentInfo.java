package snehalJojare;

class StudentInfo{
	String name = "Snehal";
	String middlename = "Rajan";
	String surname = "Jojare";
	String birthdate = "25th Feb 1990";
	String address = "A-102, Balkrushna apartment, Sector 23, Nerul, Navi Mumbai";
	int rollNumber = 25;
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}