package shivaniLikhia;
class StudentInfo{
	
		void studentName(String name, String middleName, String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
		
	}
	
	void studentOtherDetails(String birthdate, String address, int rollNum){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNum);
		
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shivani","Ramjibhai","Likhia");
		studentInfo.studentOtherDetails("12th Dec 1991","A1,Shiv Palace,Navsari",18);
	}
}