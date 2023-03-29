package nikitaPhase;
class ReverseNumPrinting{
	
	//Define a method to take inputs from user:
	void userInputs(int startNum, int endNum){
		
		//Define a for-loop to iterate over number range:
		for(int index=endNum; index>=startNum; index--){
			
			//Check if number is divisible by 9:
			if(index % 9 == 0){
				System.out.println(index);
			}
		} 
	}
	
	//Define main method:
	public static void main(String[] args){
		//Create an object:
		ReverseNumPrinting reverseNumPrinting = new ReverseNumPrinting();
		
		//Provide user inputs:
		reverseNumPrinting.userInputs(1,50);
	}
}