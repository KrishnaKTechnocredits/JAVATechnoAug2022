package sanket;

class StudentInfo{
	
		String studentName = "Nilesh";
		String studentMidleName = "Raj";
		String studentSurname = "Prabhu";
		String studentBirthdate = "5th July 1998";
		String studentAddress = "A-908, Omega Society, Bharat Nagar, Pune.";
		int studentRollNumber = 56;
		
		void studentName(){
			System.out.println(studentName);
			System.out.println(studentMidleName);
			System.out.println(studentSurname);
		}
		
		void studentOtherDetails(){
			System.out.println(studentBirthdate);
			System.out.println(studentAddress);
			System.out.println(studentRollNumber);
		}
		
		public static void main(String[] args){
			StudentInfo studentInfo1 = new StudentInfo();
			studentInfo1.studentName();
			studentInfo1.studentOtherDetails();
		}	
}
