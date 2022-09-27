package hardikBhatia.Assignments;

class Assignment25{

    //Program 1: Print all the repeated word in given string.
	void printRepetedNames(String input){
        String[] names = input.split(" ");
        for(int index = 0; index < names.length; index++){
        	
        	int inputLength = input.length();
            String processedString = input.replaceAll(names[index], "");
            int diffCount = inputLength - processedString.length();
            
            if(diffCount > names[index].length()){
            	input = input.replaceAll(names[index], "");
            	System.out.println(names[index]);
            }
        } 
    }
	
	//Program 2: Print all the non repeated word in given string.
	void printNonRepetedNames(String input){
		String[] names = input.split(" ");
        for(int index = 0; index < names.length; index++){
        	
        	int inputLength = input.length();
            String processedString = input.toUpperCase().replaceAll(names[index].toUpperCase(), "");
            int diffCount = inputLength - processedString.length();
            
            if(diffCount == names[index].length()){
            	System.out.println(names[index]);
            }
        } 
	}
	
    public static void main(String[] args){
        Assignment25 assignment25 = new Assignment25();
        String str = "Maulik Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
        assignment25.printRepetedNames(str);
        
        System.out.println("----------------------------------------------------------------");
        String str2 = "Maulik Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
        assignment25.printNonRepetedNames(str2);
    }

}