/*Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]
*/

package sagarY.Assignment40_CollectionHashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingNumbers {
	
	void findMissingNumbersUsingContains(Integer[] input) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(input));
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		
		for(int index=50;index<=60;index++) {
			if(listOfNum.contains(index)==false) {
				output.add(index);
			}
		}
		System.out.println("\nMissing numbers from array using contains method: \n"+output);
	}
	
	void findMissingNumbersUsingRemoveAll(Integer[] input) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(input));
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int index=50;index<=60;index++) {
				output.add(index);
			}
		
			output.removeAll(listOfNum);
		
		System.out.println("\nMissing numbers from array using removeAll method: \n"+output);
	}
	
	public static void main(String[] args) {
		System.out.println("Program 2 : Find missing numbers from  give array\n from 50 to 60.");
		System.out.println("====================================================");
		Integer[] input = {60,54,51,57};
		System.out.println("Input is: "+Arrays.toString(input));
		FindMissingNumbers find = new FindMissingNumbers();
		find.findMissingNumbersUsingContains(input);
		find.findMissingNumbersUsingRemoveAll(input);
		
	}
}
