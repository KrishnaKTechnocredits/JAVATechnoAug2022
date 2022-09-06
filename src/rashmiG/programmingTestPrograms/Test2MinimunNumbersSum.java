/*Test - 2: 4th Sep'2022

void findRequiredNumbers(int targetNum){
	int count = 0;
	while(sum<targetNum){		
		count++;
	}
	sop(count);
}

-----------------------------

findRequiredNumbers(50);

input : 50
output : 10

input : 17
output : 6

1+2+3+4+5+6+7+8+9+10 = 55*/

package rashmiG.programmingTestPrograms;

class Test2MinimunNumbersSum {

	void findRequiredNumbers(int targetNum) {
		if (targetNum > 0) {
			int count = 0;
			int num = 1;
			int sum = 0;
			while (sum < targetNum) {
				sum = sum + num;
				count++;
				num++;
			}
			System.out.println("Minimum numbers required for the sum to be " + targetNum + " : " + count);
		} else {
			System.out.println(targetNum + ": Invalid Input");
		}
	}

	public static void main(String[] args) {
		Test2MinimunNumbersSum test = new Test2MinimunNumbersSum();
		test.findRequiredNumbers(50);
		test.findRequiredNumbers(-8);
		test.findRequiredNumbers(2);
		test.findRequiredNumbers(1);
	}
}
