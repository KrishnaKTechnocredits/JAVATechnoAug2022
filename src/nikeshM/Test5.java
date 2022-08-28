package nikeshM;

class Test5{
	int x = 1;
	int y = 2;
	
	void plusx(){
		x = x+1;
	}	

	void plusy(){
		y = y*2;
	}
	void displayvalue(){
		System.out.println(x+y);
	}
	public static void main (String[] args){
		Test5 test5 = new Test5();
		test5.plusx();
		test5.plusx();
		test5.plusy();
		test5.plusy();
		test5.displayvalue();
	}
		
}