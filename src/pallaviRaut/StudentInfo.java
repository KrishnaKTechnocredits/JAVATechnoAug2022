package pallaviRaut;
/*Assignment - 5 : 24th Aug'2022 */
class StudentInfo{
	void studentName(String name, String middlename,String surname)
	{
		System.out.println("Name: "+name);
		System.out.println("Middlename: "+middlename);
		System.out.println("Lastname: "+surname);
	}
	
	void studentOtherDetails(String birthdate,String address,int rno)
	{
		System.out.println("Birthdate: "+birthdate);
		System.out.println("Address: "+address);
		System.out.println("RollNumber: "+rno);
	}
	
	public static void main(String[] args)
	{
		StudentInfo studentInfo=new StudentInfo();
		System.out.println("--------***Student Information***-------");
		studentInfo.studentName("Shikha","Amit","Patel");
		studentInfo.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner, Pune",34);
	}	
}

