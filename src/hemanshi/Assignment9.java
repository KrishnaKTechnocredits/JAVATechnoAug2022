package hemanshi;
class Assignment9{
	
	void PrimeNumber(int num){
		boolean flag = true;
		
		if(num<1){
			System.out.println(num+ " is invalid input");
		}else{
		
		for(int index=2; index<=num/2; index++){
			if(num%2==0){
			flag=false;
			System.out.println(num+ " is not prime number");
			break;
			}
		}
		
	    if(flag==true)
			System.out.println(num+ " is a prime number");
		}
	}
	
	public static void main(String[] args){
		Assignment9 assignment9 = new Assignment9();
		assignment9.PrimeNumber(15);
		assignment9.PrimeNumber(17);
		assignment9.PrimeNumber(-19);
		assignment9.PrimeNumber(12);
	}

}
