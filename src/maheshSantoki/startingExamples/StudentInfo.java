//Assignment -5
//Mahesh santoki
package maheshSantoki.startingExamples;
class StudentInfo{
	
	void studentName( String Name, String middlename, String surname ){
		System.out.println( Name + "\n" + middlename + "\n" + surname );
	}
	void studentOtherDetail( String birthdate, String Address, int Rollnumber ){
		System.out.println( birthdate + "\n" + Address + "\n" + Rollnumber );
	}
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName("Mahesh" , "Mansukhbhai " , "Santoki" );
		studentinfo.studentOtherDetail("19th Sept 2002" , "03,Ananda,jodiya,jamnagar-361210" , 06);
	}
}