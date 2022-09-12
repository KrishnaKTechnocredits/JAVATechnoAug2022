package ashishBramhe;

class A4_Quarter{
	
	void printQuarterFromMonthNo(int monthNo){
		if(monthNo >= 1 && monthNo <= 3)
			System.out.println(monthNo + " belongs to Quarter 1");
		else if(monthNo > 3 && monthNo <= 6)
			System.out.println(monthNo + " belongs to Quarter 2");
		else if(monthNo > 6 && monthNo <=9)
			System.out.println(monthNo + " belongs to Quarter 3");
		else	
			System.out.println(monthNo + " is invalid month number");
	}
	
	public static void main(String args[]){
		A4_Quarter quarter = new A4_Quarter();
		quarter.printQuarterFromMonthNo(2);
		quarter.printQuarterFromMonthNo(5);
		quarter.printQuarterFromMonthNo(9);
		quarter.printQuarterFromMonthNo(23);		
	}	
}