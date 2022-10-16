package nikeshM.Assignment33;

//program 3 : print missing numbers from given array from range 1 to 10. 
//input : {1,3,9,5,6,10}
//output : 2
//		 4
//		 7
//		 8

public class Assignment33MissingNo {
	void getMissingNo(int[] input) {
		for (int num = 1; num < 10; num++) {
			boolean isMissingNoFlag = true;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index]) {
					isMissingNoFlag = false;
					break;
				}
			}
			if (isMissingNoFlag)
				System.out.println("Missing No Are : " + num);
		}
	}
  public static void main(String[] args) {
	  Assignment33MissingNo p1 = new Assignment33MissingNo();
		int [] input = {1,3,9,5,6,10};
		p1.getMissingNo(input);
		
}
}