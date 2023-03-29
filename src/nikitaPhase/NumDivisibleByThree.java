package nikitaPhase;
class NumDivisibleByThree{
	//Define a method to take inputs:
	void userInputs(int startNum, int endNum){
		//Define a for-loop:
		for(int index=startNum; index<=endNum; index++){
			if(index % 3 == 0){
				System.out.println(index + " is divisible by 3");
			}else{
				System.out.println(index + " is not divisible by 3");
			}
		}
	}
	
	//Define main method:
	public static void main(String[] args){
		NumDivisibleByThree numDivisibleByThree = new NumDivisibleByThree();
		
		//Provide inputs:
		numDivisibleByThree.userInputs(1,20);
	}
}