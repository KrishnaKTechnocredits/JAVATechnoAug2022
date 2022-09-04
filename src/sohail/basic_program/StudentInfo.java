package sohail.basic_program;

class StudentInfo{
	
	void studentName(String fname, String mname, String lname){
	System.out.println(fname);
	System.out.println(mname);
	System.out.println(lname);
	}
	
	void studentOtherDetails(String DOB, String address, int rno){
		System.out.println(DOB);
		System.out.println(address);
		System.out.println(rno);	
	}

	public static void main (String [] args){
		StudentInfo studentinfo=new StudentInfo();
		studentinfo.studentName("Subhash","Manoj","Patil");
		studentinfo.studentOtherDetails("12 Aug 1995","Galaxy App. Wakad, Pune",10);
	}
}