package shubhamG.Assignment31to40;

import java.util.ArrayList;
//
//Program 1 : Find frequency of each number using array and single while loop.
//input : {3,5,33,3,55,3,11,11}
//output : 3--->3
//		5--->1
//		33--->1
//		55--->1git sta
//		11--->2
import java.util.Arrays;

public class Assignment40Program1 {
	void frequencyOfEachNumber(Integer[] arr) {
		ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(3, 5, 33, 3, 55, 3, 11, 11));
		int beforeSize = 0, afterSize = 0, num = 0;
		ArrayList<Integer> removeList = new ArrayList<Integer>();
		while (al.size() > 0) {
			num = al.get(0);
			beforeSize = al.size();
			removeList.add(num);
			al.removeAll(removeList);
			afterSize = al.size();
			System.out.println(num + " ----> " + (beforeSize - afterSize));
			removeList.clear();
		}
	}
	
	public static void main(String[] args) {
		
	
	Assignment40Program1 frequency = new Assignment40Program1();
	
	Integer[] input =  {3,5,33,3,55,3,11,11};
	System.out.println("Input array is : " +Arrays.toString(input));
	frequency.frequencyOfEachNumber(input);
	}	
}
