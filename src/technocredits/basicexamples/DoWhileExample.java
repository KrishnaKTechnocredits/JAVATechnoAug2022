package technocredits.basicexamples;

public class DoWhileExample {

	void m1(int num) {
		
		do{
			System.out.println(num); //2
			System.out.println("Hi");
			System.out.println("Hello");
			System.out.println("Credits");
			num--;
		}while(num > 10);
		System.out.println(num); // 1
		System.out.println("techno");
	}
	
	public static void main(String[] args) {
		DoWhileExample doWhileExample = new DoWhileExample();
		doWhileExample.m1(2);
	}
}
