package avni;

class StudentInfo{
	
	void studentName(String name , String middleName,String surname){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}

	void studentotherDetails(String birthDate, String address, int rollNo) {
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName("Avni", "Chetanbhai", "Dalsaniya");
		studentInfo.studentotherDetails("16july2001", "jamnagar", 1);
	}
}