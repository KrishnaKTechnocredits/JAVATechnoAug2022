package shubhamG;

public class Test1{
	
	void divisibleBy3and7(int startRange,int endRange) {
		System.out.println("First 3 numbers divisible by 3 and 7 in range:"+startRange+ " and "+ endRange);
		int count=0;
		for (int i=startRange;i<=endRange;i++) {
			if(i%3==0 && i%7==0) {
				count++;
				System.out.println("Numbers are :" +i); 
				if(count==3) {
					break;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Test1 test1=new Test1();
		test1.divisibleBy3and7(20,100);
	}
}
