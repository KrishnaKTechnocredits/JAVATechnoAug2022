
package gauravSahu.practiceJanuray2023;

public class practice14 {
	
	public static void main(String[] args) {
		int [] array = { 10, 11, 11, 10, 5, 6, 5, 6, 5, 5, 4 };
		
		boolean flag;
		for(int index = 0; index<array.length; index++) {
			int count = 1;
			flag = true;
			for(int innerIndex = index + 1 ; innerIndex<array.length;innerIndex++) {
				if(array[index] == array[innerIndex] && array[innerIndex] != 0) {
					count ++ ;
					array[innerIndex] = 0;
				}
			}if(count>1) {
				System.out.println(array[index] + "---" + count + "times" );
				array[index] = 0;
			}
		}
	}

}
