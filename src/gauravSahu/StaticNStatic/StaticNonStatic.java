package gauravSahu.StaticNStatic;
class StaticNonStatic{
	
	int a=1;
	static int b=1;
	
	void m1(){
		System.out.println("Gaurav" + a + b );
		a++;
		b++;
		m3();
	}
	
	static void m2(){
		StaticNonStatic s1 = new StaticNonStatic();
		s1.m1();
		System.out.println("Gaurav" + s1.a + b );
		s1.a++;
		b++;
	}
	
	void m3(){
		System.out.println("Raju");
		m2();
	}
	
	static void m4(){
		StaticNonStatic s2 = new StaticNonStatic();	
		s2.m1();	
		System.out.println("Gaurav" + s2.a + b );
	}
	
	public static void main(String[] args){
		m4();
	}
}