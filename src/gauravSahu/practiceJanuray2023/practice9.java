package gauravSahu.practiceJanuray2023;

public class practice9 {
	boolean flag;
	int count;
	int sum ; 
	
	
	
	void checkPrimeNum(int num) {
		flag = true;
		if(num>1) {
			for(int index = 2;index<=num/2;index++) {
				if(num%index == 0) {
					flag  = false;
					break;
				}
			}
		}
	}
	
	void primeCount(int x, int y) {
		double avg = 0;
		for(int index = x;index<=y;index++) {
			checkPrimeNum(index);
			if(flag) {
				count++;
				sum = sum + index;
			}
		}System.out.println(count);
		System.out.println(sum);
		avg = sum/count;
		System.out.println(avg);
	}
	
	
	public static void main(String[] args) {
		practice9 p9 = new practice9();
		p9.primeCount(101,150);
		
	}
}
