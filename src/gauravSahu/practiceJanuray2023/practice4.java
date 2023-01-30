package gauravSahu.practiceJanuray2023;

public class practice4 {
	
	void primeNum(int Num) {
		boolean flag = true;
		if(Num > 0) {
			for(int index = 2; index<Num/2;index++) {
					if(Num % index==0) {
						System.out.println("Number is prime  : " + Num);
						flag = false;
						break;
					}
			}if(flag) {
				System.out.println("Number is prime  : " + Num);
			}
		}
	}
	
	void pNum(int num) {
		
		if(num>1) {
			boolean flag = true;
			for(int index = 2; index<=Math.sqrt(num);index++) {
				if(num % index == 0) {
					flag = false;
					break;
				}
			}if(!flag) {
				System.out.println("Number is not a prime  : " + num);
			}else {
				System.out.println("Number is prime : " + num);
			}
		}
	}
	
	public static void main(String[] args) {
		practice4 p4 = new practice4();
		p4.primeNum(7);
		p4.pNum(10);
	}

}
