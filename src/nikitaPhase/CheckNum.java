package nikitaPhase;
class CheckNum{
	
	//Define a method to take input from the user:
	void processData(int startNum, int endNum){
		
		//Define a for-loop to iterate over the given rage:
		for(int num=startNum; num<=endNum; num++){
			
			//Check if the number is divisible by 7 & 13:
			//WAY-1
			/*
			if(num % 7 == 0 || num % 13 == 0){
				
				//Check if number is divisible by both 7 & 13:
				if (num % 7 == 0 && num % 13 == 0){
					System.out.println(num + " is divisible by both 7 & 13");
				}
				if(num % 7 == 0){
					System.out.println(num + " is divisible by 7");
				}else{
					System.out.println(num + " is divisible by 13");
				}
			}
			*/
			//Check if number is divisible by both 7 & 13:
			//WAY-2
			if(num % 7 == 0 && num % 13 == 0){
				System.out.println(num + " is divisible by both 7 & 13");
			}
			else if(num % 7 == 0){
				System.out.println(num + " is divisible by 7");
			}
			else{
				System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	//Define main method:
	public static void main(String[] args){
		//Create an object:
		CheckNum checkNum = new CheckNum();
		
		//Provide input range:
		checkNum.processData(1,100);
	}
}