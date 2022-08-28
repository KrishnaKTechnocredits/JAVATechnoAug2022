package nikitaPhase;
class Calculator{
	
	void add (int x,int y) {
	    int ans = x+y;
		System.out.println("Addition is  "+ans);
	}
	
	void sub (int x,int y) {
		int ans = x-y;
		System.out.println("Substrction is  "+ans);
	}
	
	void mul (int x,int y) {
		int ans = x*y;
		System.out.println("Multipliction is  "+ans);
	}
	
	void div (int x,int y) {
	    int ans = x/y;
		System.out.println("Division is  "+ans);
	}
	
	public static void main(String[] args){
		Calculator cal = new Calculator();
		cal.add(10,20);
		cal.sub(40,50);
		cal.mul(60,4);
		cal.div(80,2);
	}
}
