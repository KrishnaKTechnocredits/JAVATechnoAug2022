package asthaSrivastava;

class FindSiandConvertTemp {
	void simpleInterest( int p, int r,int t){ 
		double si;								
		si = ((p*r*t)/100);
		System.out.println("Simple Interest is "+ si); 
	}	
	
	void convertTemp( double fahrenheit ){   
		double celsius ;  					
		celsius = ((fahrenheit - 32) * 5) / 9;
		System.out.println("Temperature is "+ celsius); 
	}
	
	public static void main(String[] args) {
		FindSiandConvertTemp findSiAndTemp = new FindSiandConvertTemp();
		findSiAndTemp.simpleInterest(100,30,10);
		findSiAndTemp.convertTemp(82);
	}
}
