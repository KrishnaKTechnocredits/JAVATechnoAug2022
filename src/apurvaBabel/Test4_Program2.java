package apurvaBabel;

public class Test4_Program2 {
	
	// Return count of visible trees
	int getCountOfVisibleTrees(int[] num) {
		int maxNum=0 ;
		int count=0 ;
		for (int index = 0; index < num.length; index++) {
			if (maxNum < num[index]) {
				maxNum = num[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Test4_Program2 test4 = new Test4_Program2();
		int[] input1 = {3,7,5};
		int[] input2 = {3,5,11,9,10,13};
		System.out.println("Visible number of trees from given array is " + test4.getCountOfVisibleTrees(input1));
		System.out.println("Visible number of trees from given array is " + test4.getCountOfVisibleTrees(input2));
	}
}
