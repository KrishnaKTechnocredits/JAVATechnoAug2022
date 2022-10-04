
/*
 * Assignment - 32 : 30th Sep'2022

Program 1 : 
Write a method to verify number is Armstrong or not.

input : 153
output : 153 is an Armstrong number

input : 123
output : 123 is not an Armstrong number
 
 */
package hindaviIngle;

public class Assignment32_ArmstrongNum {
	
	void isNumArmStrong(int num) {
		int orignalNum=num;
		int ans=0;
		while(num>0) {
			int r=num%10;//this will give last number eg 123%10==3
			//System.out.println(r);
			ans=ans+(r*r*r);
			num=num/10;		//this will remove last num 123/10==12	
		}
		if(ans==orignalNum) {
			System.out.println(orignalNum+" Number is Armstrong");		
		}
		else
		{
			System.out.println(orignalNum+" Number is not Armstrong");		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_ArmstrongNum a32=new Assignment32_ArmstrongNum();
		System.out.println("Input :");
		a32.isNumArmStrong(153);
		a32.isNumArmStrong(123);

	}

}
