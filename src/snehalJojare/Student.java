package snehalJojare;

class Student{
	int rno = 1;             //Instance Variable
	String name = "Adwait";  //Instance Variable
	
	void display(){
		//int marks = 100;  //Local Variable
		System.out.println(name);
		System.out.println(rno);
	}
	
	public static void main(String[] args){
		Student student1 = new Student ();
		//Student student2 = new Student ();
		//student1.display();
		//student1.rno;
		System.out.println(student1.rno);
	}
}