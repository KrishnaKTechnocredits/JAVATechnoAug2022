package shraddhaRekhate;

public class PrimeNumberWithMethods {
	   int printCount;
	   int printSum;
	   float average;
		
		void checkPrime(int num){
		   boolean flag=true;
		   for(int i=2;i<=num/2;i++){
			  if( num%i==0){
				  flag=false;
			      //System.out.println(num+"is not Prime num");
				  break;
			  }
		   }
		   if(flag==true){
			   System.out.println(num);
			   printCount++;
			   printSum=printSum+num;
			   average=printSum/printCount;
		   }
		}
		
		void printAllPrimeNum(int startRange, int endRange){
			for(int index=startRange;index<=endRange;index++){
				checkPrime(index);//call checkPrime method inside this method
			}   
			    System.out.println("total prime num within range:"+ printCount);
				System.out.println("sum of all prime number:"+ printSum);
				System.out.println("Avg of all prime number:"+ average);
		}
		
		public static void main(String[] args){
			PrimeNumberWithMethods primeNumberWithMethods=new PrimeNumberWithMethods(); 
			primeNumberWithMethods.printAllPrimeNum(100,120);
			
		}
}

