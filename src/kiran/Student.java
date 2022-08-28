package kiran;


class Student
{
	
	String name="kiran";
	int rn=24;
		
	void display()
	{
	System.out.println(name);
	System.out.println(rn);
	}
	
	void update()
	{
		name="harsh";
		int rn=28;
	}
		
	public static void main(String[] args)
	{
		Student s=new Student();
		s.update();
		Student s1=new Student();
		s1.display();
	}
}
	