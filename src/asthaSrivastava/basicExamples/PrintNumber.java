package asthaSrivastava.basicExamples;

public class PrintNumber {
	
	int count=0;
	
	void print3No(int startnum,int endnum){
		for(int index=startnum;startnum<=endnum;index++) {
			if (index%3==0 && index%7==0) {
				System.out.println("Result is:"+index);
				count++;
			}
			if (count>=3)
				break;
		}
	}
		
		public static void main(String[] args) {
			PrintNumber printNumber = new PrintNumber();
			printNumber.print3No(20,100);
	}
}
