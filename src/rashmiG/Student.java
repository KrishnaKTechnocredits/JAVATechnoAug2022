package rashmiG;

class Student{
	String name = "Maulik";
	int rno = 1;
	
	void display(){
		System.out.println(name);
		System.out.println(rno);
	}
	
	void update(){
		name = "Harsh";
		rno = 10;
	}
	
	public static void main(String[] a){
		Student s1 = new Student();
		s1.display();
		s1.update();
		s1.display();
		
	}
}