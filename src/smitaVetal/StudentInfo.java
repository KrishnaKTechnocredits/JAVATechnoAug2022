package smitaVetal;

class StudentInfo{
	
	void studentName(String name,String middleName,String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);	
	}
	
	void studentOtherDetail(String birthDate,String address,int rollNo){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);		
	}
	
	public static void main(String[] args){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Smita","Amol","Vetal");
		studentinfo.studentOtherDetail("27 Dec 1993", "Green park 302 kalyan east", 27);
	}
}