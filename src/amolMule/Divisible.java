package amolMule;

public class Divisible {

	void ProcessData(int start,int end) {
		int count=0;
		for(int i=start;i<= end;i++) {
			if(i%3==0 && i%7==0) {
				System.out.println(i);
				count=count+1;
			}
		if(count==3)
		break;
		}
	}

	public static void main(String args[]) {
		Divisible div= new Divisible();
		div.ProcessData(20, 100);
	}
	
}
