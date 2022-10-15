package technocredits.basicexamples.returnType;

public class B extends A{
	
	@Override
	B m1(){
		return new B();
	}
}
