/*
 program 3 : print missing numbers from given array from range 1 to 10. 
input : {1,3,9,5,6,10}
output : 2
		 4
		 7
		 8

 */

package swapnilMaheshwari.ArrayPrograms.Assignment33;

public class MissingNumFromGivenArr {
	void printMissingNumFromGivenArr(int[] arr) {
		boolean flag=true;
		for(int i=1; i<=10; i++) {
			for (int index=0;index<arr.length;index++) {
				if (i==arr[index]) {
					flag=false;
					break;
				}
					
			}
			if(flag)
				System.out.println(i);
			flag=true;
		}
		
	}
	public static void main(String[] args) {
		int[] input= {1,3,9,5,6,10};
		new MissingNumFromGivenArr().printMissingNumFromGivenArr(input);
	}
}
