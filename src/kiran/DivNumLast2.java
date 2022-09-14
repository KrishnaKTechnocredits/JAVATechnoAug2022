package kiran;

public class DivNumLast2 {
	
	void processData(int startR, int endR)
	{
		int count=endR;
	for(int i=endR;i>=startR;i--){
			
			if (i % 3 == 0 && i % 7 == 0){
				
					System.out.println(i);
					count--;
			}
			if(count==(endR-3))
				break;
		} 
	}

	public static void main(String[] args) {
		 DivNumLast2 obj1=new DivNumLast2();
		 obj1.processData(10,200);

	}

}
