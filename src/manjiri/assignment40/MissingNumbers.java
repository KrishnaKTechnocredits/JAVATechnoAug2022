/*Program 2 : Find missing numbers from give array from 50 to 60.
input : {60,54,51,57}
output : [50,52,53,55,56,58,59]
Hint : removeAll*/


package manjiri.assignment40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {
	
	List<Integer> getMissingNumberList(Integer[] numArr, int startRange, int endRange){
		
		List<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		List<Integer> missingNumList = new ArrayList<Integer>();
		
		int index = startRange;
		while(index <= endRange) {
			if(!listOfNum.contains(index)) {
				missingNumList.add(index);
			}
			index++;
		}
		return missingNumList;
	}
	
	List<Integer> getMissingNumberList2(Integer[] numArr, int startRange, int endRange){
		
		List<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		List<Integer> missingNumList = new ArrayList<Integer>();
		
		for(int index = startRange; index <= endRange; index++) {
			missingNumList.add(index);
		}
		missingNumList.removeAll(listOfNum);			
		return missingNumList;
	}
	
	
	public static void main(String[] args) {
		Integer[] numArr = {60,54,51,57};
		int startRange = 50;
		int endRange = 60;
		List<Integer> missingNumList = new MissingNumbers().getMissingNumberList(numArr, startRange, endRange);
		System.out.println(missingNumList);
		
		List<Integer> missingNumList2 = new MissingNumbers().getMissingNumberList2(numArr, startRange, endRange);
		System.out.println(missingNumList2);
	}
}
