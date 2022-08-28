package pranjaliV;

public class Test1Pranjali {
	
	void divisibleBy3and7(int start,int end){
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 7 are: ");
		for(int index=start; index<=end; index++) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
				if(count==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test1Pranjali test1 = new Test1Pranjali();
		test1.divisibleBy3and7(20,100);
	}

}
