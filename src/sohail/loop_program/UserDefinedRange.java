package sohail.loop_program;

class UserDefinedRange{

	static void divide(int llimit, int ulimit){
		for(int i=llimit; i<=ulimit; i++){
			int num = 0;
			if (num %3==0 && num%7==0){
				System.out.println("Number is divisable by 3 and 7");
			}
		}
	
	}

public static void main(String[] args){
		UserDefinedRange.divide(30,60);
		
}

}