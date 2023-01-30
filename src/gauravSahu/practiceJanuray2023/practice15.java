package gauravSahu.practiceJanuray2023;

public class practice15 {
	
	public static void main(String[] args) {
		String input = "Good morning friends this is technocredits";
		input.toLowerCase();
		
		String[] arr = input.split(" ");
		
		String maxWord = arr[0];
		
		for(int index = 0; index<arr.length; index++) {
			if(maxWord.length()<arr[index].length()) {
				maxWord = arr[index];
			}
		}
		System.out.println(maxWord);
		
		String input2 = "Good mor9ning fr3iends t2hi2s is technocredits";
		
		String [] array = input2.split(" ");
		
		for(int i= 0 ; i < array.length; i++) {
			
			for(int j =0 ; j < array[i].length(); j ++ ) {
				if(Character.isDigit(array[i].charAt(j))) {
					System.out.println(array[i]);
					break;
				}
			}
		}
	}

}
