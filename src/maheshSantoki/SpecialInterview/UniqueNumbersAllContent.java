//Program 6 : print unique numbers from given array (all content uniquely). 
//input : {10,20,10,44,33,55,33};
//output : 10 
//         20
//         44
//		 33 
//		 55
package maheshSantoki.SpecialInterview;

import java.util.Arrays;

public class UniqueNumbersAllContent {
	void uniqueNumbers(int[] input){

		for(int i=0; i<input.length;i++){
			for(int j=i+1;j<input.length;j++){				
				if(input[i]==input[j])
					input[j]=0;
			}
			if(input[i]!=0)
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		UniqueNumbersAllContent uniqnum=new UniqueNumbersAllContent();
		int input[] = {10,20,10,44,33,55,33};
		System.out.println("Given Array : "+Arrays.toString(input)+"\n"+"Unique Numbers : ");
		uniqnum.uniqueNumbers(input);
	}
}
