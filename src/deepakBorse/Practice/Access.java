package deepakBorse.Practice;

public class Access {
	int x=2;
	void display() {
		
		System.out.println(x);
	}

	void m1() {
		x=x+1;
	}
	
	public static void main(String[] args) {
		Access Access1 = new Access();
		Access Access2 = new Access();
		Access1.m1();
		Access2.m1();
		Access1.m1();
		Access1.display();
		
		//System.out.println(test3.val2 +test3.val1);
	}
}
