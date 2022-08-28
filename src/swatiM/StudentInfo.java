package swatiM;

class StudentInfo{
	String name = "Swati";
	String middlename = "Nilesh";
	String surname = "Mohite";
	String birthdate = "30 dec 1990";
	String address = "Saileela apartment , katraj ,Pune-46";
	int rollno = 21;
	
	void studentName(String name,String middlename,String surname)
	{
		System.out.println("Name : " +name);
		System.out.println("middlename : " +middlename);
		System.out.println("surname : " +surname);
	}
	void studentOtherDetails(String birthdate,String address,int rollno)
	{
		System.out.println("birthdate : " +birthdate);
		System.out.println("address : " +address);
		System.out.println("rollno : " +rollno);
	}
    public static void main(String[]a){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName(studentInfo.name,studentInfo.middlename,studentInfo.surname);
		studentInfo.studentOtherDetails(studentInfo.birthdate,studentInfo.address,studentInfo.rollno);
	}
	}