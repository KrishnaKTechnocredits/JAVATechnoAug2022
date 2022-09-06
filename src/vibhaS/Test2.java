package vibhaS;

public class Test2 {

	void getSumCount(int targetnum) {
		int sum=0;
		int num=1;
		int count=0;
		while(sum<targetnum) {
			sum=sum+num;
			num++;
			count++;
		}
		System.out.println("Sum is => "+count);
	}
	
	public static void main(String[] args) {
		Test2 test2=new Test2();
		test2.getSumCount(50);
	}
}
