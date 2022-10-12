/*Program 2 : 
Write a method to return reverse number.
input : 123
output : 321*/

package gauravSahu;

public class Assignment32B {
	
	void getRevNum(int num) {
		String revNum = " ";
		int remain = 0;
		while(num>0) {
			remain = num%10;
			num = num/10;
			revNum = revNum + remain;
		}
		System.out.println("Reverse of given num : " + revNum);
	}
	
	public static void main(String[] args) {
		Assignment32B a32 = new Assignment32B();
		int num = 123;
		System.out.println("Given number is : " + num);
		a32.getRevNum(num);
		
	}

}
