package vibhaS;

public class Assignment10 {
	int count=0;

	void processData(int num1,int num2) {
		System.out.println("Last three index is :-");
		for(int index=num2;index>=num1;index--) {
			if(index%3==0 && index%7==0) {
				System.out.println(" "+index);
				count++;
			}
			if(count==3){
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment10 assignment10=new Assignment10();
		assignment10.processData(10,200);
	}
}
