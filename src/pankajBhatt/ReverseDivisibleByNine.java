package pankajBhatt;

// print numbers divisible by 9 in reverse from number n
class ReverseDivisibleByNine{
	void countDivisibles(int number){
		for(; number>0; number --){
			if(number % 9 == 0 ){
				System.out.println("number divisible by 9 in reverse: "+ number);
			}
		}
	}
	
	public static void main(String[] args){
		ReverseDivisibleByNine reverseDivisibleByNine = new ReverseDivisibleByNine();
		reverseDivisibleByNine.countDivisibles(50);
	}
}