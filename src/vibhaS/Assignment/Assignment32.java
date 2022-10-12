package vibhaS.Assignment;

public class Assignment32 {

	// Write a program to return reverse number
	int getrevesenum(int num) {
		int rem;
		int revnum = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			revnum = revnum * 10 + rem;
		}
		return revnum;
	}

	// Write a program to return armstrome number
	int getArmstromenum(int num) {
		int ans = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			ans = ans + rem * rem * rem;
		}
		return ans;
	}

	// Write a program to return pallindrome number
	int getPallindrome(int num) {
		int revnum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			revnum = revnum * 10 + rem;
		}
		return revnum;
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		int num = 123;
		int ans = assignment32.getrevesenum(num);
		System.out.println("ORIGINAL NUMBER IS => " + num);
		System.out.println("REVERSE NUMBER IS => " + ans);
		System.out.println("");
		int num1 = 153;
		int ans1 = assignment32.getArmstromenum(num1);
		if (ans1 == num1) {
			System.out.println("Number is Amstrome => " + num1);
		} else {
			System.out.println("Number is not Amstrome  => " + num1);
		}
		int num2 =123 ;
		int ans2 = assignment32.getArmstromenum(num2);
		if (ans2 == num2) {
			System.out.println("Number is Amstrome => " + num2);
		} else {
			System.out.println("Number is not Amstrome  => " + num2);
		}
		System.out.println("");
		int num3 = 1221;
		int ans3 = assignment32.getPallindrome(num3);
		if (ans3 == num3) {
			System.out.println("Number is Pallindrome=> " + num3);
		} else {
			System.out.println("Number is not  Pallindrome= => " + num3);
		}
		int num4= 1231;
		int ans4 = assignment32.getPallindrome(num4);
		if (ans4 == num4) {
			System.out.println("Number is Pallindrome=> " + num4);
		} else {
			System.out.println("Number is not  Pallindrome= => " + num4);
		}
		
	}
}
