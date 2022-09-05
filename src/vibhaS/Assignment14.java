package vibhaS;

public class Assignment14 {
	
	void getPrimeNumber(int n){
		int count=0;
		int num=2;
		
		while(count!=n){
			boolean flag=true;
			for(int index=2;index<=num/2;index++){
				if(num%index==0){
					flag=false;
					break;
				}
			}
			 if(flag==true){
				System.out.println("Given number is prime =>"+num);
				count++;
			}
			num++;
		}
	}
	
	public static void main(String[] args) {
		new Assignment14().getPrimeNumber(5);
	}
}
