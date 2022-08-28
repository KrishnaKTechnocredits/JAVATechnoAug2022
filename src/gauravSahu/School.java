

package gauravSahu;


class School{
	String name="Gaurav";
	int rollno=24;
	
	void display(){
		System.out.println(name);
		System.out.println(rollno);
	}
	void update(){
		System.out.println(name="Garvis");
		System.out.println(rollno=40);
	}

	public static void main(String[] args){
		School s1=new School();
		s1.display();
		s1.update();
	}
}