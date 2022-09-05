package sohail.if_else_program;

class MonthIndex{
	
	void showIndex(int index){
		if(index==1 || index==2 || index==3)
		System.out.println("FY2022 Q1");
		
		else if (index==4 || index==5 || index==6)
			System.out.println("FY2022 Q2");
		
		else if (index==7 || index==8 || index==9)
			System.out.println("FY2022 Q3");
		
		else if (index==10 || index==11 || index==12)
			System.out.println("FY2022 Q4");
		
		else
			System.out.println("Invalid Index");
		
	}
	
	public static void main (String [] args){
		MonthIndex monthindex=new MonthIndex();
		monthindex.showIndex(5);
}
}