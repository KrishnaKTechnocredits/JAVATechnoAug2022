//Program1
// Student has name and rollnumber and it should be printable
package jagruti;
class StudentDetails{
	String studentName =  "Dhruv";
	int rollno = 29;
	
	void displayInfoDetails(){//4
		System.out.println(studentName);//5
		System.out.println(rollno);		//6
	}//7
	void update(){
		studentName = "Jagruti";
		rollno = 10;
	}
	public static void main(String[] a){//1
		StudentDetails s1 = new StudentDetails();//2
		 s1.displayInfoDetails();//3
		 s1.update();
		 s1.displayInfoDetails();
	}//8
	
}