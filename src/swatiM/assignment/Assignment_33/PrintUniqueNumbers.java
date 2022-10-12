/*Program 6 : print unique numbers from given array (all content uniquely). 
input : {10,20,10,44,33,55,33};
output : 10 
         20
         44
		 33 
		 55
*/

package swatiM.assignment.Assignment_33;

	import java.util.Arrays;

	class PrintUniqueNumbers{

		void printUniqueNumbers(int[] input){
			System.out.println("Output:Unique numbers from array are: ");

			for(int i=0; i<input.length;i++){
				for(int j=i+1;j<input.length;j++){				
					if(input[i]==input[j])
						input[j]=0;
				}
				if(input[i]!=0)
				System.out.println("- >  "+input[i]);
			}
		}

		public static void main(String[] args){
			System.out.println("Program 6 : print unique numbers from given array (all content uniquely). \r\n"
					+ "input : {10,20,10,44,33,55,33};");
			System.out.println("--------------------------------------");
			int[] input = {10,20,10,44,33,55,33};
			//System.out.println("Input:" +Arrays.toString(input));
			// System.out.println("--------------------------------------");
			new PrintUniqueNumbers().printUniqueNumbers(input);
		}

}
