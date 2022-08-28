 //Student has name and rollnumber and it should be printable

package pranjaliV;

class Student{
	String name = "Pranjali";
	int rno = 1;
	
	void display(){//4
		System.out.println(name);//5
		System.out.println(rno);//6
	}//7
	
	public static void main(String[] a){ //1
		Student s1 = new Student();//2
		s1.display();//3
	}//8
}