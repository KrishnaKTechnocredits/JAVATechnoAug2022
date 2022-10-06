/*program 7 : print each number with its frequency. 
input : {10,11,11,10,5,6,5,6,5,5,4}
output : 10 -> 2
         11 -> 2
          5 -> 4
         6 -> 2
         4 -> 1
*/

package swapnilMaheshwari.ArrayPrograms.Assignment33;

public class FrequencyOfEachNumberInArray {
	void printFrequncyOfEachNumber(int[] input) {
		int count=1;
		for (int i=0; i<input.length;i++) {
			if (input[i]!=0) {
				
			for (int j=i+1; j<input.length;j++) {
				if(input[i]==input[j])
				{
					count++;
					input[j]=0;
			}
			}
			System.out.println(input[i]+ "->" + count);
			count=1;
		}
		}
	}
	public static void main(String[] args) {
		int[] arr= {10,11,11,10,5,6,5,6,5,5,4};
		new FrequencyOfEachNumberInArray().printFrequncyOfEachNumber(arr);
	}
}
