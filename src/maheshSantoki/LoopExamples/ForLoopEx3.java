package maheshSantoki.LoopExamples;

public class ForLoopEx3 {

	void divsible1(int startR, int endR) {
		int c = 0;
		System.out.println(
				"Between " + startR + " and " + endR + " Last threee numbers are divisible by 3 and 7 are : ");
		for (int i = endR; i >= startR; i--) {
			if (i % 3 == 0 && i % 7 == 0) {
				c++;
				System.out.println(i);
			}
			if (c == 3)
				break;
		}
	}

	public static void main(String[] args) {
		ForLoopEx3 forloop3 = new ForLoopEx3();
		forloop3.divsible1(10, 200);
	}
}
