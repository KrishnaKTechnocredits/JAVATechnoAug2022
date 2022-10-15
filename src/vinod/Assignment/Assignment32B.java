package vinod.Assignment;

public class Assignment32B {
	
	void getRevNum(int num) {
		String revNum = " ";
		int remain = 0;
		while(num>0) {
			remain = num%10;
			num = num/10;
			revNum = revNum + remain;
		}
		System.out.println("Reverse of given num : " + revNum);
	}
	
	public static void main(String[] args) {
		Assignment32B assignment32B = new Assignment32B();
		int num = 123;
		System.out.println("Given number is : " + num);
		assignment32B.getRevNum(num);
		
	}

}