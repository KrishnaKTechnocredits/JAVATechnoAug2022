class StudentInfo{

     void studentName(String firstName,String middleName,String surName){
		 System.out.println(firstName);
		 System.out.println(middleName);
		 System.out.println(surName);
	}
	 
	 void studentDetails(String address,String birthdate,int rollno){
		 System.out.println(birthdate);
		 System.out.println(address);
		 System.out.println("Roll no.is" + rollno);
	}
	
	public static void main(String[] args){
		
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Suresh","Kumar","Gupta");
		studentinfo.studentDetails("22 August 1996","2 D, Vijay Nagar,Indore 452010",25);
	}
	
}
	
	 