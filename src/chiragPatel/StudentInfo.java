package chiragPatel;
class StudentInfo{
	String name = " Chirag";
	String middlename = " Jayantibhai";
	String surname = " Patel";
	String birthdate = " 1st January 1990";
	String Address = " C-303 Stargaze, Bavdhan, Pune";
	int rollnumber = 10;
	
		void studentName(){
			System.out.println("name is" + name);
			System.out.println("middlename is" + middlename);
			System.out.println("surname is" + surname);
			System.out.println("birthdate is" + birthdate);
			System.out.println("Address is" + Address);
			System.out.println("roll number is" + rollnumber);
		}
		
	public static void main(String[] args){
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.studentName();
	}
}