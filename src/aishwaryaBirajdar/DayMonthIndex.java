package aishwaryaBirajdar;


class DayMonthIndex{
	
	void dayIndex(int x){
		if(x==1){
			System.out.println("Its Mondays");
		}else if(x==2){
			System.out.println("Its Tuesday");
		}else if(x==3){
			System.out.println("Its Wednesday");
		}else if(x==4){
			System.out.println("Its Thursday");
		}else if(x==5){
			System.out.println("Its Friday");
		}else if(x==6){
			System.out.println("Its Saturaday");
		}else if(x==7){
			System.out.println("Its Sunday");
		}else{
			System.out.println("Invalid Index...!!!");
		}
	}
	
	void weekIndex(int x){
		if(x==1 || x==2 || x==3 || x==4 || x==5){
			System.out.println("Its a Weekday");
		}else if(x==6 || x==7){
			System.out.println("Its a Weekend");
		}else{
			System.out.println("Invalid Index...!!!");
		}
	}
	
	void monthIndex(int x){
		if(x==1 || x==2 || x==3){
			System.out.println("Its a FY2022 Q1");
		}else if(x==4 || x==5 || x==6){
			System.out.println("Its a FY2022 Q2");
		}else if(x==7 || x==8 ||x==9){
			System.out.println("Its a FY2022 Q3");
		}else if(x==10 || x==11 || x==12){
			System.out.println("Its a FY2022 Q4");
		}else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		DayMonthIndex dmindex = new DayMonthIndex();
		dmindex.dayIndex(4);
		dmindex.weekIndex(6);
		dmindex.monthIndex(-3);
		dmindex.dayIndex(9);
		dmindex.dayIndex(1);
		dmindex.weekIndex(0);
		dmindex.monthIndex(-13);
	}
}