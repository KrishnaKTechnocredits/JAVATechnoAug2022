/*
 * program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
 */
package hindaviIngle;

import java.util.Arrays;

public class Assignment33_PrintNumWithFreq {
	void freqOfEachNumber(int[] intArry) {
	System.out.println("Each Number Frequency from arrays: ");
		for(int i=0;i<intArry.length;i++) {
			int count=1;
			for(int j=i+1;j<intArry.length;j++) {
				if(intArry[i]==intArry[j]) {
					intArry[j]=0;
					count++;
				}
			}
			if(count>0&&intArry[i]!=0)		
			System.out.println(intArry[i]+"--------->"+count);
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment33_PrintNumWithFreq a=new Assignment33_PrintNumWithFreq();
		int[] numArry= {10,11,11,10,5,6,5,6,5,5,4};
		System.out.println("Input Array"+Arrays.toString(numArry));
		a.freqOfEachNumber(numArry);
	}

}
