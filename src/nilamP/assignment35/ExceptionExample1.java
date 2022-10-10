
/*Assignment - 35 : 7th Oct'2022

Program 1 : return sum of all the numbers from given String.
input : i have 15 years and 3 months of experience.
output : 18
Hint : Exception handling, Interger.parseInt(string str) -> to convert string to int. 
if we couldn't covert string to int for any word, it throws NumberFormatException.
*/
package nilamP.assignment35;

public class ExceptionExample1 {
	int getSumofNumbers(String input) {
		String[] inputarr = input.split(" ");
		int sum = 0;
		int num = 0;
		System.out.print("total sum : ");
		for (int i = 0; i < inputarr.length; i++) {
			try {
				num = Integer.parseInt(inputarr[i]);
				sum = sum + num;

			} catch (NumberFormatException ne) {
				// TODO: handle exception
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample1 ex = new ExceptionExample1();
		String input = " i have 15 years and 3 months of experience. ";
		System.out.println("input : " + input);
		System.out.println(ex.getSumofNumbers(input));

	}
}
