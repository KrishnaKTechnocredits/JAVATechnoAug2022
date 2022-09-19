/*package amolMule;
class Math{
	void even(int startnum,int endnum){
		System.out.println("Even numbers are");
		for(int i=startnum;i<endnum;i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
	
	void divByFive(int startnum,int endnum){
		System.out.println("Divisible by 5 are");
		for(int i=startnum;i<endnum;i++){
			if(i%5==0)
				System.out.println(i);
		}
	}
	
	void divByThreeFive(int startnum,int endnum){
		System.out.println("Divisible by 3 and 5 are");
		for(int i=startnum;i<endnum;i++){
			if(i%3==0 && i%5==0)
				System.out.println(i);
		}
	}
	
	void divBy7and13(int startnum,int endnum){
		//System.out.println("Divisible by 3 and 5 are");
		for(int i=startnum;i<endnum;i++){
			if(i%7==0)
				System.out.println(i+" Number is divisible by 7");
			else if(i%13==0)
				System.out.println(i+" Number is divisible by 13");
		}
	}
	
	void sumRange(int startnum,int endnum){
		int sum=0;
		for(int i=startnum;i<=endnum;i++){
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	}
	
	void sumOddEven(int startnum,int endnum){
		int sumEven=0;
		int sumOdd=0;
		for(int i=startnum; i<=endnum; i++){
			if(i%2==0){
				sumEven=sumEven+i;
			}
			else
				sumOdd=sumOdd+i;
		}
		System.out.println("Difference between odd and even is "+ (sumOdd-sumEven));
	}
	
	void printOdd(int startnum,int endnum){
		int sum1;
		for(int i=endnum;i>=startnum;i--){
			if(i%2!=0)
				System.out.println(i);
		}
	}
	
	public static void main(String args[]){
			Math math=new Math();
			math.even(10,15);
			math.divByFive(10,30);
			math.divByThreeFive(10,20);
			math.divBy7and13(5,40);
			math.sumRange(0,5);
			math.sumOddEven(3,9);
			math.printOdd(10,20);
	}
}*/