package anujaD;

public class Access {
int x =2;
	
	void display() {
		System.out.println(x);
	}
	void m1() {
		x=x+1;
	}


	public static void main(String[] args) {
		Access access1 = new Access();
		Access access2 = new Access();
		access1.m1();
		access2.m1();
		access1.m1();
		access1.display();
		
	}

}


