package maheshSantoki.LoopExamples;

public class WhileLoopEx1 {

	void findRequiredNumbers(int targetSum) {
		int count = 0;
		int sum = 0;
		while (sum <=targetSum) {
			count++;
			sum = sum + count;
		}
		System.out.println("Required Numbers for given Target sum " + targetSum + " are " + count + " Numbers");
	}

	public static void main(String[] args) {
		WhileLoopEx1 w1 = new WhileLoopEx1();
		w1.findRequiredNumbers(50);
	}
}