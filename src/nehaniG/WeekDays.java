class WeekDays{

    void processData(int x){
	    System.out.println("Day Number: " + x);
		if (x==1){
			System.out.println("It's Monday");
		}
	    else if(x==2){
		    System.out.println("It's Tuesday");
	    }
		else if(x==3){
		    System.out.println("It's Wednesday");
	    }
		else if(x==4){
		    System.out.println("It's Thursday");
	    }
		else if(x==5){
		    System.out.println("It's Friday");
	    }
		else if(x==6){
		    System.out.println("It's Saturday");
	    }
		else if(x==7){
		    System.out.println("It's Sunday");
	    }
		else
		System.out.println("It's an Invalid Day");
	    }
		
	public static void main(String[] args){

        WeekDays weekdays = new WeekDays();
        weekdays.processData(1);
		weekdays.processData(2);
		weekdays.processData(7);
		weekdays.processData(-3);
		weekdays.processData(13);
	}
	
}	
			  