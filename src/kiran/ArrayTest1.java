package kiran;

public class ArrayTest1 {
	
	void printArray(int[] arr) {
		System.out.print("array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	void printStringArray(String[] arr) {
		System.out.print("array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	int getSumOfArray(int[] arr) {
		int sum=0;
		printArray(arr);
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	boolean isPrimeNum(int num) {
		if(num<=1)
			return false;
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		//System.out.println(num+" is prime number");
		return true;	
	}

	
	void getPrimeNum(int num){
		//int count=0;
		for(int i=2;i<=num;i++) {
			if(isPrimeNum(i)) {
				System.out.println(i+" ");
				//count++;
			}
			//if(count==5)
			//	break;
		}
		//System.out.println("total prime number count = "+count);
	}
	
	int sumOfPrimeNum(int num) {
		int sum=0;
		System.out.println("prime numbers upto : "+num);
		for(int i=2;i<=num;i++) {
			if(isPrimeNum(i)) {
				System.out.println(i+" ");
				sum=sum+i;
				}
		}
		return sum;
	}
	
	
	int sumOfPrimeNumArray(int[] arr) {
		int sum=0;
		printArray(arr);
		System.out.println("\nprime numbers are: ");
		for(int i=0;i<arr.length;i++) {
			if(isPrimeNum(arr[i])) {
				System.out.println("\t"+arr[i]+" ");
				sum=sum+arr[i];
				}
		}
		return sum;
	}

	int getArrMax(int[] arr) {
		int max=arr[0];
		printArray(arr);
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	
	int getArrMin(int[] arr) {
		int min=arr[0];
		printArray(arr);
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	
	}
	char getMidChar(String str){
		int len=str.length();
		char midchar;
		if(len%2!=0) {
			midchar=str.charAt(len/2);
			return midchar;
		}
		else
		{
			midchar=str.charAt((len/2)-1); 
			return midchar;
		}
	}
	
	void getMidCharOfArrayElement(String[] arr) {
		printStringArray(arr);
		System.out.println("\n ");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Middle character of string "+arr[i]+" is: "+getMidChar(arr[i]));
			
			}
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[] {10,20,30};
		ArrayTest1 obj=new ArrayTest1();
		//obj.printArray(a);
		System.out.println();
		int[] a1=new int[] {10,11,15};
		System.out.println("\n"+"Sum of array elements : "+obj.getSumOfArray(a1));
		System.out.println();
		int[] a2=new int[] {11,14,17,22,44};
		System.out.println("Sum of prime numbers : "+obj.sumOfPrimeNumArray(a2));
		System.out.println();
		int[] a3=new int[] {11,4,55,23,43};
		System.out.println("\nMaximum number from array : "+obj.getArrMax(a3));
		System.out.println();
		int[] a4=new int[] {11,4,55,23,43};
		System.out.println("\nMinimum number from array : "+obj.getArrMin(a4));
		String[] a5=new String[]{"Ashish","Aditty","Manjiri","Ankita"};
		System.out.println("\nMinimum number from array : ");
		obj.getMidCharOfArrayElement(a5);
		//System.out.println("3 is prime number: "+obj.isPrimeNum(3));
		//obj.getPrimeNum(20);
	}

}
