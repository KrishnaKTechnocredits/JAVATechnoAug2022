package technocredits.basicexamples.returnType;

public class C extends B{

	@Override
	B m1(){
		return new B();
	}
	
	void m2() {
		C c = null;
		try {
			c = new C();
			throw new NullPointerException();
		}catch(ArithmeticException ae) {
			
		}finally {
			if(c == null)
				throw new NullPointerException();
			else
				System.out.println("Hi");
		}
	}
}

