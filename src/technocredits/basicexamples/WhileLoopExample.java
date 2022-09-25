package technocredits.basicexamples;

public class WhileLoopExample {

	void m1(int num) {
		
		while(num-- > 10);
		{
			System.out.println(num); //9
		}
	}
	
	public static void main(String[] args) {
		new WhileLoopExample().m1(12);
	}
}
