//Business Requirement - Print Student name and roll number.

package sanket;

class Student{
	String name = "ABS";
	int rno = 1;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
		
		public static void main (String[] a){
			Student s1 = new Student();
			s1.display();
			
		}		
} 

