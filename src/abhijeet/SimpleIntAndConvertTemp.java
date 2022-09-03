package abhijeet;

class SimpleIntAndConvertTemp{
	
	void findSimpleInterest(int principleAmount,int totalYears,double rate){
		double result=0;
		if (principleAmount>=0){
			if(totalYears>=0){
				if(rate>=0){
		result=(principleAmount*totalYears*rate)/100;
		System.out.println("The simple interest on principle amount "+principleAmount+" at a rate of "+rate+"% for "+totalYears+" years is "+result);
				}else
					System.out.println("Invalid rate of interest");
			}else
				System.out.println("Invalid number of years");
		}else
			System.out.println("Invalid amount");
	}
	
	void convertTemperatureUnit(double tempF){
		double result=0;
		result=((tempF-32)*5)/9;
		System.out.println("The temperature is "+result+" degree celsius");
	}
	
	public static void main(String[]args){
		SimpleIntAndConvertTemp simpleIntAndConvertTemp = new SimpleIntAndConvertTemp();
		simpleIntAndConvertTemp.findSimpleInterest(1000,2,5.5);
		simpleIntAndConvertTemp.findSimpleInterest(-1000,2,5.5);
		simpleIntAndConvertTemp.findSimpleInterest(1000,-2,5.5);
		simpleIntAndConvertTemp.findSimpleInterest(1000,2,-5.5);
		System.out.println();
		simpleIntAndConvertTemp.convertTemperatureUnit(0);
		simpleIntAndConvertTemp.convertTemperatureUnit(98.6);
	}
}