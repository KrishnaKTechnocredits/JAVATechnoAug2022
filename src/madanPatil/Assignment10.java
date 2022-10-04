package madanPatil;

public class Assignment10 {
	int num;
	int count=0;
	void processdat(int num1,int num2) {
		for(num=num1;num<num2;num++) {
			if(num%3==0 && num%7==0) {
				System.out.println("number "+num+" ID divisible by 3 and 7");
				count++;
			}
			if(count>=3)
				break;
			}
		}
		
	public static void main(String[] args) {
		Assignment10 Ass10 = new Assignment10();
		Ass10.processdat(20,100);

	}

}
