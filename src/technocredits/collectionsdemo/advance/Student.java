package technocredits.collectionsdemo.advance;

public class Student {

	int rno;
	String name;
	char grade;
	String city;
	
	public Student(int rno, String name, char grade, String city) {
		super();
		this.rno = rno;
		this.name = name;
		this.grade = grade;
		this.city = city;
	}

	public int getRno() {
		return rno;
	}

	public String getName() {
		return name;
	}

	public char getGrade() {
		return grade;
	}

	public String getCity() {
		return city;
	}
	
	/*
	 * @Override public int hashCode() { int hashcode = 0; for(int
	 * index=0;index<name.length();index++) { char ch = name.charAt(index); hashcode
	 * += ch; } return rno; }
	 */
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		return this.rno == student.rno && this.name.equals(student.name);
	}
}
