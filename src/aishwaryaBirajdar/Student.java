package aishwaryaBirajdar;

class Student {
	String name = "Aishwarya";
	int rollno = 2;
	
	void display(){
	System.out.println(name);
	System.out.println(rollno);
	
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.display();
	}
}