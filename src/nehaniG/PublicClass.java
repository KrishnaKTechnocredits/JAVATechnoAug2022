class PublicClass{
	int roll = 1;
	String name = "technocredits";
	
	void updateInfo(){
		int roll = 2;
		name = "maulik";
	}
	
	void displayInfo(){
		 System.out.println(roll + " : " + name);
	}
	
	public static void main(String[] args){
		PublicClass publicclass = new PublicClass();
		publicclass.updateInfo();
		
		PublicClass publicclass1 = new PublicClass();
		publicclass1.displayInfo();
	}
	
}	
