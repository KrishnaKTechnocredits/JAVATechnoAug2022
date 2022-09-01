package priyankaD;

public class AllPrimeNo {
	int count=0;
	int sum=0;
	int avg=0;
	void processData(int num) {
		boolean primeFlag=true;
		for(int index=2;index<=num/2;index++) {
			if(num%index==0){
				primeFlag=false;
				break;
			}
		}
			if (primeFlag==true) {
			    count++;
			    System.out.println(num+" is a prime number.");
			    sum=sum+num;
			    avg=sum/count;
			    }
	}
 	void printAllPrime(int startR, int endR) {
		for(int num=startR;num<=endR;num++) {
			processData(num);
		}
    		System.out.println("Total prime numbers between "+startR+" and "+endR+" are: "+ count);
		    System.out.println("Sum of prime numbers between "+startR+" and "+endR+" is: "+ sum);
		    System.out.println("Avg of prime numbers between "+startR+" and "+endR+" is: "+avg);
	}
		public static void main(String[]args) {
        	 new AllPrimeNo().printAllPrime(100,120);
         }
   }

