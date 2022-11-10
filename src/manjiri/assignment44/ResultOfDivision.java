/*Java Program To Print Result Of  1/2 + 2/3 + 3/4 + 4/5 + 5/6 till number 10*/

package manjiri.assignment44;

public class ResultOfDivision {
	
	void printResult(int n) {
		double sum = 0;
		double num = 0;
		for (double index = 1; index <= n; index++) {
			num = index/(index+1);
			sum = sum + num;
		}
		System.out.println("Sum of numbers is: " + String.format("%.2f",sum));
	}
	
	public static void main(String[] args) {
		new ResultOfDivision().printResult(10);
	}
}
