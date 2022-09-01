package kiran;

public class DivNum{
	int count=0;
	void processData(int startR, int endR)
	{

	for(int i=startR;i<=endR;i++){
			
			if (i % 3 == 0 && i % 7 == 0){
				
					System.out.println(i);
					count++;
			}
			if(count==3)
				break;
		} 
		
		
	}
	
	public static void main(String[] args) {
	 DivNum obj1=new DivNum();
	 obj1.processData(20,100);
	}

}
