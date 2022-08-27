class Cal{
    int number1=10;
	int number2=5;
	int ans=0;
	 
	void add() {
		ans = number1+number2;
		System.out.println("Addition is: "+ans);
	}	
	public static void main(String[] args){
		Cal cal= new Cal();
		cal.add();
	} 
}
	 
	 