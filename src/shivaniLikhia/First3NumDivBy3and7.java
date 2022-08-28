package shivaniLikhia;

public class First3NumDivBy3and7 {

	void countFirst3NumDivBy3and7(int startR,int endR) {
		int count=0;
		System.out.println("The first three Numbers divisible by 3 and 7 are : ");
		for(int index=startR;index<=endR;index++) {
			if(index%3==0 && index%7==0) {
				count++;
				if(count<=3) {
				System.out.println(index);
				}
			}	
		}
			
	}
	
	public static void main(String[] args) {
		First3NumDivBy3and7 first3NumDivBy3and7 = new First3NumDivBy3and7();
		first3NumDivBy3and7.countFirst3NumDivBy3and7(20, 100);
	}
}
