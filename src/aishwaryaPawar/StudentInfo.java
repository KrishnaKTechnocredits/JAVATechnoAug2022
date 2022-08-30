package aishwaryaPawar;

class StudentInfo{
	String name;
	String midName;
	String surname;
	String birthDate;
	String address;
	int rollNo;
	
	void studentName(){
		name="Aishu";
		midName="Sanjeev";
		surname="Pawar";
		System.out.println(name);
		System.out.println(midName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		birthDate="2nd Dec";
		address="105/83,Uma Nagari,Solapur";
		rollNo=25;
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNo);
	}
	
	public static void main(String[] arg){
		StudentInfo studentinfo =new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}

	