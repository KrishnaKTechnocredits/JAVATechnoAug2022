/*
Program 2 : print unique numbers from given array (having freq 1). 
input : {10,20,10,44,33,55,33};
output : 20
         44
		 55*/

package gauravSahu;

public class Assignment33B {

	void getUniqueNum(int[] input) {
		for (int index = 0; index < input.length; index++) {
			int count = 0;
			for (int innerindex = 0; innerindex < input.length; innerindex++) {
				if (input[index] == input[innerindex] && index!=innerindex) {
					count++;
				}
			}if(count==0 && index!=0) {
				System.out.println(input[index]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33B a33 = new Assignment33B();
		int[] input = { 10, 20, 10, 44, 33, 55, 33 };
		a33.getUniqueNum(input);
	}

}
