//Program3: Find quarter based on month index
package manjiri;
class FindQuarter{

	String year = "FY2022";
	
	void processData(int monthIndex){
		if (monthIndex >= 1 && monthIndex <= 3){
			System.out.println(year + " " + "Q1");
		}
		else if (monthIndex >= 4 && monthIndex <= 6){
			System.out.println(year + " " + "Q2");
		}
		else if (monthIndex >= 7 && monthIndex <= 9){
			System.out.println(year + " " + "Q3");
		}
		else if (monthIndex >= 10 && monthIndex <= 12){
			System.out.println(year + " " + "Q4");
		}
		else{
			System.out.println("Invalid month index");
		}
	}
	
	public static void main(String[] args){
		FindQuarter findQuarter = new FindQuarter();
		findQuarter.processData(3);
		findQuarter.processData(8);
		findQuarter.processData(100);
	}
	
	
}