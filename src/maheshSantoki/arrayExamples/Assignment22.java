/*Assignment_22_15/09/2022_MaheshS
 * Replace current index number with 0, if index+1 number is smaller then index number.
int[] arr = {10,20,30,22,44,21,92,89};
output : {10,20,0,22,0,21,0,89}*/
package maheshSantoki.arrayExamples;
import java.util.Arrays;
public class Assignment22 {
	int[] replaceWith0(int[] input) {
		for(int i=0;i<input.length-1;i++) {
			if(input[i]>input[i+1]) 
				input[i]=0;
		}
		return input;
	} 
	
	public static void main(String[] args) {
		Assignment22 assignment22=new Assignment22();
		int[] input = {10,20,30,22,44,21,92,89};
		System.out.println("Original Array : "+Arrays.toString(input));
		
		int []output=assignment22.replaceWith0(input);
		System.out.println("Output Array : "+Arrays.toString(output));
	}
}
