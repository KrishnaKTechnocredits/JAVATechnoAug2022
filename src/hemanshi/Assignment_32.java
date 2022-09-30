/*Assignment - 32 : 30th Sep'2022
Program 1 : 
Write a method to verify number is Armstrong or not.
input : 153
output : 153 is an Armstrong number
input : 123
output : 123 is not an Armstrong number*/

package hemanshi;

public class Assignment_32 {
	void checkArmstrongOrNot(int num) {
		int remain = 0; int ans = 0; int orginalNum = num;
		while (num > 0) {
			remain = num % 10;
			ans = ans + (remain * remain * remain);
			num = num / 10;
		}
		if (orginalNum == ans) {
			System.out.println(orginalNum + " is Armstrong Number");
		} else {
			System.out.println(orginalNum + " is not Armstrong Number");
		}
	}
	
	
/*Program 2 : 
		Write a method to return reverse number.
		input : 123
		output : 321*/
	
	
	int getReverseNum(int num) {
		System.out.println("Given input number is: " + num);
		int revNum = 0;
		int remain=0;
		while (num > 0) {
			remain = num % 10;
			revNum=revNum*10+remain;
			num = num / 10;
		}
		return revNum;
	}
	
/*Program 3 : 
	write a method to verify number is palindrome.
	input : 1221
	output : 1221 is a palindrome number
	input : 1231
	output : 1231 is not a palindrome number*/
	
	void checkParrindrome(int num) {
		int orgNum = num; int revNum = 0; int r = 0;
		while (num > 0) {
			r = num % 10;
			revNum = revNum * 10 + r;
			num = num / 10;
		}
		if (orgNum == revNum) {
			System.out.println(orgNum + " is a pallindrome number");
		} else {
			System.out.println(orgNum + " is not a pallindrome number");
		}
	}
	
	


	public static void main(String[] args) {
		Assignment_32 assignment_32 = new Assignment_32();

		assignment_32.checkArmstrongOrNot(153);
		assignment_32.checkArmstrongOrNot(123);
		System.out.println("##############################################################");
		
		System.out.println("Number in reverse order is: "+assignment_32.getReverseNum(123));
		System.out.println("##############################################################");
		
		assignment_32.checkParrindrome(1221);
		assignment_32.checkParrindrome(1231);
		System.out.println("##############################################################");
	}
	

}
