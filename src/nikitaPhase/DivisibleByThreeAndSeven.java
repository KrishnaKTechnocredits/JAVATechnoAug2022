package nikitaPhase;
class DivisibleByThreeAndSeven{
	
	//Define a method to take inputs:
	void userInputs(int startNum, int endNum){
		int count = 0;
		System.out.println("Input range is: " + startNum + " to " + endNum);
		
		//Define a for-loop:
		for(int index=startNum; index<=endNum; index++){
			if(index % 3 == 0 && index % 7 == 0){
				System.out.println(index + " is divisible by 3 & 7");
				count += 1;
			}
		}
		System.out.println("There are total " + count + " number/s which are divisible by 3 & 7");
	}
	
	//Define main method:
	public static void main(String[] args){
		DivisibleByThreeAndSeven divisibleByThreeAndSeven = new DivisibleByThreeAndSeven();
		
		//Provide inputs:
		divisibleByThreeAndSeven.userInputs(1,100);
	}
}