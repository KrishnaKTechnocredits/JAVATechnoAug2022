package monikaDwivedi;

public class DivBy3and7 {
	
	void div3and7(int num2,int num1){
		int count = 0;	
		for(int num=num1; num>=num2; num--){
			if(num%7==0 && num%3==0){
				System.out.println("Number divisible by 7 & 3 are:- "+num);
				count++;
			}
			if(count==3) {
				break;
			}			
	}
}
	public static void main(String[] args) {
		DivBy3and7 divBy3and7 = new DivBy3and7();
		divBy3and7.div3and7(10,200);
	}
}





