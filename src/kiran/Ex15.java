package kiran;

public class Ex15 {
	
	void findReqNum(int targetNum) {
		int count=0;
		int sum=0;
		while(sum<targetNum)
		{
			count++;
			sum=sum+count;
			
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Ex15 obj=new Ex15();
		obj.findReqNum(17);

	}

}
