package shraddhaRekhate.Assignent15;
//1. We need to do sum of first 5 prime number, using return keyword
//output: (2 + 3 + 5 + 7 + 11) = 28

public class SUmOfFirst5PrimeNum {
   int sumOfFirst5PrimeNum(int N){
	   int p=1;
	   int sum=0;
	   int num=2;
	   System.out.println("Sum of first"+N+"prime numbers is: ");
	   while(p<=N) {
		   boolean flag=true;
		  for(int index=2;index<=num/2;index++) {
			  if(num%index==0) {
				  flag=false;
				  break;
			  }
		  }
		  if(flag==true) {
			  sum=sum+num;
			  p++;
		  }
		  num++;
	   }
	   return sum; 
   }
   public static void main(String[] args) {
	   SUmOfFirst5PrimeNum sumOfFirst5PrimeNum=new SUmOfFirst5PrimeNum();
	   int sum=sumOfFirst5PrimeNum.sumOfFirst5PrimeNum(5);
	   System.out.println(sum);
   }
}
