package technocredits.basicexamples;

public class DataTypeDefaultValue {
	
	byte b; // 0
	
	short s; // 0
	int i; // 0
	long l; // 0
	
	float f; // 0.0
	double d;// 0.0
	
	char ch; //
	boolean flag; // false
	
	String str; // null
	
	void printDefaultValues() {
		System.out.println("Byte-" + b);
		System.out.println("Short-" + s);
		System.out.println("int-"+i);
		System.out.println("long-"+l);
		System.out.println("float-"+f);
		System.out.println("double"+d);
		System.out.println("char-"+ch);
		System.out.println("boolean-"+flag);
		System.out.println("String-"+str);
	}
	
	public static void main(String[] args) {
		new DataTypeDefaultValue().printDefaultValues();
	}
}
