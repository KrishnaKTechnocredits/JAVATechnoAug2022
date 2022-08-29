package anujaD;

class StudentInfo{
	
				void studentName(String name, String middle, String surname){
					System.out.println("Student Name is: "+name);
					System.out.println("Student middle Name is: " +middle);
					System.out.println("Student surname is: " +surname);
					
				}
				void studentOtherDetails(String address,String birthdate,int rollNumber ){
					System.out.println("Student birthdate is: " +address);
					System.out.println("Student address is: " +birthdate);
					System.out.println("Student rollnumber is:" +rollNumber);
				}
				public static void main(String[] args){
							StudentInfo studentInfo = new StudentInfo();
							studentInfo.studentName("Anuja","Ashok","Devangare");
							studentInfo.studentOtherDetails("17 Aug 1996","Anand Niwas",1);
							 
						}
				
}