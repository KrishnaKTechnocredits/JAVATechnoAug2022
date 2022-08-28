package adwait;

class Student {
	String name = "Adwait";
	int rno = 01;
	
	void display (){
		System.out.println(name);
		System.out.println(rno);
	
	}
	
	public static void main (String[] args){
		Student s1 = new Student ();
		s1.display();
	}

}