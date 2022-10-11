//Assignment - 32 : 30th Sep'2022

package komalShrivastava;

public class ArmstrongReversePalindrome {

	//method to check if input number is Armstrong or Palindrome and find Reverse of the input number.
	//Set armstrong as true to verify Armstrong number
	//Set reverse as true to find reverse of number
	//Set palindrome as true to verify palindrome
	
	static void findArmstrongReversePalindrome(int num, boolean armstrong, boolean reverse, boolean palindrome){
		int originalNum = num;
		int rem = 0;
		int sum = 0;
		int rev = 0;
		int num2 = 0;
		while(num>0) {
			rem = num%10;
			num = num/10;
			if(armstrong) {
				sum = sum + rem*rem*rem;
				if(num<=0 && originalNum == sum)
					System.out.println(originalNum + " is Armstrong number");
				else if(num<=0 && originalNum != sum)
					System.out.println(originalNum + " is not an Armstrong number");
			}	
			if(reverse) {
				rev = rev*10 + rem;
				if(num<=0)
					System.out.println("Reverse of " + originalNum + " is " + rev);
			}	
			if(palindrome) {
				num2 = num2*10 + rem;
				if(num<=0 && originalNum == num2) 
					System.out.println(originalNum + " is Palindrome");
				else if(num<=0 && originalNum != num2)	
					System.out.println(originalNum + " is not Palindrome");
			}	
		}
		if(!armstrong && !reverse && !palindrome)
			System.out.println("Please enter valid argument to find ArmStrong, Reverse or Palindrome number");
	}
	
	public static void main(String[] args) {
		System.out.println("Armstrong, Reverse and Palindrome number identification\n");
		
		findArmstrongReversePalindrome(153, true, false, false);
		System.out.println("--------------------------------------");

		findArmstrongReversePalindrome(123, false, true, false);
		System.out.println("--------------------------------------");
		  
		findArmstrongReversePalindrome(1221, false, false, true);
		System.out.println("--------------------------------------");
		  
		findArmstrongReversePalindrome(153, false, false, false);
		System.out.println("--------------------------------------");
		  
		findArmstrongReversePalindrome(3713, true, false, true);
		System.out.println("--------------------------------------");
		  
		findArmstrongReversePalindrome(121, true, true, true);
		System.out.println("--------------------------------------");  
	}
}