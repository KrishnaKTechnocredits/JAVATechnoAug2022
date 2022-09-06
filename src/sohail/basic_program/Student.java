package sohail.basic_program;

class Student{
	String name="Sohail";
	int roll= 12;
	void Display(){
	System.out.println(name);
	System.out.println(roll);
	}
	public static void main(String [] args){
		Student s1= new Student();
		s1.Display();
	}
}