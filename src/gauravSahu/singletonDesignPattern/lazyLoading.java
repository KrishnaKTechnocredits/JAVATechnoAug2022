package gauravSahu.singletonDesignPattern;

public class lazyLoading {
	
	private static lazyLoading a; //Private static variable
	
	private lazyLoading(){ //Private Constructor
		
	}
	
	static lazyLoading getObject() { // Static Method which return the object of 
									  // that class
		if(a==null) {
			a=new lazyLoading();
			return a;
					
		}
		return a;
	}
}
