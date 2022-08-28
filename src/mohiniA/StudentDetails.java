
//Student has name and rollnumber and it should be prontable
package mohiniA;

class StudentDetails{
		String name = "Mohini";
		int rno= 1;
		
		void displayStudent(){
			System.out.println(name);
			System.out.println(rno);
		}
		
		void update(){
			name= "Sonal";
			rno=2;
		}
		
		public static void main(String[] args) {
			StudentDetails s1 = new StudentDetails();
			s1.displayStudent();
			s1.update();
			s1.displayStudent();
		}


}