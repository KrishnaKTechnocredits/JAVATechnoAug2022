package deepakBorse.Polymorphism;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent a=new Child();
		Child child = new Child();
		child.m1();
		

	}

	 public void m1() {
		//System.out.println("BB m1");
	}
	public void m1(int i) {
		System.out.println("HP m1"+i);
	}
}
