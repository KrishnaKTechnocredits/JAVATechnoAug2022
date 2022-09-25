package shraddhaRekhate.Assignment19;

public class Assignment19_1 {
	//return sum of all prime number in given array
		boolean checkPrime(int num) {
			boolean flag=false;
			 for(int index=2;index<=num/2;index++) {
				    if(num%index==0) {
					    flag=true;
					    break;
				     }
				    else {
				    	flag=false;
				    }
				  }
			 return flag;
		}
		int getSUmOfAllPrimeNoInGivenArray(int[] arr) {
			int primeSum=0;
			for(int index=0;index<arr.length;index++) {
			 boolean flag=checkPrime(arr[index]);
			 if(flag==false) {
				 primeSum=primeSum+arr[index];
			   }
		    }
			return primeSum;
		}
		public static void main(String[] args) {
			Assignment19_1 obj2=new Assignment19_1();
		
			int[] arr2= {11,14,17,22,44};
			int temp2=obj2.getSUmOfAllPrimeNoInGivenArray(arr2);
			System.out.println("Sum of all prime no. in givnr array is "+temp2);
		}
}
