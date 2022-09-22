/*Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/

package shivaniLikhia;
import java.util.Arrays;

public class ReplaceIndex {

	int[] getReplacedIndex(int[] arr) {
		for(int index=0;index<arr.length-1;index++) {
			if(arr[index+1]<arr[index]) {
				arr[index]=0;
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		ReplaceIndex replaceIndex = new ReplaceIndex();
		int[] arr = {10,20,30,22,44,21,92,89};
		System.out.println("Input :" +Arrays.toString(arr));
		int[] output = replaceIndex.getReplacedIndex(arr);
		System.out.println("Output" +Arrays.toString(output));
	}
}
