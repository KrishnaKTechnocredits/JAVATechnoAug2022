/*Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2*/

package manjiri.assignment40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencyOfNumberUsingArrayList {
	
	void getFrequencyOfNumbers(Integer[] numArr){
		
		List<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(numArr));
		List<Integer> temp = new ArrayList<Integer>();
		int index = 0;
		while(listOfNum.size() > 0) {
			int beforeSize = listOfNum.size();
			temp.add(listOfNum.get(index));
			listOfNum.removeAll(temp);
			int afterSize = listOfNum.size();
			int frequency = beforeSize - afterSize;
			System.out.println(temp.get(0)+"-->"+frequency);
			temp.clear();
		}
	}
	
	public static void main(String[] args) {
		Integer[] numArr = {3,5,33,3,55,3,11,11};
		new FrequencyOfNumberUsingArrayList().getFrequencyOfNumbers(numArr);
	}
}
