/*Program 1 : Find frequency of each number using array and single while loop.
input : {3,5,33,3,55,3,11,11}
output : 3--->3
		5--->1
		33--->1
		55--->1
		11--->2  */

package sagarY.Assignment40_CollectionHashMap;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintFreqOfEachNum {
	
	void printFreqOfEachNum(Integer[] input) {
		ArrayList<Integer> listOfNum = new ArrayList<Integer>(Arrays.asList(input));
		int previousSize = 0;
		int afterSize=0;
		int num=0;
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		
		while(listOfNum.size()>0) {
			num = listOfNum.get(0);
			previousSize = listOfNum.size();
			resultList.add(num);
			listOfNum.removeAll(resultList);
			afterSize = listOfNum.size();
			System.out.println("\t\t"+num +"<==>"+(previousSize-afterSize));
			resultList.clear();
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Program 1 : Find frequency of each number \nusing array and single while loop.");
		System.out.println("===========================================");
		Integer[] input = {3,5,33,3,55,3,11,11};
		System.out.println("Input is: "+Arrays.toString(input));
		PrintFreqOfEachNum print = new PrintFreqOfEachNum();
		print.printFreqOfEachNum(input);
	}

}
