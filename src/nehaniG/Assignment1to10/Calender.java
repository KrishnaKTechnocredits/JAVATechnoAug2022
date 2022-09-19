package nehaniG.Assignment1to10;

class Calender{

    void quarter(int month){
		if(month == 1  || month == 2 || month == 3)
			System.out.println("FY2022 Q1");
		else if(month == 4  || month == 5 || month == 6)
			System.out.println("FY2022 Q2");
		else if(month == 7  || month == 8 || month == 9)
			System.out.println("FY2022 Q3");
		else if(month == 10  || month == 11 || month == 12)
			System.out.println("FY2022 Q4");
		else
			System.out.println("Invalid Number");
	}
	
	public static void main(String[] args){

        Calender calender = new Calender();
        calender.quarter(1);
		calender.quarter(5);
		calender.quarter(8);
		calender.quarter(11);
		calender.quarter(13);
	}
	
}
		
		