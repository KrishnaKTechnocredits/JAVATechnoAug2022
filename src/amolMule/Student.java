package amolMule;
class Student{
int rno=1;
String name="Amol";

void display(){
	System.out.println(rno);
	System.out.println(name);
	}
	
	public static void main(String args[]){
	Student s1= new Student();
	s1.display();
	}
	
}