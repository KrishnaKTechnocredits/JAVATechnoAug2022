// new is keyword used to create memory
package amrutaSagne;
class StudentDetail{
	String name = "Amruta";
	int roll = 1;
	
	void display () {
		System.out.println (name);
		System.out.println (roll);
	}
	
	void update () {
			name = "Divyansh";
			roll = 10;
	}
	public static void main(String[] args){
		StudentDetail s1 = new StudentDetail();
		s1.display();
		s1.update();
		s1.display();
	}
}