//Program:1
package maheshSantoki;
class Student{
	String name = "Mahesh";
	int no = 19;
	
	void display(){
		System.out.println(name);
		System.out.println(no);
	}
	public static void main(String[] args){
		Student s1 = new Student();
		s1.display();
	}

}