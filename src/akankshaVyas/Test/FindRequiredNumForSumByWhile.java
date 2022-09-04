/*
	 * void findRequiredNumbers(int targetNum){ int count = 0; while(sum<targetNum){
	 * count++; } sop(count); }
	 * 
	 * -----------------------------
	 * 
	 * findRequiredNumbers(50);
	 * 
	 * input : 50 output : 10
	 * 
	 * input : 17 output : 6
	 * 
	 * 1+2+3+4+5+6+7+8+9+10 = 55
	 */


package akankshaVyas.Test;

public class FindRequiredNumForSumByWhile {

	void findRequiredNum(int targetNum) {
		int count = 0;
		int sum = 0;
		int num = 1;
		while (sum < targetNum) {
			sum = sum + num;
			count++;
			num++;
		}
		System.out.println("Required numbers to find target sum is - " + count);
	}

	public static void main(String[] args) {
		FindRequiredNumForSumByWhile findRequiredNumForSumByWhile = new FindRequiredNumForSumByWhile();
		findRequiredNumForSumByWhile.findRequiredNum(50);
		findRequiredNumForSumByWhile.findRequiredNum(17);
	}

}
