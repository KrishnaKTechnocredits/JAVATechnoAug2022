package harshadaJagtap;

class Student {
	String name = "Harshada";
	int rNo = 1;
	
	void stdentInfo(){ 
		System.out.println(name);	
		System.out.println(rNo);	
	}	
	
	void update(){
		name="Genius";
		rNo=11;
	}
	
	public static void main(String[]args){	
		Student s1 = new Student();
		s1.stdentInfo();
		s1.update();	
		s1.stdentInfo();
	}	
	
	
}