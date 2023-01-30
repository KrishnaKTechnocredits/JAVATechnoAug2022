package gauravSahu.practiceJanuray2023;

public class practice23 {
	
	public static void main(String[] args) {
		String input = "i have 15 years and 3 months of experience";
		
		String []  array  = input.split(" ");
		int sum = 0;
		
		for(String name : array) {
			for(int index = 0 ; index < name.length();index++) {
				if(Character.isDigit(name.charAt(index))) {
					try {
						sum = sum + Integer.parseInt(name);
						
					}catch (Exception e) {
						
					}
					System.out.println(sum);
				}
				
				
			}
		}
	}

}
