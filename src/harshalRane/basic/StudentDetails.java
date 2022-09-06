package harshalRane.basic;

class StudentDetails{
	String name = "Harshal";
	int rno = 1;
	
	void display() {
		System.out.println(name);
		System.out.println(rno);
	}
	
	void update(){
		name = "Reyansh";
		rno = 10;
	}
	
	public static void main(String[] args){
		StudentDetails s1 = new StudentDetails();
		s1.display();
		s1.update();
		s1.display();
	}
}


