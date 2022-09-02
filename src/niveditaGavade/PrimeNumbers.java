package niveditaGavade;

public class PrimeNumbers {
	void allPrimeNum(int startNum, int endNum){
		int count =0;
		int sum=0;
		int avg=0;
			System.out.println("All prime numbers between 100 and 120 are:");
		for(int num=startNum; num<=endNum;num++){
		boolean primeFlag=true;

		for(int index=2;index<=num/2;index++){
			if(num%index==0){
				primeFlag=false;
				break;
			}
		}
		if(primeFlag==true){
			count++;
			System.out.println(num);
			sum=sum+num;
			avg=sum/count;
			}		
			}
			System.out.println("Count of all prime numbers between 100 and 120:"+count);
			System.out.println("sum of all prime numbers:"+sum);
			System.out.println("Avg of all prime numbers:"+avg);
		}
		public static void main(String[] args){
			PrimeNumbers primeNumbers= new PrimeNumbers();
			primeNumbers.allPrimeNum(100,120);
		}

}
