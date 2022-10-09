package technocredits.blockdemo;

public class Child extends Parent{
	
	{
		System.out.println(3);
	}
	
	Child(){
		super();
		System.out.println(2);
	}
	
	public static void main(String[] args) {
		Child child = new Child();
	}
}
