package kiran.Assignment32.ReversePalindromArmstrong;

public class ReversePalindromArmstrong {
	
	int reverse(int num) {
		System.out.println("input: "+num);
		int rev=0;
		int rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}
	void palindrom1(int num) {
		int rev=reverse(num);
		if(rev==num)
			System.out.println(num+" number is palindrom");
		else
			System.out.println(num+" number is not palindrom");
	}
	
	void checkPalindromNumber(int num) {
		System.out.println("input: "+num);
		int orgnum=num;
		int rev=0;
		int rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(orgnum==rev)
			System.out.println(orgnum+" is a palindrom number");
	}
	
	void checkArmstrongNumber(int num) {
		System.out.println("input: "+num);
		int rem,armnum=0;
		int orgnum=num;
		while(num>0) {
			rem=num%10;
			armnum=armnum+(rem*rem*rem);
			num=num/10;
		}
		if(orgnum==armnum) 
			System.out.println(orgnum+" is armstrong number");
		else
			System.out.println(orgnum+" is not armstrong number");
		
	}

	public static void main(String[] args) {
		ReversePalindromArmstrong obj=new ReversePalindromArmstrong();
		obj.checkArmstrongNumber(153);
		obj.checkArmstrongNumber(123);
		System.out.println("reverse is "+obj.reverse(123));
		obj.checkPalindromNumber(1221);
		obj.palindrom1(1231);

	}

}
