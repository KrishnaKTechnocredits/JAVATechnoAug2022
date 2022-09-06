package shrutiArora;
public class ProcessIndex {
	void processDays(int dayIndex){
		if (dayIndex==1){
		System.out.println(dayIndex+ " ->Monday");
		}
		else if (dayIndex==2){
		System.out.println(dayIndex +" ->Tuesday");
		}
		else if (dayIndex==3){
		System.out.println(dayIndex+ " ->Wednesday");
		}
		else if (dayIndex==4){
		System.out.println(dayIndex+ " ->Thusday");
		}
		else if (dayIndex==5){
		System.out.println(dayIndex +" ->Friday");
		}
		else if (dayIndex==6){
		System.out.println(dayIndex +" ->Saturday");
		}
		else if (dayIndex==7){
		System.out.println(dayIndex +" ->Sunday");
		}
		else{
		System.out.println("Day Index -> "+dayIndex+ " :Invalid Index");
		}
		}
		
		void processWeek(int dayIndex){
			if(dayIndex>0 && dayIndex<=5){
				System.out.println(dayIndex+" ->Weekday");
			}else if (dayIndex>5 && dayIndex<8){
				System.out.println(dayIndex+" ->Weekend");
			}else{
				System.out.println("dayIndex -> "+dayIndex+" :Invalid Index");
			}
		}
		
		void processMonths(int index){
			if(index>0 && index<4){
				System.out.println("FY2022 Q1");
			}else if(index>3 && index<7){
				System.out.println("FY2022 Q2");
			}else if (index>6 && index<10){
				System.out.println("FY2022 Q3");
			}else if(index>9 && index<13){
				System.out.println("FY2022 Q4");
			}else{
				System.out.println("Invalid");
			}
		}
			
	public static void main(String[] a){
			ProcessIndex index=new ProcessIndex();
			System.out.println("**********************************************Index Based Program**************************");
			System.out.println("*************ProcessDays***************");
			index.processDays(5);
			index.processDays(3);
			index.processDays(13);
			System.out.println("***************ProcessWeek*****************");
			index.processWeek(6);
			index.processWeek(3);
			index.processWeek(9);
			System.out.println("*****************ProcesMonth********************");
			index.processMonths(12);
			index.processMonths(14);
	}
}