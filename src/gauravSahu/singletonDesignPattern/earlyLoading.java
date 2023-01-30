package gauravSahu.singletonDesignPattern;

public class earlyLoading {
	
	private static earlyLoading el = new earlyLoading(); 
// Private static reference variable of datatype of that class.
	
	private earlyLoading() { 
// private constructor
	}
	
	static earlyLoading getObject() { 
// static method which return object of that class
		return el;
	}
/* Eager Loading is a design pattern 
	in which data initialization occurs on the spot. Lazy Loading 
	is a design pattern that we use to defer initialization of an object
	as long as it's possible */
}
