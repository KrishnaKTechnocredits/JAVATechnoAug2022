package technocredits.staticnonstatic;

public class Example4 {
	
	void m1() {
		System.out.println("Hi"); 	
		m2();
	} 
	
	static void m2() {
		System.out.println("Hello"); 
	} 
	 
}
/// ----------------- when all methods in same class ---------
//1. we can directly call ns method from another ns method.
//2. if we want to call non static method from static method 
// then we have to create object.
//3. static to static direct calling is allowed
//4. we can directly call static method from non static method.

// n -> n (yes)
// s -> s (yes)
// n -> s (yes)
// s -> n (no)




