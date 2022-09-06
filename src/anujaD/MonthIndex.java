package anujaD;

class MonthIndex{
	
			void Quater(int month){
				if(month == 1 || month == 2 || month == 3) 
						System.out.println("This is FY2022 Q1");
				else if(month == 4 || month == 5 || month == 6) 
						System.out.println("This is FY2022 Q2");
				else if(month == 7 || month == 8 || month == 9) 
						System.out.println("This is FY2022 Q3");
				else if(month == 10 || month == 11 || month == 12) 
						System.out.println("This is FY2022 Q4");
				else
						System.out.println("Invalid Month Index");
					
			}
					public static void main(String[] args){
						MonthIndex  monthIndex1 = new MonthIndex();
						monthIndex1.Quater(2);
						monthIndex1.Quater(6);
						monthIndex1.Quater(10);
						monthIndex1.Quater(8);
						monthIndex1.Quater(15);
					}
}