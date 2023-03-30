package nikitaPhase;

public class DivisibleBy3And7 {
	
	//Define a method:
	void processData(int strtRng, int endRng) {
		
		//Print given range:
		System.out.println("Input range is: From "+ strtRng + " To " + endRng + "\n");
		
		//Define a count variable:
		int count=0;
		
		//Define q for-loop to iterate over the range:
		for(int index=strtRng; index <= endRng; index++) {
			
			//Define a condition:
			if(index % 3 == 0 && index % 7 == 0) {
				System.out.println(index + " is divisible by 3 & 7");
				count++;
				
				//Define another condition:
				if(count >= 4) {
					break;
				}
			}
		}
	}
	
	//Define main method:
	public static void main(String[] args) {
		//Create an object & Call method:
		new DivisibleBy3And7().processData(20, 100);
		System.out.println("\nWe have got first 3 numbers which are divisible"
				+ "by 3 and 7");
	}
}
