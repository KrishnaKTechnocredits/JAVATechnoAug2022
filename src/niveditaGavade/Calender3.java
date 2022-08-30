package niveditaGavade;
class Calender3{
	
	void monthIndex (int index){
		if(index >=1 &&  index<=3){
			System.out.println("FY2022 Q1");
		}
		else if(index >=4 && index<=6){
			System.out.println("FY2022 Q2");
		}
		else if(index >=7 && index<=9){
			System.out.println("FY2022 Q3");
		}
		else if(index >=10 && index<=12){
			System.out.println("FY2022 Q4");
		}
		else{
			System.out.println("Invalid Month");
		}
	}
	public static void main(String[] args){
		Calender3 calender3 = new Calender3();
		calender3.monthIndex(3);
		calender3.monthIndex(6);
		calender3.monthIndex(7);
		calender3.monthIndex(11);
	}
}
	