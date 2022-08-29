package sonali;

public class divisibleBy {
	int count=0;
	void processData(int start_index,int end_index) {
		for(int i=start_index;i<=end_index;i++) {
			if(i%3==0 && i%7==0) {
				System.out.println("The first number divisible by 3 and 7 are: "+i);		
				count++;
			}
			
			if(count==3)
			break;
		}
		
	}
	public static void main(String[] args) {
		divisibleBy divisibleby = new divisibleBy();
		divisibleby.processData(20,200);
	}

}
