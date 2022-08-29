package niveditaGavade;

class StudentInfo{
	void studentName(String name,String middleName,String surname){
		
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
		}
	void studentOtherDetails(String birthDate,String address,int rollnumber){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollnumber);
		}
	public static void main (String[] args){
		StudentInfo studentInfo= new StudentInfo();
		studentInfo.studentName("Sikha", "Amit", "Patel");
		studentInfo.studentOtherDetails("10th Aug 1998", "G-809,Heaven Apartment Baner,Pune", 34);
		}
}