package vinod.BasicExample;

public class ExampleIncDec {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=a++ + ++b;
		int d = --a + --b + c--;
		System.out.println("sum = "+ d);
	}

}
