//Shift all Zero's at the end of an array.
//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}

package vinod.Assignment;
import java.util.Arrays;

public class Assignment29A {
	
	int[] getInt(int[] num) {
		int numpositive = 0;
		int[] num2 = new int[num.length];
		for(int index=0; index<num.length;index++) {
			if(num[index]!=0) {
				num2[numpositive] = num[index];
				numpositive++; 
			}
		}
		return num2;
	}
	
	public static void main(String[] args) {
		Assignment29A Assignment29A = new Assignment29A();
		int[] arr = { 10, 0, 0, 3, 4, 5, 0, 9 };
		int[] num = Assignment29A.getInt(arr);
		System.out.println("Input array : " + Arrays.toString(arr));
		System.out.println("Output array : " + Arrays.toString(num));
	}

}
