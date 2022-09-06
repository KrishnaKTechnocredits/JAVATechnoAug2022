package technocredits.staticnonstatic;

public class Example2 {
	
	static void m1() {
		System.out.println("Hi"); 
		Example2 example2 = new Example2();
		example2.m2(); 
	} 
	
	void m2() {
		System.out.println("Hello"); 
	} 
	
	 
}

//1. we can directly call ns method from another ns method.
//2. if we want to call non static method from static method 
// then we have to create object.
