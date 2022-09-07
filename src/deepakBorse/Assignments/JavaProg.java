package deepakBorse.Assignments;

public class JavaProg {
	int x;
	static int y;

	public static void main(String[] args) {
		JavaProg o1 = new JavaProg();
		JavaProg o2 = new JavaProg();
		o1.x=0;
		o1.y=0;
		o1.cal(1, 2);
		o2.x=0;
		o2.cal(2, 3);
		System.out.println(o1.x+o2.y);
	}

	void cal(int a, int b) {
		x+=a;
		y+=b;
		
	}

	
}