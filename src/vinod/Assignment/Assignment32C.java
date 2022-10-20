package vinod.Assignment;

import java.util.Arrays;

public class Assignment32C {
	boolean getNumPallindrom(String num) {
		boolean flag = true;
		for (int i = 0, j = num.length() - 1; i < j; i++, j--) {
			if (Character.getNumericValue(num.charAt(i)) != Character.getNumericValue(num.charAt(j))) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Assignment32C assignment32C = new Assignment32C();
		String[] num = { "1231", "1221" };
		System.out.println("Given number array is : " + Arrays.toString(num));
		for (String num3 : num) {
			String num2 = String.valueOf(num3);
			boolean flag = assignment32C.getNumPallindrom(num3);
			if (flag) {
				System.out.println("It is a pallidrom : " + num2);
			} else {
				System.out.println("It is not a pallidrom : " + num2);
			}
		}
	}

}