/*Assignment - 45
Java Program To Print Result Of  1^2 + 2^2 + 3^2 + 4^2 + 5^2  till number 10*/

package rashmiG.Assignment43_46;

public class Assignment45_SumOfNumbers {

	public void displaySumApproach1(int input, double power) {
		int sum = 0;
		double num;
		for (int index = 1; index <= input; index++) {
			num = Math.pow(index, power);
			sum = (int) (sum + num);
		}
		System.out.println("Approach1 Sum : " + sum);
	}

	public void displaySumApproach2(int input) {
		int sum = 0;
		for (int index = 1; index <= input; index++) {
				sum = sum + index * index;
		}
		System.out.println("Approach2 Sum : " + sum);
	}

	public static void main(String[] args) {
//	String num=String.valueOf(Math.pow(2,2));
//	num=num.substring(0,1);
//	System.out.println(num);
//	int ans = Integer.parseInt(num);
//	System.out.println(ans);
		Assignment45_SumOfNumbers assign = new Assignment45_SumOfNumbers();
		assign.displaySumApproach1(10, 2);
		assign.displaySumApproach2(10);
	}
}