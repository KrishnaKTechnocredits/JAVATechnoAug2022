package gauravSahu.loopExample;

public class LoopEx6 {

	void system(int x) {

		if (x > 1) {
			for (int index = x; index <= 10; index++) {
				if (x % index == 0) {
					System.out.println("This is " + x);
					break;
				}
			}
		} else {
			System.out.println("Number is invalid");
		}
	}

	public static void main(String[] args) {
		LoopEx6 loopEx6 = new LoopEx6();
		loopEx6.system(5);
		loopEx6.system(0);
	}

}
