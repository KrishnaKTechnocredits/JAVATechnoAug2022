package rohanNaik;

class Student{
	int rollno = 1;
	String name = "Rohan";
	
	void display(){
		System.out.println(rollno);
		System.out.println(name);
	}
	
	public static void main(String[] a){
		Student s1 = new Student();
		s1.display();
		s1.display();
	}
}