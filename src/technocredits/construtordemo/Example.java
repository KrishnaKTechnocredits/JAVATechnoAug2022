package technocredits.construtordemo;

public class Example {

	public Example(int x){
		System.out.println(1);
	}
	
	String m1() {
		System.out.println("Hi");
		return "Hi";
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Example example = new Example(5);
		System.out.println("Credits");
		String temp = example.m1();
		System.out.println("end");
	}
}
