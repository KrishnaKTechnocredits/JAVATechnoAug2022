//Program 2 : 

//Write a method to return reverse number.
//input : 123
//output : 321

package maheshSantoki.SpecialInterview;

public class ReverseNumber {
	int reverseNumber(int num) {
		int revNum = 0;
		while (num > 0) {
			int rem = 0;
			rem = num % 10;// Reminder for getting last digit of number
			revNum = revNum * 10 + rem;// for reverse number set;
			num = num / 10;// for removing Last digit of number;
		}
		return revNum;
	}

	public static void main(String[] args) {
		ReverseNumber revnum = new ReverseNumber();

		int input1 = 123;// input
		System.out.println("Given Number : " + input1);
		System.out.println("Reverse Number : " + revnum.reverseNumber(input1));

	}
}
