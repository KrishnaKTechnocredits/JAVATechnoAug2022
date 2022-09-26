package technocredits.construtordemo;

public class Student {
	int rno;
	String name;
	
	Student(int rno, String name){
		this.rno = rno;
		this.name = name;
	}
	
	Student(int rno){
		this.rno = rno;
		this.name = "";
	}
	
	
	void display() {
		System.out.println(rno + "-" + name);
	}
}
