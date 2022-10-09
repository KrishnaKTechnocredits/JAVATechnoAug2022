package technocredits.blockdemo;

public class Example {
	int x = 10;
	
	{
		System.out.println("----DB Connection-----");
	}
	
	Example(){
		super();
		System.out.println(1);
	}
	
	Example(int num){
		super();
		System.out.println(2);
	}
	
	Example(int num1, int num2){
		super();
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		Example example = new Example();
	}
}
