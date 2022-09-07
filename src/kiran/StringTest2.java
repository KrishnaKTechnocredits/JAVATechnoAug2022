package kiran;

public class StringTest2 {
	
	String revString(String str) {
		String rev="";
		int len=str.length();
		for(int i=(len-1);i>=0;i--)
		{
			//System.out.print(str.charAt(i));
			rev=rev+str.charAt(i);
		}
			return rev;
	}
	
	void getEvenPosChar(String str) {
		String evenString="";
		for(int i=str.length()-1;i>=0;i--) {
			if(i%2!=0)
			System.out.print(str.charAt(i));
		}
	}
	
	void getDigitCount(String str) {
		String evenString="";
		int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))){
			 System.out.print(str.charAt(i));
			 sum=sum+Character.getNumericValue(str.charAt(i));
			}
		} 
		System.out.println();
		System.out.println(sum);
	}

	public static void main(String[] args) {
		StringTest2 obj=new StringTest2();
		String output=obj.revString("kiran");
		System.out.println(output);
		
		obj.getEvenPosChar("technocredits");
		System.out.println();
		obj.getDigitCount("Te8chno3cred7it9s");

	}

}
