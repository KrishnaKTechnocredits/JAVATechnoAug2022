package sanket;

public class Test2{
	
	void findRequiredNumbers(int targetNum){
		
		int count = 0;
		int startNum = 1;
		int sum = 0;
		
		while (sum < targetNum){
			
			sum = sum + startNum;
			count++;
			startNum++;
		}
		
		System.out.println("To achieve the addition equal to or greater than "+targetNum+"; numbers required : " + count);
	}
	public static void main(String[] args){
		
		Test2 test = new Test2();
		test.findRequiredNumbers(50);
	}
}