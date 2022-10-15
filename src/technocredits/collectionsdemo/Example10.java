package technocredits.collectionsdemo;

import java.util.ArrayList;

public class Example10 {

	Student getStudentDetails() {
		Student student = new Student(1,"Vinod",'A');
		System.out.println(student);
		return student;
	}
	
	ArrayList<Student> getAllStudentDetails() {
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		Student student1 = new Student(1,"Vinod",'A');
		Student student2 = new Student(2,"Hardik",'B');
		Student student3 = new Student(3,"Vrinda",'C');
		
		listOfStudents.add(student1);
		listOfStudents.add(student2);
		listOfStudents.add(student3);
		
		return listOfStudents;
	}
	
	void displayAllData() {
		ArrayList<Student> listOfStudents = getAllStudentDetails();
		System.out.println(listOfStudents);
		for(Student student: listOfStudents) {
			System.out.println(student);
		}
	}
	
	void display() {
		Student std = getStudentDetails();
		System.out.println(std);
		System.out.println(std.getRno());
		System.out.println(std.getName());
		System.out.println(std.getGrade());
	}
	
	public static void main(String[] args) {
		Example10 example10 = new Example10();
		example10.displayAllData();
		
		String str = new String("Rashmi");
		System.out.println(str.toString()); // 
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maulik");
		al.add("Aashvi");
		al.add("Rashmi");
		al.add(str);
		
		System.out.println(al);// [Maulik, Aashvi, Rashmi]
	}
}

