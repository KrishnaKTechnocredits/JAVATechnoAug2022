package amrutaSagne;
class Quarter {
	
	public static void main(String[] args) {
		int month= 1;
	
		if (month <= 1 && month >= 3){
		System.out.println ("this is Quarter 1");
		}
	
		else if (month <= 4 && month >= 6){
		System.out.println ("this is Quarter 2");
		}
	
		else if (month <= 7 && month >= 9){
		System.out.println ("this is Quarter 3");
		}
	
		else if (month <= 10 && month >= 12){
		System.out.println ("this is Quarter 4");
		}
		
		else{
			System.out.println ("this is invalid month");
		}
	}
}