package shivaniLikhia;

public class Last3Num {
	
	void last3NumDivBY3and7(int startIndex,int endIndex) {
		int count=0;
		System.out.println("The last 3 Numbers Divisible by 3 and 7 are : ");
		for(int index=endIndex;index>=startIndex;index--) {
			if(count==3) {
				break;
			}
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
			}
		}
	}

	public static void main(String[] args) {
		new Last3Num().last3NumDivBY3and7(10,200);
	}
}
