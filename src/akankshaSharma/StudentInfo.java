package akankshaSharma;
class StudentInfo{
	
	void studentName(String name,String middleName,String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(String birthdate,String address,int rollNumber){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Shikha", "Amit","Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809, Heaven, Apartment, Baner, Pune.", 34);
	}
}	
	
	