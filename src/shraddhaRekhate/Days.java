package shraddhaRekhate;

class Days{
	
     void processData1(int dayIndex){
	     if(dayIndex>=1 && dayIndex<=5){
			 System.out.println("Weekday");
		 }else if(dayIndex==6 && dayIndex==7){
			 System.out.println("Weekend");
		 }else{
			 System.out.println("Invalid Day Index");
		 }
	 }
	 
	 void processData2(int monthIndex){
	     if(monthIndex==1 || monthIndex==2 || monthIndex==3){
			 System.out.println("Q1");
		 }else if(monthIndex==4 || monthIndex==5 || monthIndex==6){
			 System.out.println("Q2");
		 }else if(monthIndex==7 || monthIndex==8 || monthIndex==9){
			 System.out.println("Q3");
		 }else if(monthIndex==10 || monthIndex==11 || monthIndex==12){
			 System.out.println("Q4");
		 }else{
			 System.out.println("Invalid Month Index");
		 }
	 }
	 
	 void processData3(int index){
	     if(index==1){
			 System.out.println("Monday");
		 }else if(index==2){
			 System.out.println("Tuesday");
		 }else if(index==3){
			 System.out.println("Wdenesday");
		 }else if(index==4){
			 System.out.println("Thursday");
		 }else if(index==5){
			 System.out.println("Friday");
		 }else if(index==6){
			 System.out.println("Saturday");
		 }else if(index==7){
			 System.out.println("Sunday");
		 }else{
			 System.out.println("Invalid Index");
		 }
	 }
	 
	 public static void main(String[] args){
			Days days=new Days();
			days.processData1(4);
			days.processData2(8);
			days.processData3(7);
	}
}