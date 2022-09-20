package nehaniG;

public class Test4 {
	void getSumOfAllDigits(String[] name) {
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i] + "-> " + sumOfDigits(name[i]));
		}		
	}
	
	int sumOfDigits(String str) {
		int sum = 0;
		for(int index=0;index<str.length();index++) {
			char ch=str.charAt(index);
			if (Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}			
		}
		return sum;
	}

	public static void main(String[] args) {
		Test4 test4 = new Test4();
		String[] name = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println("Sum of all the digits in name : ");
		test4.getSumOfAllDigits(name);
	}

}
