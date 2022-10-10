/*Assignment - 35 : 7th Oct'2022

Program 2: return sum of all the digits from given String.
input : i have 15 years and 3 months of experience.
output : 9
Hint : Using Exception handling*/
package adittyThakare.exceptionHandling;

public class Assignment35_Program2 {
	int getSumOfAllDigitsFromString(String str) {
		int result = 0;
		String[] arr = str.split(" ");

		for (int index = 0; index < arr.length; index++) {
			try {
				int num = Integer.parseInt(arr[index]);
				while (num > 0) {
					int digit = num % 10;
					result = result + digit;
					num = num / 10;
				}
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment35_Program2 assignment35_Program2 = new Assignment35_Program2();
		String str = "i have 15 years and 3 months of experience.";
		System.out.println("Input String: " + str);
		System.out.println(
				"\nSum of digits from given String: " + assignment35_Program2.getSumOfAllDigitsFromString(str));

	}

}
