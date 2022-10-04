//Assignment-29
//Program 1 : 
//Shift all Zero's at the end of an array.
//input : {10,0,0,3,4,5,0,9}
//output : {10,3,4,5,9,0,0,0}

package titikshaG;
import java.util.Arrays;

public class ZeroIndex {
	void arrangingZeroInLastIndexs(int[] arr) {
		int[] output=new int[arr.length];
		int count=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==0){
				count++;}
		}
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0){
			output[count]=arr[index];
			count++;}
		}
		System.out.println("The output array is :"+Arrays.toString(output));
	}
		
//Program 2 : 
//Shift all Zero's at the end of an array.
//input : {10,0,0,3,4,5,0,9}
//output : {0,0,0,10,3,4,5,9}
	void arrangingZeroInFirstIndexs(int[] arr) {
		int[] output=new int[arr.length];
		int count=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!=0){
				output[count]=arr[index];
				count++;}
		}
		System.out.println("The output array is :"+Arrays.toString(output));
	}
		
	
	public static void main(String[] args) {
		ZeroIndex zeroIndex=new ZeroIndex();
		int[] input={10,0,0,3,4,5,0,9};
		System.out.println("-------------------Program 1----------------");
		zeroIndex.arrangingZeroInLastIndexs(input);
		System.out.println("-------------------Program 2----------------");
		zeroIndex.arrangingZeroInFirstIndexs(input);}
}




