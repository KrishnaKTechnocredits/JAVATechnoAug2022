package gauravSahu.Encapsulation;

public class Student {
	
	void setMark() {
		Teacher t = new Teacher();
		t.getMark(-100);
	}
	
	public static void main(String[] args) {
		Student s = new Student();
	}
}
