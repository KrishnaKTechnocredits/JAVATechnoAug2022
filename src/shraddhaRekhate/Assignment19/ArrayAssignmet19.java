package shraddhaRekhate.Assignment19;

public class ArrayAssignmet19 {
	//get sum of elements in given array
	int getSUmOfAllNumInGivenArray(int[] arr) {
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			sum=sum+arr[index];
		}
    return sum;
	}
	
	
	public static void main(String[] args) {
		ArrayAssignmet19 obj1=new ArrayAssignmet19();
		int[] arr= {10,11,15};
		int arraySum=obj1.getSUmOfAllNumInGivenArray(arr);
		System.out.println("Sum of all no. in given array"+arraySum);
	}
}
