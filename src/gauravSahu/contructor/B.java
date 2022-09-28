package gauravSahu.contructor;

public class B extends A{
	
	int a = 20;
	int b = 30;
	
	void m1() {
		System.out.println("B m1");
	}
	
	B(){
		super(10,20);
		System.out.println(super.x);
	}
	
	B(String name){
		super("Gaurav", 50);
		System.out.println("B2 constr" + super.x );
		B b3 = new B();
		b3.m1();
		this.m1();
		super.m1();
		
	}
	
	B(int e,int f){
		this();
		System.out.println("B Contr " + this.a + this.b);
	}
	
	public static void main(String[] args) {
		B b1 = new B(10,20);
		B b2 = new B("Garvis");
		b1.m1();
		b2.m1();
		A a1= new B();
		a1.m1();
		System.out.println(a1.x); 
		System.out.println(a1.x); 
		
	}
}
