package snehalJojare;

class Example{

	int accountNumber = 123;
	String name = "Hi";
	
	void processData(){
		//String name = "Techno";
		//int accountNumber = 567;
		accountNumber = 912;
	}
	
	void printInfo(){
		System.out.println(name);
		System.out.println(accountNumber);
	}
	
	public static void main(String [] args){
		Example example = new Example();
		example.processData();
		example.printInfo();
		
	}
	
}