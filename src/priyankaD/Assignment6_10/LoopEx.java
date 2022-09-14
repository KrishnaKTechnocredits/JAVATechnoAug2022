package priyankaD.Assignment6_10;

class LoopEx{
	
	void evenNum(int x,int y){
		System.out.println("Even numbers berween"+x+"and"+y+"are-");
		for(int ind=x;ind<=y;ind++){
			if(ind%2==0){
				System.out.println(ind);
			}
		}
	}
	
	void div5(int x,int y){
		System.out.println("Number divisible by 5 between"+x+"and"+y +"are-");
		for(int ind=x;ind<=y;ind++){
			if(ind%5==0){
				System.out.println(ind);
			}
		}
	}
	
	void div5and3(int x,int y){
		System.out.println("Numbers divisible by 3 and 5 between"+x+" and " +y+ "are-");
		for(int ind=x;ind<=y;ind++){
			if(ind%3==0 && ind%5==0){
				System.out.println(ind);
			}
		}
	}
	
	void div7and13(int x, int y){
		System.out.println("Numbers divisible by 7 or 13 between"+x+" and "+y+"are-");
		for(int ind=x;ind<=y;ind++){
			if(ind%7==0 || ind%13==0){
				if(ind%7==0){
				System.out.println(ind+" is divisible by 7");
				}
			    else{
				System.out.println(ind+" is divisible by 13");
			    }
			}
		}
	}
	
	void sum(int x, int y){
		int add=0;
		for(int ind=x;ind<=y;ind++){
			add=add+ind;
		}
		System.out.println("Sum is "+ add);
	}
	
	void difference(int x, int y){
		int sumOdd=0;
		int sumEven=0;
		for(int ind=x;ind<=y;ind++){
			if(ind%2==0){
				sumEven=sumEven+ind;
			}
			else {
				sumOdd=sumOdd+ind;
			}
		}
		System.out.println("Difference between sum of odd numbers and even numbers between"+x+ " and "+y+"are-" + (sumEven-sumOdd));
	}
	
	void odd(int x, int y){
		System.out.println("The numbers in reverse order between "+x+" and "+y+" are-");
		for(int ind=x;ind>=y;ind--){
			if(ind%2!=0){
				System.out.println(ind);
			}
		}
	}
	
	public static void main (String[]args){
		LoopEx loopex=new LoopEx();
		loopex.evenNum(10,15);
		loopex.div5(10,30);
		loopex.div5and3(5,18);
		loopex.div7and13(5,40);
		loopex.sum(1,5);
		loopex.difference(3,9);
		loopex.odd(20,10);
	}
	
}