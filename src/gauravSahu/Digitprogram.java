package gauravSahu;




class Digitprogram{
	
	void even(int a, int b){
		for(int index=a;index<=b;index++){
			if (index%2==0){
				System.out.println("Number is a even number " + index);
			}else{
				System.out.println("Number is a odd number " + index);
			}	
		}	
	}
	
	void div5(int a,int b){
		for(int index=a;index<=b;index++){
			if(index%5==0){
				System.out.println("Number is divisible by 5 " + " = " + index);
			}
		}
	}
	
	void div3and5(int x, int y){
		for(int index=x;index<=y;index++){
			if(index%3==0 && index%5==0){
				System.out.println("Number is divisible by 3 & 5 " + " = " + index);
			}
		}
	}
	
	void div7or13(int x, int y){
		for(int index=x;index<=y;index++){
			if(index%7==0){
				System.out.println("Number is divisible by 7 " + " = " + index);
			}else if(index%13==0){
				System.out.println("Number is divisible by 13 " + " = " + index);
			}
		}
	}
	
	void sum(int x, int y){
		int a = 0;
		for(int index=x;index<=y;index++){
			a += index; 
		}
			System.out.println("Sum of number is " + a);
	}
	
	void sumdiff(int a,int b){
		int x = 0;
		int y = 0;
		int z = 0;
		for(int index=a;index<=b;index++){
			if(index%2==0){
				 x = x+index;
			}else if(index%2!=0){
				 y = y+index;
			}	
		}
			System.out.println("Difference of odd & even number is " + (y-x));
	}
	
	void rev(int a, int b){
		for(int index=a;index>=b;index--){
			if(index%2!=0){
				System.out.println("Odd number between 20 to 10 is " + index);
			}
		}
	}
	
	public static void main(String [] args){
		Digitprogram digitprogram = new Digitprogram();
		digitprogram.even(10,15);
		System.out.println("   ");
		digitprogram.div3and5(10,50);
		System.out.println("   ");
		digitprogram.div7or13(1,50);
		System.out.println("   ");
		digitprogram.sum(1,5);
			System.out.println("   ");
		digitprogram.sumdiff(3,9);
		System.out.println("   ");
		digitprogram.rev(20,10);
	}
}