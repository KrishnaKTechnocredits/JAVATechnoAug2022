package amolMule;

public class SecondLargestArray {

	int[] secondLarge(int[] arr) {
		//2 4 3 6 8 1
		int num=0;
		int temp=0;
		int[] output= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]< arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=arr[i];
					
				}
			}
			
		}
		
		return output;
	}

public static void main(String[] args) {
	SecondLargestArray second= new SecondLargestArray();
	int[] arr= {3,4,7,2,3,6,5};
	int[] op= new int[arr.length];
	op=second.secondLarge(arr);
	int n= op[1];
	//op=second.secondLarge(arr[1]);
	System.out.println(n);
	
}

}
