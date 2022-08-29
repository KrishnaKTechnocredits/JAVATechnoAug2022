package rohanNaik;

public class Test1 {

	
	void m1(int start, int end) {
		int count=0;
		
		for(int index=start; index<=end; index++) {
			if(index%3==0 && index%7==0) {
				System.out.println(index);
				count++;
				if(count>=3)
					break;
			}
		}
	}
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.m1(20,200);
	}
	
}
