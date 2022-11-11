/*Assignment - 44
Java Program To Print Result Of  1/2 + 2/3 + 3/4 + 4/5 + 5/6 till number 10*/

package rashmiG.Assignment43_46;

public class Assignment44_SumOffractionalNumbers {

	public void printSumOfNumbers(int input) {

		double sum = 0;
		for (double index = 1; index <= input; index++) {
			sum = sum + index / (index + 1);
		}
		Double ans = Double.parseDouble(String.format("%.4f", sum));
		System.out.println("Sum :" + ans);
	}

	public static void main(String[] args) {
		new Assignment44_SumOffractionalNumbers().printSumOfNumbers(10);

	}
}