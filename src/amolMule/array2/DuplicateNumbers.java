package amolMule.array2;

public class DuplicateNumbers {

	void getDuplicate(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
					arr[j]=0;
				}
			}
			if(count!=0 && arr[i]!=0) {
			System.out.println(arr[i]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		DuplicateNumbers dl= new DuplicateNumbers();
		int[] arr= {10,12,44,12,77,67,12,44};
		System.out.println("Duplicate numbers from series");
		dl.getDuplicate(arr);
	}
	
	
	
}
