package shubhamG;

public class Test2 {

	void findRequiredNumbers(int targetNum) {
		int count = 0;
		int sum = 0;
		int initialNum = 1;
		while (sum < targetNum) {
			sum = sum + initialNum;
			initialNum++;
			count++;
		}
		System.out.println("Required Numbers starting from 1 whose sum is nearby " +targetNum+ " is :"+count);
	}

	public static void main(String[] args) {
		new Test2().findRequiredNumbers(50);
	}
}
