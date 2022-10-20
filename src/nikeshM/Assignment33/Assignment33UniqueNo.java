package nikeshM.Assignment33;

import java.util.Arrays;

//Program 2 : print unique numbers from given array (having freq 1). 
 //input : {10,20,10,44,33,55,33};
 //output : 20
 //         44
 //		 55
public class Assignment33UniqueNo {
	void getUniqueNo(int[] input) {
		System.out.println("Unique No Are : ");
		for (int index = 0; index < input.length; index++) {
			boolean flag = true;
			for (int innerindex = index + 1; innerindex < input.length; innerindex++) {

				if (input[index] == input[innerindex] && index != innerindex) {
					
					input[innerindex] = 0;
					flag = false;
				}
			}
			if (flag && input[index] != 0) 
				
				System.out.println(input[index]);
		}
	}

		public static void main(String[] args) {
			Assignment33UniqueNo uniqueno = new Assignment33UniqueNo ();
			int [] input = {10,20,10,44,33,55,33};
			uniqueno.getUniqueNo(input);
			System.out.println("Input No Are : " + Arrays.toString(input));
}
}
