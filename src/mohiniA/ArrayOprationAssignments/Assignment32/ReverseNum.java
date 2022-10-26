/*********Assignment - 32 : 30th Sep'2022

Program 2 : 
Write a method to return reverse number.
input : 123
output : 321

*********/

package mohiniA.ArrayOprationAssignments.Assignment32;

public class ReverseNum {
	
	static int getReverseNum(int num) {
		int revNum=0;
		while(num>0) {
			int r = num%10;
			revNum = (revNum * 10)+ r;
			num = num/10;
		}
		return revNum;
	}
	
	public static void main(String[] args) {
		ReverseNum obj32 = new ReverseNum();
		
		int input1 = 123 ;
		System.out.println("Reverse num of "+input1 + " is: "+obj32.getReverseNum(input1));
		
	}

}
