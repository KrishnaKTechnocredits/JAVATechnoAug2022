package nikeshM.Assignment32;

//Program 1 : 
//Write a method to verify number is Armstrong or not.
//
//input : 153
//output : 153 is an Armstrong number
//
//input : 123
//output : 123 is not an Armstrong number

public class Assignment32Program1 {
	int getArmstrongNo(int num) {
		int originalNo, remainder, result = 0;
		originalNo = num;

		while (num != 0) {
			remainder = originalNo % 10;
			result += Math.pow(remainder, 3);
			originalNo /= 10;

			if (result == num)
				System.out.println(num + " is Armstrong No ");
			else
				System.out.println(num + " is not Armstrong No");
		}
		return result;
	}

	public static void main(String[] args) {
		int num = (123);
		Assignment32Program1 p1 = new Assignment32Program1();
		p1.getArmstrongNo(num);

	}
}
