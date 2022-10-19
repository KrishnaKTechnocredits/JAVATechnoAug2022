package avni.impAssignments ;
public class ReverseNumber {
	
	int getReverseNumber(int num){
		int revNum = 0;
		int remainder = 0;
		
		System.out.println("Original number is: " + num);
		
		System.out.println("-------------------------");
		
		while (num > 0) {
			remainder = num % 10;
			revNum = revNum * 10 + remainder;
			num = num /10;			
		}
		return revNum;
	}

	public static void main(String[] args) {
		int input = 123;
		System.out.println("Reverse Number is: " + new ReverseNumber().getReverseNumber(input));
	}
}
