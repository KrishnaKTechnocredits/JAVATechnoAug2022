package technocredits.staticnonstatic;

public class Example1 {
	
	void m1() {
		System.out.println("Hi"); //3
		m2(); //4 
	} //7
	
	void m2() {
		System.out.println("Hello"); //5
	} //6
	
	public static void main(String[] args) {
		Example1 example1 = new Example1(); //1
		example1.m1(); //2
		System.out.println("End");
	} //8
}

//1. we can directly call ns method from another ns method.
