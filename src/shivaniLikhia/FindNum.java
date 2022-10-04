package shivaniLikhia;

public class FindNum {
	
	void findTargetNum(int targetNum) {
		int num=1;
		int count=0;
		int sum=0;
		while(sum<targetNum) {
			sum = sum + num;
			count++;
			num++;
		}
		System.out.println("The number of sum of values closest to the Target Number given is : " +count);
	}
	
	public static void main(String[] args) {
		FindNum findNum = new FindNum();
		findNum.findTargetNum(50);
	}

}
