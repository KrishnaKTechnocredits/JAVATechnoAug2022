package priyankaD.assignments_31_40;

public class Assignment_32 {
/*Program 1 : Write a method to verify number is Armstrong or not.
	        input : 153
			output : 153 is an Armstrong number
			input : 123
	        output : 123 is not an Armstrong number*/
		void isArmstrongNumber(int num) {
			System.out.println("Input-"+num);
			int OriginalNum=num;
			int ans=0;
			while(num>0) {
				int r=num%10;
				ans=ans+(r*r*r);
				num=num/10;
			}
			if(ans==OriginalNum)
			System.out.println(OriginalNum +" is an Armstrong number");
			else
				System.out.println(OriginalNum +" is not an Armstrong number");	
		}
/*Program 2 : Write a method to return reverse number.
	input : 123
	output : 321*/
		void returnReverseNum(int num) {
			System.out.println("Input-"+num);
			int revNum=0;
			while(num>0) {
				int r=num%10;
				revNum=revNum*10+r;
				num=num/10;
			}
			System.out.println("Reverse Output-"+revNum);
		}
/*Program 3 : write a method to verify number is palindrome.
             input : 1221
	         output : 1221 is a palindrome number
             input : 1231
	         output : 1231 is not a palindrome number*/
		void isPalindromeNum(int num) {
			System.out.println("Input-"+num);
			int originalNum=num;
			int revNum=0;
			while(num>0) {
				int r=num%10;
				revNum=revNum*10+r;
				num=num/10;
			}
			if(originalNum==revNum) 
				System.out.println(originalNum+" is a palindrome number.");
			else
				System.out.println(originalNum+" is not a palindrome number.");
		}
		public static void main(String[]args) {
			Assignment_32 assignment=new Assignment_32();
			assignment.isArmstrongNumber(153);
			assignment.isArmstrongNumber(123);
			System.out.println("------------------------------");
			assignment.returnReverseNum(123);
			System.out.println("------------------------------");
			assignment.isPalindromeNum(1221);
			assignment.isPalindromeNum(1231);
	}
}
