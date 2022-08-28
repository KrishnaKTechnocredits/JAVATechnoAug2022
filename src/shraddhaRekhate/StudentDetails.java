package shraddhaRekhate;

class StudentInfo{
   
   
    void studentName(String name,String middleName,String surName){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
		
	}
	
	void studentOtherDetails(String birthDate, String adress, int rollNo){
		System.out.println(birthDate);
		System.out.println(adress);
		System.out.println(rollNo);
	}
	
	public static void main(String[] args){
	    StudentInfo studInfo=new StudentInfo();
	//	studInfo.studentName(shraddha,ratan,rekhate);
		//studInfo.studentOtherDetails(30JUne1998,shivnagar kanhan,9);
		
	}
}