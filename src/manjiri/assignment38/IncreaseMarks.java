/*Program 2: 
Increase student marks by 10 if marks is less than 35.

input : [23,55,34,88,58,81]
output : [33,55,44,88,58,81]*/

package manjiri.assignment38;

import java.util.ArrayList;

public class IncreaseMarks {
	
	ArrayList<Integer> getProcessedArrayList(ArrayList<Integer> listOfNum){
		int num = 0;
		for (int index = 0; index < listOfNum.size(); index++) {
			num = listOfNum.get(index);
			if(num < 35) {
				listOfNum.set(index, num+10);
			}
		}
		return listOfNum;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>();
		listOfNum.add(23);
		listOfNum.add(55);
		listOfNum.add(34);
		listOfNum.add(88);
		listOfNum.add(58);
		listOfNum.add(81);
		
		System.out.println("Input ArrayList is: " + listOfNum);
		System.out.println("-------------------------------------------------");
		
		IncreaseMarks increaseMarks = new IncreaseMarks();
		ArrayList<Integer> processedListOfNum = increaseMarks.getProcessedArrayList(listOfNum);
		System.out.println("Processed ArrayList is: " + processedListOfNum);
	}
}
