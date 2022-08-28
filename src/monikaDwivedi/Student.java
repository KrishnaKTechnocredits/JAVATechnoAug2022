package monikaDwivedi;
// Student has name and roll number and it should be printable.
class Student{
	String name = "Monika";
	int rollNumber = 1;
	
	void display(){
		System.out.println(name);
		System.out.println(rollNumber);
	}
	
	void update(){
		name = "Alok";
		rollNumber = 2;
	}
	public static void main(String[] a){
		Student s1 = new Student();
		
		s1.update();
		s1.display();
		s1.display();
	}
}