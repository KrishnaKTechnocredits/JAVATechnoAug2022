package technocredits.staticnonstatic;

public class Example3 {
	
	static void m1() {
		System.out.println("Hi"); 	
		m2();
	} 
	
	static void m2() {
		System.out.println("Hello"); 
	} 
	
	public static void main(String[] args) {
		m1();
	}
	 
}
/// ----------------- when all methods in same class ---------
//1. we can directly call ns method from another ns method.
//2. if we want to call non static method from static method 
// then we have to create object.
//3. static to static direct calling is allowed
