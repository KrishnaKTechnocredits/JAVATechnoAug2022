package nikitaPhase;
class Student{
    String name = "Nikita";
	int rno = 1;
	
	void display(){
	   System.out.println(name);
	   System.out.println(rno);
	   }
	public static void main(String [] args){
		Student s1 = new Student();
		s1.display();
	}
	
}