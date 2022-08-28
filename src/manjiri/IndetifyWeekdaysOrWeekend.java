//Program2: Find weekdays or weekend based on day index
package manjiri;
class IndetifyWeekdaysOrWeekend{
	
	void processData(int dayIndex){
		
		if (dayIndex>=1 && dayIndex <= 5){
			
			System.out.println("Weekday");
		}
		else if (dayIndex >= 6 && dayIndex <= 7){ 
		//(dayIndex == 6 || dayIndex == 7) - is this condition also correct?
			System.out.println("Weekend");
		}
		else{
			System.out.println("Invalid Index");
		}
	}
	
	public static void main(String[] args){
		IndetifyWeekdaysOrWeekend indetifyWeekdaysOrWeekend = new IndetifyWeekdaysOrWeekend();
		indetifyWeekdaysOrWeekend.processData(1);
		indetifyWeekdaysOrWeekend.processData(7);
		indetifyWeekdaysOrWeekend.processData(-10);
	}
}