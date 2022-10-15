package technocredits.collectionsdemo;

import java.util.TreeSet;

public class Example17 {

	void m1(Student s) {
		
	}
	
	public static void main(String[] args) {
		TreeSet<Student> setOfStudents = new TreeSet<Student>();
		
		Student student1 = new Student(1,"Puja",'A');
		Student student2 = new Student(2,"Gaurav",'A');
		Student student3 = new Student(10,"Puja",'A');
		
		setOfStudents.add(student1);
		setOfStudents.add(student2);
		setOfStudents.add(student3);
		
		for(Student std : setOfStudents) {
			System.out.println(std);
		}
		System.out.println(setOfStudents.size());
	}
}
