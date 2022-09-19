package gauravSahu.Other;

public class sample {

		boolean flag = true;
		
		void checkprime(int num){
			for(int index = 2; index<=num/2; index++){
				if (num%index==0){
					flag = false;
					break;
				}
			}if(flag == true){
				System.out.println("It is a prime number");
			}
		}
		
		void checknum(int startnum, int endnum){
			for(int num = startnum; num<=endnum; num++){
					checkprime(num);
			}
		}
		
		public static void main(String [] args){
			new sample().checknum(10,100);
		}

}
