package sanket;

class DayWeekMonth{

    void dayIndeday(int day){
        if(day==1)
            System.out.println("Today is Monday");
        else if(day==2)
            System.out.println("Today is Tuesday");
        else if(day==3)
            System.out.println("Today is Wednesday");
        else if(day==4)
            System.out.println("Today is Thursday");
        else if(day==5)
            System.out.println("Today is Friday");
        else if(day==6)
            System.out.println("Today is Saturday");
        else if(day==7)
            System.out.println("Today is Sunday");
        else
            System.out.println("Invalid value for day of week");
    }
   
    void weekIndeday(int week){
        if(week>=1 && week<=5)
            System.out.println("Today is Weekday");
        else if(week==6 || week==7)
            System.out.println("Today is Weekend");
        else
            System.out.println("Invalid value for day");
    }
   
    void monthIndeday(int month){
        if(month==1 || month==2 || month==3)
            System.out.println("The Financial Quarter Details are :  FY2022 Q1");
        else if(month==4 || month==5 || month==6)
            System.out.println("The Financial Quarter Details are :  FY2022 Q2");
        else if(month==7 || month==8 || month==9)
            System.out.println("The Financial Quarter Details are :  FY2022 Q3");
        else if(month==10 || month==11 || month==12)
            System.out.println("The Financial Quarter Details are :  FY2022 Q4");
        else
            System.out.println("Invalid Financial Quarter value");
    }
   
    public static void main(String[] args){
        DayWeekMonth dayWeekMonth1 = new DayWeekMonth();
        dayWeekMonth1.dayIndeday(7);
        dayWeekMonth1.weekIndeday(7);
        dayWeekMonth1.monthIndeday(12);
		dayWeekMonth1.dayIndeday(-3);
        dayWeekMonth1.weekIndeday(-1);
        dayWeekMonth1.monthIndeday(13);
    }
}