package komalShrivastava;

class StudentInfo{
	
	void studentName(String name,String middleName,String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void StudentOtherDetails(String birthdate,String address,String rollnumber){	
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	
	public static void main(String args[]){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Anurag","Kishan","Shrivastava");
		studentInfo.StudentOtherDetails("5th jan 1990" ,"B8-103 Blueridge Society, Hinjewadi, Pune" ,"T007"  );
	}
}
		