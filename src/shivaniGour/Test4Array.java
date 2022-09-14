package shivaniGour;

import java.util.Arrays;

public class Test4Array {
	int add = 0;
	void getSumOfDigits(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length(); j++) {
				if(Character.isDigit(arr[i].charAt(j))) {
					add = add + Character.getNumericValue(arr[i].charAt(j));
				}
			}
			System.out.println(arr[i] + " -> " + add);
			add=0;
		}
	}	
	
	int getCountOfVisibleTrees(int[] arr) {
		int count =1, maxHeight=arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(maxHeight<arr[i]) {
				maxHeight=arr[i];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Test4Array varArr = new Test4Array();
		String[] arr = {"Ma1he4sh","A9vni","P1uj3a5","Harshal","A4d4itty","Rahul"};
		System.out.println("----Program 1------");
		varArr.getSumOfDigits(arr);
		int[] arr1 = {3,7,5};
		int [] arr2 = {3,5,11,9,10,13,14};
		System.out.println("----Program 2------");
		System.out.println("Count of trees visible for array"+Arrays.toString(arr1)+" is: "+varArr.getCountOfVisibleTrees(arr1));
		System.out.println("Count of trees visible for array"+Arrays.toString(arr2)+" is: "+varArr.getCountOfVisibleTrees(arr2));
	}

}
