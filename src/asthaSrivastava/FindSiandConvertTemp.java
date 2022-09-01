package asthaSrivastava;

class FindSiandConvertTemp {
	void simpleInterest( int P, int R,int T){
		double SI;
		SI = ((P*R*T)/100);
		System.out.println("Simple Interest is "+ SI); 
	}	
	
	void convertTemp( double F){
		double C;
		C = ((F - 32) * 5) / 9;
		System.out.println("Temperature is "+ C); 
	}
	
	public static void main(String[] args) {
		FindSiandConvertTemp findSiAndTemp = new FindSiandConvertTemp();
		findSiAndTemp.simpleInterest(100,30,10);
		findSiAndTemp.convertTemp(82);
	}
}
