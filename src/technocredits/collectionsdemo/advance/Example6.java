package technocredits.collectionsdemo.advance;

import java.util.HashMap;
import java.util.HashSet;

public class Example6 {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Vibha", 'A', "Pune");
		Student student2 = new Student(1, "Vibha", 'A', "Pune");

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		System.out.println(student1 == student2);
		System.out.println(student1.equals(student2));

		
		
		HashSet<Student> hs = new HashSet<Student>();
		hs.add(new Student(1, "Vibha", 'A', "Pune"));
		hs.add(new Student(13, "Tejas", 'B', "Kol"));
		hs.add(new Student(2, "Gaurav", 'A', "Pune"));
		hs.add(new Student(1, "Vibha", 'A', "Pune"));
		hs.add(new Student(1, "Vibha", 'A', "Pune"));

		System.out.println(hs.size());

	}
}
