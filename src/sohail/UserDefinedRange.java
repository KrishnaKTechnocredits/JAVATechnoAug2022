package sohail;

class UserDefinedRange{
int num;
		int count=0;
	void divide(int num1, int num2){		
		for(num=num1; num<=num2; num++){
			if (num%3==0 && num%7==0){				
				System.out.println("Number is divisible by 3 and 7    "+num);
				count++;
			}
			if (count>=3)
				break;
			
		}
	
	}

public static void main(String[] args){
	UserDefinedRange userrange=new UserDefinedRange();
			userrange.divide(20,100);
}

}