package technocredits.collectionsdemo;

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		ArrayList<Integer> listOfNum1 = new ArrayList<Integer>();
		listOfNum1.add(10);
		listOfNum1.add(12);
		listOfNum1.add(12);
		listOfNum1.add(12);
		listOfNum1.add(9);

		ArrayList<Integer> listOfNum2 = new ArrayList<Integer>();
		listOfNum2.add(100);
		listOfNum2.add(120);
		listOfNum2.add(90);
		listOfNum2.add(12);

		/*
		 * listOfNum1.addAll(listOfNum2); System.out.println(listOfNum1);
		 * System.out.println(listOfNum2);
		 */
		System.out.println(listOfNum1);
		listOfNum1.retainAll(listOfNum2);
		System.out.println(listOfNum1);
	}
}
