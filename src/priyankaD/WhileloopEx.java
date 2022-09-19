package priyankaD;

public class WhileloopEx {
	void findReqNo(int targetNum) {
     int count=0;
     int no=0;
     int sum=0;
     while(sum<targetNum) {
    	 no++;
    	 sum=sum+no;
    	 count++;
     }
     System.out.println(count);
	}
	public static void main(String[]args) {
		WhileloopEx wle=new WhileloopEx();
		wle.findReqNo(50);
	}
}
