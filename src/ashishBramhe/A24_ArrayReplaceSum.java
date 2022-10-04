package ashishBramhe;

public class A24_ArrayReplaceSum {

	void printArray(int a[]) {
		System.out.print(" {");
		for(int i=0; i<a.length; i++)
		{
			if(i==(a.length-1))
				System.out.print(a[i] + "} ");
			else
				System.out.print(a[i] + ",");
		}
	}
	
	int[] replaceElementsWithSumOfOthers(int a[]) {
		int b[] = new int[a.length], sum=0;
		for(int i=0; i<a.length; i++) {
			sum=0;
			for(int j=0;j<a.length; j++) {
				if(i!=j) 
					sum=sum+a[j];		
			}
			b[i]=sum;			
		}
		return b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {12,2,11,17};
		A24_ArrayReplaceSum arrayReplaceSum = new A24_ArrayReplaceSum();
		System.out.println("\n Input array before processing : ");
		arrayReplaceSum.printArray(a);
		System.out.println("\n Input array after processing : ");
		arrayReplaceSum.printArray(arrayReplaceSum.replaceElementsWithSumOfOthers(a));		
	}
}
