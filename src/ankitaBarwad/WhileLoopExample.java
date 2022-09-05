/*findRequiredNumbers(50);

input : 50
output : 10

input : 17
output : 6

1+2+3+4+5+6+7+8+9+10 = 55*/
package ankitaBarwad;

public class WhileLoopExample {

	void findRequiredNumbers(int targetNum) {

		int totalSum = 0;
		int count = 0;
		int index = 1;

		while (totalSum < targetNum) {
			totalSum = totalSum + index;
			index++;
			count++;
		}
		System.out.println("Target Count : " + targetNum + ", Count : " + count);
	}

	public static void main(String[] args) {
		WhileLoopExample ex1 = new WhileLoopExample();
		ex1.findRequiredNumbers(50);
		ex1.findRequiredNumbers(17);
	}
}
