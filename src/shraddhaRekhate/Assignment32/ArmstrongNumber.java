package shraddhaRekhate.Assignment32;
//Write a method to verify number is Armstrong or not 
public class ArmstrongNumber {
	
 void isArmstrong(int number) {
	 int originalNumber=number;
	 int sum=0;
	 while(number>0) {
		 int r=number%10;//getting remainder 153%10=3//15%10=5//1%10=1
		 sum=sum+(r*r*r);//3*3*3+5*5*5+1*1*1=153
		 number=number/10;//153/10=15//15/10=1
	 }
	 if(sum==originalNumber) {
		 System.out.println(originalNumber+ " is Armstrong number");
	 }else {
		 System.out.println(originalNumber+ " is not Armstrong number");
	 }
 }
 public static void main(String[] args) {
	 ArmstrongNumber armNumber= new ArmstrongNumber();
	 armNumber.isArmstrong(153);
	 armNumber.isArmstrong(123);
}
}
