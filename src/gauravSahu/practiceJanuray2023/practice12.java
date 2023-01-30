package gauravSahu.practiceJanuray2023;

import java.util.Arrays;

public class practice12 {
	
	// method to print duplicate numbers from given array.
	// int[] arr1 = { 10, 20, 10, 44, 33, 55, 33 };
	void dupNum(int [] array) {
		int[] newArr = new int [array.length];
		for(int i = 0; i<array.length;i++) {
			newArr[i] = array[i];
		}
		boolean flag;
		System.out.println("Input array : " + Arrays.toString(array));
		for(int j = 0; j<newArr.length;j++) {
			flag =  true;
			for(int x = j+1;x<newArr.length;x++) {
				if(newArr[j] == array[x]) {
					flag = false;
					newArr[x]=0;
				}
			}if(!flag) {
				System.out.println(newArr[j]);
				newArr[j]=0;
			}
		}
	}
	 
	
	// method to print unique numbers from given array (having freq 1)
	// int[] arr1 = { 10, 20, 10, 44, 33, 55, 33 };
	
	void uniqueNum (int [] arr) {
		int [] newArr = new int[arr.length];
		for(int i = 0; i<arr.length;i++) {
			newArr[i] = arr[i];
		}
		boolean flag;
		for(int index = 0; index<newArr.length;index++) {
			flag = true;
			for(int innerIndex = index + 1 ; innerIndex<newArr.length;innerIndex++) {
				if(newArr[index] == newArr[innerIndex] && newArr[index] !=0) {
					flag = false;
					newArr[index] = 0;
					newArr[innerIndex] = 0;
					break;
				}
			}if(flag && newArr[index]!=0) {
				System.out.println(newArr[index]);
			}
		}
	}
	
	// {1,3,9,5,6,10}
	
	void misNum (int[] arr) {
		int[] misArr = new int[arr.length];
		for(int index = 0 ; index<arr.length;index++) {
			misArr[index] = arr[index];
		}
		boolean flag ; 
		for(int i = 1; i<=10;i++) {
			flag = true;
			for(int j = 0; j<misArr.length;j++) {
				if(misArr[j] == i ) {
					flag = false;
					break;
				}
			}if(flag) {
				System.out.println(i);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		practice12 p12 = new practice12();
		
		int[] arr1 = { 10, 20, 10, 44, 33, 55, 33 };
		
		int[] arr2  = {1,3,9,5,6,10};
		p12.dupNum(arr1);
		p12.uniqueNum(arr1);
		p12.misNum(arr2);
		
	}

}
