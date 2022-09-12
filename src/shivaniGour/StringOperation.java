package shivaniGour;

public class StringOperation {
	String revName = "";
    String evenChar = "";
    String evenCharRev ="";
	String reverseName(String name) {
		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		return revName;
	}
	
	String getEvenChar(String name) {
		for (int i = 0; i <= name.length() - 1; i++) {
			if(i%2==1) {
				evenChar = evenChar + name.charAt(i);
			}
		}
		return evenChar;
	}
	
	String getEvenCharRev(String name) {
		for (int i = name.length() - 1; i >= 0; i--) {
			if(i%2==1) {
				evenCharRev = evenCharRev + name.charAt(i);
			}
		}
		return evenCharRev;
	}
	
	int getCountDigits(String name) {
		int count = 0;
		
		for (int i = 0; i <=name.length() - 1 ; i++) {
			if(Character.isDigit(name.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	
	int getDigitSum(String name) {
		int digitSum = 0;
		
		for (int i = 0; i <=name.length() - 1 ; i++) {
			int ch = name.charAt(i);
			
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				digitSum = digitSum + num;	
			}
		}
		return digitSum;
	}

	public static void main(String[] args) {
		StringOperation var = new StringOperation();
		String name = "Aditya";
		String name1 = "Tech4no46cred17ts1";
		System.out.println("Reverse Name of "+name+" is: "+var.reverseName(name));
		System.out.println("Even Chars of "+name+" is: "+var.getEvenChar(name));
		System.out.println("Reverse of Even Chars of "+name+" is: "+var.getEvenCharRev(name));
		System.out.println("Count of digits in "+name1+" is: "+var.getCountDigits(name1));
		System.out.println("Sum of digits in "+name1+" is: "+var.getDigitSum(name1));
	}

}
