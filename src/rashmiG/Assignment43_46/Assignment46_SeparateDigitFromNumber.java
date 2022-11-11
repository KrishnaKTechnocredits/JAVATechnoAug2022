/*Assignment - 46
Java Program To Separate Each Digit From Number*/
//1291//1921

package rashmiG.Assignment43_46;

public class Assignment46_SeparateDigitFromNumber {

	public void displayDigitApproach1(int num) {
		System.out.println("Approach 1 ");
		String temp = "";
		int rem;
		while (num > 0) {
			rem = num % 10;
			temp = temp + rem;
			num = num / 10;
		}
		int targetNum = Integer.parseInt(temp);
		while (targetNum > 0) {
			rem = targetNum % 10;
			System.out.println(rem);
			targetNum /= 10;
		}
	}

	public void displayDigitApproach2(int num) {
		System.out.println("Approach 2");
		int temp = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			temp = temp * 10 + rem;
			num = num / 10;
		}
		while (temp > 0) {
			rem = temp % 10;
			System.out.println(rem);
			temp /= 10;
		}
	}

	public static void main(String[] args) {
		Assignment46_SeparateDigitFromNumber assign = new Assignment46_SeparateDigitFromNumber();
		assign.displayDigitApproach1(12918);
		assign.displayDigitApproach2(12918);
	}
}