package pankajBhatt;

class WhichQuarter{
	
	void processData(int quarterIndex){
		if(quarterIndex >=1 && quarterIndex <=3){
			System.out.println("It's Q1");
		}
		else if(quarterIndex >=4 && quarterIndex <=6){
			System.out.println("It's Q2");
		}
		else if(quarterIndex >=7 && quarterIndex <=9){
			System.out.println("It's Q3");
		}
		else if(quarterIndex >=10 && quarterIndex <=12){
			System.out.println("It's Q4");
		}
		else
			System.out.println("Invalid Quarter Index of the year");
	}
	
	public static void main(String[] srgs){
		WhichQuarter whichQuarter = new WhichQuarter();
		whichQuarter.processData(4);
	}
}