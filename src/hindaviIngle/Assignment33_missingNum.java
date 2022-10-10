/*
 * program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8
 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment33_missingNum {
//method is used to find exact one missing num from arry and range start with 1
	void findExactOneMissingNum(int startIndex, int endIndex, int[] intArry) {
		int actualSum;
		int expectedSum = 0;
		int diff;
		actualSum = (endIndex * (endIndex + 1) / 2);
		for (int i = 0; i < intArry.length; i++) {
			expectedSum = expectedSum + intArry[i];
		}
		diff = actualSum - expectedSum;
		System.out.println("missing num " + diff);
	}
	
	int[] findMissingNumFromArray(int startIndex,int endIndex,int[] numArray) {
		int[] outputArry=new int[((endIndex-startIndex)+1)-numArray.length];
		int outputIndex=0;
		for(int num=startIndex;num<=endIndex;num++) {
			boolean flag=true;
			for(int j=0;j<numArray.length;j++) {
				if(num==numArray[j]) {
					flag=false;
					break;
				}			
			}
			if(flag) {
				System.out.println(num);
				outputArry[outputIndex]=num;
				outputIndex++;
				}			
		}
		return outputArry;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_missingNum a33 = new Assignment33_missingNum();
		System.out.println("print missing numbers from given array from range 1 to 10.");
		int[] intArry = { 1, 2, 5, 3 };
		System.out.println("Input "+Arrays.toString(intArry));
		a33.findExactOneMissingNum(1, 5, intArry);
		System.out.println("=======================================");
		int[] intArry1 = { 1, 3, 9, 5,6,10};
		System.out.println("Input Array :"+Arrays.toString(intArry1));
		System.out.println("Missing Number:");
		int[] outputArry=a33.findMissingNumFromArray(1,10, intArry1);
		System.out.println("============Alternative way===============");
		System.out.println("Missing Number array :  ");
		System.out.println("Output Arrays for missing number : "+Arrays.toString(outputArry));
	}
}