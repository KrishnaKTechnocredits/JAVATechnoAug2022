//class to print Student Details.

package mohiniA;
class StudentInfo{
	String fname = "Reena";
	String mname = "Sachin";
	String lname = "Ahuja";
	String date = "24th Aug 22";
	String Address = "185,Shaniwar peth ,Pune";
	int Rno=24;
		
	void studentName(){
		System.out.println(fname);
		System.out.println(mname);
		System.out.println(lname);		
	}
	
	void studentDetail(){
		System.out.println(date);
		System.out.println(Address);
		System.out.println(Rno);		
	}

	public static void main(String[] args){
		StudentInfo student =new StudentInfo();
		student.studentName();
		student.studentDetail();		
		
	}

}