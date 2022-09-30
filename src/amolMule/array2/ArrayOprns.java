package amolMule.array2;

/*
 Write a method to return sum of all not prime numbers from given array.
input : {11,13,17,22,44}
output : 66
Hint : (22+44 = 66)
*/
public class ArrayOprns {

	int getSumNP(int[] arr) {
		int s = 0;
		for (int i = 0; i < arr.length; i++) {
		}
		return s;
	}

	boolean checkPrime(int n) {
		boolean b = true;
		int flag = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = 1;
				b = false;
				break;
		
			}

		}
		return b;
	}
	
	int sumNP(int []arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		boolean b1=checkPrime(arr[i]);
		if(b1==false) {
			sum=sum+arr[i];
		}
		
		}
		return sum;
	}
	
	int sumNPDivi(int arr[]) {
		int sum=0;
		int num=0;
		for(int i=0;i<arr.length;i++) {
			boolean b=checkPrime(arr[i]);
			num= arr[i];
			if (b==false && num%5==0 && num%7==00) {
				sum=sum+num;
			}
			
		}
		return sum;
	}
	
	int getSumEven(int[] arr){
		int sum=0;
		//int sumOdd=0;
		//int diff=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			sum=sum+arr[i];
		}	
		
	}
				return sum;
	}
	
	int sumDiff(int[] arr) {
		int diff=0;
		int evenSum=0;
		int oddSum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) 
				evenSum=evenSum+arr[i];
			else
				oddSum=oddSum+arr[i];
			}
		
		if(evenSum>oddSum) {
			diff=evenSum-oddSum;
		}
		else
			diff= oddSum-evenSum;
		return diff;
	}
	

	public static void main(String[] args) {
		ArrayOprns ar = new ArrayOprns();
		//int n=49;
		/* boolean p = ar.checkPrime(n);
		if (p == true)
			System.out.println("Prime number " + n);
		else
			System.out.println("Not Prime number " + n);*/
		int[] arr= {11,13,17,22,44};
		int[] arr1= {11,35,17,105,44};
		int[] arr2= {10,11,15,6};
		
		int npSum=ar.sumNP(arr);
		System.out.println("Sum of not prime numbers is: "+npSum);
		System.out.println();
		
		int sum= ar.sumNPDivi(arr1);
		System.out.println("sum of not prime number and divisible by 5 and 7 are: "+sum);
		System.out.println();
		
		int sumEven=ar.getSumEven(arr2);
		System.out.println("sum of even number are  "+sumEven);
		System.out.println();
		
		int difference= ar.sumDiff(arr2);
		System.out.println("Difference of even and odd sum  is "+difference);
		
	}


}
