package vinod.TestPrograme;
class DayIndex {
 int day = 1;
 
 void weekdays(int day){
	 if(day >= 1 && day<=6)
	 {
		 System.out.println("its weekdays");
	 }
	 else if (day == 6 || day == 7)
	 {
		 System.out.println("its weekend");
	 }
	 else
	 {
		 System.out.println("Invalid day of index");
	 }
	 
 }
 public static void main(String[] args){
	 DayIndex dayindex = new DayIndex();
	 dayindex.weekdays(1);
	 dayindex.weekdays(2);
	 dayindex.weekdays(5);
	 dayindex.weekdays(-2);
 }
 
}