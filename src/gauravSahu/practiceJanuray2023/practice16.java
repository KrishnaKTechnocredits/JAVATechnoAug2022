package gauravSahu.practiceJanuray2023;

public class practice16 {
	
	public static void main(String[] args) {
		String input = "Good Mor9niNg FR3ienDs t2hi2s Is tEchnocredits";
		
		String [] array = input.split(" ");
		
		String tempWord = " ";
		int maxCount = 0;
		for(int i =0;i<array.length;i++) {
			int count = 0;
			for(int j = 0; j<array[i].length();j++) {
				if(Character.isUpperCase(array[i].charAt(j))) {
					count ++ ;
					if(maxCount<count) {
						maxCount = count;
						tempWord = array[i];
					}
					
				}
			}
		}System.out.println(tempWord);
		
		
		String input2 = "Good mor9ning techno fr3iends t2Hi2s is tEchnocredits";
		
		String [] arr2  = input2.split(" ");
	
		for(int x = 0 ; x < arr2.length;x++) {
			boolean flag = true;
			for(int y = 0 ; y<arr2[x].length();y++) {
				if(Character.isDigit(arr2[x].charAt(y)) || Character.isUpperCase(arr2[x].charAt(y))) {
					flag = false;
				}
			}if(flag) {
				System.out.println(arr2[x]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
