package hindaviIngle;
class StudentInfo{
	void studentName(String name,String middlename,String surname){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	void studentOtherDetails(String birthdate,String address,int rollno){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Hindavi","Bhushan","Ingle");
		studentinfo.studentOtherDetails("16jan1988","B1102 Horizons at wakad,Pune",16);
	}
}