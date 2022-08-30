class Student{ 

String name = "AVANI";
int rno = 1;
void display(){
System.out.println(name);
System.out.println(rno);
}
public static void main(String[] arg){
	Student s1 = new Student() ;
	s1.display();
}
}