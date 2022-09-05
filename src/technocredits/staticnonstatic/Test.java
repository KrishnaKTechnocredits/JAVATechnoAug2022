package technocredits.staticnonstatic;

class Test{

	void m1(){
		m2();
		System.out.println("3");
	}
	
	static void m2(){
		System.out.println("2");
		m4();
	}
	
	void m3(){
		System.out.println("1");
		m1();
	}
	
	static void m4(){
		//m3(); // CE
		Test test = new Test();
		test.m3();
		System.out.println("4");
	}
	
	public static void main(String[] args){
		m2(); 
	}
}