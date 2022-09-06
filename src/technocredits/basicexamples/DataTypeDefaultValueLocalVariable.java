package technocredits.basicexamples;

public class DataTypeDefaultValueLocalVariable {
	
	void m1(){
		int x = 10;
		int y;
	}
	
	void printDefaultValues() {
		byte b; 
		
		short s; 
		int i; 
		long l; 
		
		float f; 
		double d;
		
		char ch; 
		boolean flag; 
		
		/*
		 * String str; // null System.out.println("Byte-" + b);
		 * System.out.println("Short-" + s); System.out.println("int-"+i);
		 * System.out.println("long-"+l); System.out.println("float-"+f);
		 * System.out.println("double"+d); System.out.println("char-"+ch);
		 * System.out.println("boolean-"+flag); System.out.println("String-"+str);
		 */
	}
	
	public static void main(String[] args) {
		new DataTypeDefaultValueLocalVariable().printDefaultValues();
	}
}
