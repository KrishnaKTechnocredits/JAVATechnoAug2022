package deepakPatil;

class Student {
	String name = "Deepak";
	int rollNo = 8;

	void display() {
		System.out.println(name);
		System.out.println(rollNo);
	}

	public static void main(String[] args) {
		Student a = new Student();
		a.display();

	}

}