//Student has name and roll num and it should b printable
package akankshaVyas.basicExamples;
class Student{
	String name= "Akanksha";
	int rno=1;
	void display(){
		System.out.println(name);
		System.out.println(rno);
		}
	void update(){
		name="Aaradhy";
		rno=2;
	}
	public static void main(String[] args){
		Student s1= new Student();
		s1.display();
		s1.update();
		s1.display();
		
	}
}