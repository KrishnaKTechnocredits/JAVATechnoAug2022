package monali;
class StudentInfo
{
	String Name,Middle_Name,Surname,Birthdate,Address;
	
	int rollno;
	void studentName(String Name, String Middle_Name, String Surname)
	{
		
		this.Name=Name;
		System.out.println("Student Name is: "+Name);
		System.out.println("student Midlle name is : " +Middle_Name);
		System.out.println("Student surname is: "+Surname);
	
	}
	
	void studentOtherDetails(String Birthdate, String Address,int rollno)
	{
		
		
		System.out.println("Birthdate of "+Name+" is :  " +Birthdate);
		System.out.println("Adress of " +Name+" is : " +Address);
		System.out.println("Roll number of " +Name+" is:  "+rollno);
	}
	public static void main(String[] args)
	{
	StudentInfo studentinfo=new StudentInfo();
	studentinfo.studentName("Monali","Ganesh","Khandelwal");
	studentinfo.studentOtherDetails("9th May 1995","Sect no 27 Pune",10);
	
	}
}
	
	
	