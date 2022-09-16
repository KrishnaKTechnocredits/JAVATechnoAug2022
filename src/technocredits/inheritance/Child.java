package technocredits.inheritance;

public class Child extends Parent{
	
	public static void main(String[] args) {
		Child.x = 100;
		Parent.x = 1000;
		
		Parent p1 = new Parent();
		p1.x = 2000;
		
		Child c1 = new Child();
		c1.x = 3000;
		
		System.out.println(x);
		System.out.println(Child.x);
		System.out.println(Parent.x);
		System.out.println(c1.x);
		System.out.println(p1.x);
	}
}
