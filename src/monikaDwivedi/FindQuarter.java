package monikaDwivedi;
/*Find quater based on month index.*/



class FindQuarter{
	void printQuarter(int qno){
		if(qno > 1 && qno < 4 ){
			System.out.println("It's 1st quarter of the year");
		}else if(qno >= 4 && qno <= 6 ){
			System.out.println("It's 2nd quarter of the year");
		}else if(qno >= 7 && qno <= 9 ){
			System.out.println("It's 3rd quarter of the year");
		}else if(qno >= 10 && qno <= 12 ){
			System.out.println("It's 4th quarter of the year");
		}
		else
			System.out.println("Invalid entry");
	}
	public static void main(String[] args){
		FindQuarter findQuarter = new FindQuarter();
		findQuarter.printQuarter(2);
		findQuarter.printQuarter(6);
		findQuarter.printQuarter(9);
		findQuarter.printQuarter(10);
	}
}