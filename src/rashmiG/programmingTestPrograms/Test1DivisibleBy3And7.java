/*Programming Test - 1 : 28th Aug'2022

On User defined range, print first 3 numbers which are divible by 3 and 7.
input : 20 to 100
output : 21
             42
              63
Note : Use for loop*/

package rashmiG.programmingTestPrograms;

class Test1DivisibleBy3And7 {

	void printNosDivisbleBy3And7(int startNum, int endNum) {
		if (startNum < endNum && startNum >= 0 && endNum >= 0) {
			System.out.println("First 3 numbers which are divible by 3 and 7 between the range (" + startNum + ","
					+ endNum + ") are");
			int count = 0;
			for (int index = startNum; index <= endNum; index++) {
				if (index % 3 == 0 && index % 7 == 0) {
					System.out.println(index);
					count++;
				}
				if (count == 3) {
					break;
				}
			}
		} else {
			System.out.println("inavlid input range..");
		}
	}

	public static void main(String[] args) {
		Test1DivisibleBy3And7 test1 = new Test1DivisibleBy3And7();
		test1.printNosDivisbleBy3And7(100, 200);
		test1.printNosDivisbleBy3And7(20, 100);
		test1.printNosDivisbleBy3And7(200, 100);
		test1.printNosDivisbleBy3And7(-1, 90);

	}
}
