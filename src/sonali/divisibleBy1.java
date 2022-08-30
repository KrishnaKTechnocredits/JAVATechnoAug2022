package sonali;

public class divisibleBy1 {
	void breakLoop(int start_index,int end_index) {
	int count=0;
	System.out.println("Last 3 numbers divisible by 3 and 7 from "+start_index+" and "+end_index+" are: ");
	
		for(int i=end_index;i>=start_index;i--) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);		
				count++;
			}
			
			if(count==3)
			break;
		}
		
	}
	public static void main(String[] args) {
		divisibleBy1 divisibleby1 = new divisibleBy1();
		divisibleby1.breakLoop(10,200);
	}

}
