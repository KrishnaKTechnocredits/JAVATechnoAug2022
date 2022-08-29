class StudentInfo{

	 void studentName(String name,String middleName,String lastName){
		 System.out.println("Name : "+name);
		 System.out.println("Middlename : "+middleName);
		 System.out.println("Lastname : "+lastName);
	 }
	
	
	void studentOtherDetails(String birthdate,String adderess,int rollNumber){
		System.out.println("Birthdate : "+birthdate);
		System.out.println("Adderess : "+adderess);
		System.out.println("RollNumber : "+rollNumber);
	}
	
	void processResult(int score){//javac Studentinfo.java
		
		if(score>=0 && score<=100){
			if(score>=50 && score<=100)
				System.out.println("Student could clear exam");
			if(score>=90 && score<=100)
				System.out.println( "A+, very good job");
			else if (score>=80 && score<=89)
				System.out.println("A, good job");
			else if (score>=70 && score<=79)
				System.out.println("B+, you are improving");
			else if (score>=60 && score<=69)
				System.out.println("C+, keep reading");
			else if (score>=50 && score<=59)
				System.out.println("C, you can do better");
			else 
			 System.out.println("Failed as obtained mark is "+score+", work harder");
		}
	}
	
	public static void main(String[]args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Abhijeet","Ambarushi","More");
		studentInfo.studentOtherDetails("22nd april 1998","A-1,Muraraji peth,Solapur",21);
		studentInfo.processResult(36);
		studentInfo.processResult(96);
	}
	}