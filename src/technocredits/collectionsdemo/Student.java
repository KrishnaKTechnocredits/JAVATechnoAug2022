package technocredits.collectionsdemo;

// POJO : 
public class Student {
	private int rno;
	private String name;
	private char grade;
	
	public Student(int rno, String name, char grade) {
		super();
		this.rno = rno;
		this.name = name;
		this.grade = grade;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return rno + "-->" + name + "-->" + grade;
	}
}
