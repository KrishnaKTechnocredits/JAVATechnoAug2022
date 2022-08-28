package pankajBhatt;

//Student has name and roll no, print these details

class Student{

	String name = "Pankaj Bhatt";
	int rollNumber = 705113;
	
	void display(){
		System.out.println("Student's Name : "+name);
		System.out.println("Student's roll Number : "+rollNumber);
	}
	
	void update(){
		name = "Infosys";
		rollNumber = 1027555;
	}
	
	public static void main(String[] args){
		Student student1 = new Student();
		student1.display();
		student1.update();
		student1.display();
		
		Student student2 = new Student();
		student2.display();
	}
}
