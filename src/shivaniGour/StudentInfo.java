package shivaniGour;
class StudentInfo{
	 
	 void studentName(String name, String middleName, String surname){
		 System.out.println("First Name: "+name);
		 if(middleName != null)
			 System.out.println("Middle Name: "+middleName);
		 System.out.println("Last Name: "+surname);	 
	 }
	 
	 void studentOtherDetails(String birthdate, String address, int rollNumber){
		 System.out.println("DOB: "+birthdate);
		 System.out.println("Address: "+address);
		 System.out.println("Roll Number: "+rollNumber);	 
	 }
	 
	 void processResult(int score){
		 if(score >= 50 && score <=100){
			 System.out.println("Passed as obtained mark is "+score+", Congratulations!!");
		     if(score >= 90 && score <= 100)
				 System.out.println("A+, very good job");
			 else if(score >= 80 && score <= 89)
				 System.out.println("A, good job");
			 else if(score >= 70 && score <= 79)
				 System.out.println("B+, you are improving");
			 else if(score >= 60 && score <= 69)
				 System.out.println("C+, keep reading");
			 else if(score >= 50 && score <= 59)
				 System.out.println("C, you can do better");
		 }
		 else if(score >= 0 && score <=49)
			 System.out.println("Failed as obtained mark is "+score+", work harder");
		 else
			 System.out.println("Range "+score+" is invalid");			  
	 }
	 
	 public static void main (String[] args){
		 StudentInfo studentinfo = new StudentInfo();
		 studentinfo.studentName("Missy",null,"Cooper");
		 studentinfo.studentOtherDetails("10th Aug 1989","#Palm street Florida", 4657);	
		 studentinfo.processResult(63);
		 System.out.println("*************************");
		 studentinfo.studentName("Lina","J","Tim");
		 studentinfo.studentOtherDetails("15th Aug 1989","#32 second street Florida", 8372);	
		 studentinfo.processResult(30);	 
		 System.out.println("*************************");
		 studentinfo.processResult(120);	
	 }
}

