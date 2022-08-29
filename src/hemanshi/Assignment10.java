package hemanshi;

public class Assignment10 {
	int num;
	int count = 0;
    void processData(int num1,int num2) {
    	for(num=num1;num<num2;num++) {
    		if(num%3==0 && num%7==0) {
    			System.out.println("Number "+num+" is divisible by 3 and 7");
    			count++;
    		}
    		if(count>=3)
    			break;
       }
    }
    public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.processData(20,100);
				
	}

}
