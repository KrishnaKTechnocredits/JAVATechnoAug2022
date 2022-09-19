
package shivaniLikhia;
import java.util.Arrays;

public class VisibleTreeHeigth {

	int getVisibleTreeHeigth(int[] arr) {
		int maxHeigth=arr[0];
		int count=1;
		for(int index = 0;index<arr.length;index++) {
			if(maxHeigth<arr[index]) {
				maxHeigth = arr[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		VisibleTreeHeigth visibleTreeHeigth = new VisibleTreeHeigth();
		int[] input = {3,5,11,9,10,13};
		System.out.println(Arrays.toString(input));
		System.out.print("Total numbers of visible trees are : "+visibleTreeHeigth.getVisibleTreeHeigth(input));
		System.out.println("");	
		int[] input1 = {3,5,4};
		System.out.println(Arrays.toString(input1));
		System.out.print("Total numbers of visible trees are : "+visibleTreeHeigth.getVisibleTreeHeigth(input1));
	}
}
