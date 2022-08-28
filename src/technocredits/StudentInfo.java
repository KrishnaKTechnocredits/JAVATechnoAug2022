class StudentInfo{
  
  void studentName(String name, String middleName, String surName){
     System.out.println("Student Name is " + name);
	 System.out.println("Student Middle Name is " + middleName);
	 System.out.println("Student Surname is " + surName); 
	 }
	 
	 void studentOtherDetails(String birthdate,String address,int rollNumber ){
       System.out.println("Birthdate is " + birthdate);
	   System.out.println("Address is " + address);
	   System.out.println("Roll no is " + rollNumber);
	 }
	 public static void main(String[] args){
	 StudentInfo studentInfo = new StudentInfo();
	 
	 studentInfo.studentName("Shikha","Amit","Patel");
	 studentInfo.studentOtherDetails("10th Aug 1998","G-809, Heaven Apartment, Baner, Pune",34);
	 }
}