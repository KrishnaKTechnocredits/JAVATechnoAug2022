
/*Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/
package nilamP.assignment35;

public class ExceptionExample2 {
	int getsumofAllDigit(String input) {
		String[] inputarr = input.split(" ");
		int sum = 0;
		int num = 0;
		System.out.print("sum of digits : ");
		for (int i = 0; i < inputarr.length; i++) {
			for (int j = 0; j < inputarr[i].length(); j++) {
				try {
					char ch = inputarr[i].charAt(j);
					num = Integer.parseInt(String.valueOf(ch));
					sum = sum + num;
				} catch (NumberFormatException e) {
					// TODO: handle exception
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionExample2 ex = new ExceptionExample2();
		String input = " i have 15 years and 3 months of experience.";
		System.out.println("input : " + input);
		System.out.println(ex.getsumofAllDigit(input));
	}

}
