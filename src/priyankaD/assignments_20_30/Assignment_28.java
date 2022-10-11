package priyankaD.assignments_20_30;

public class Assignment_28 {
	/*Program 1 : [10 mins - 13 mins]
	Return count of vowels in a given String using switch case.

	input : TechnOcredits
	output : 4*/
 int countVowelsInString(String name) {
        int count=0;
        String input=name.toLowerCase();
        for(int index=0;index<input.length();index++) {
	       char ch=input.charAt(index);
           switch(ch) {
           case'a':
	               count++;
	               break;
           case'e':
	               count++;
	               break;
           case'i':
	               count++;
	               break;
           case'o':
	               count++;
	               break;
           case'u':
	               count++;
	               break;
          }
     }
         System.out.println("Total vowels in "+name+" are-->"+count); 
        return count;
  }
/*Program 2 : [10 mins]
	Return first vowel from given String.

	input : technocredits
	outout : e*/
      void returnFirstVowelInString(String name) {
         int count=0;
         for(int index=0;index<name.length();index++) {
	     char ch=name.charAt(index);
	     switch(ch) {
	     case'a':
		       count++;
		       break;
	     case'e':
		       count++;
		       break;
	     case'i':
		       count++;
		       break;
	     case'o':
		       count++;
		       break;
	     case'u':
		       count++;
		       break;
	   }      
	     if(count==1) {
	      System.out.println("First vowel in string "+name+" is-->"+name.charAt(index));
	    break;
	}
  }
}
/*Print count of each vowels in a given String using switch case.
* input : technocredits
* output : e -> 2
* o -> 1
* i -> 1*/
  int countOfEachVowelInString(String name) {
       int count=0;
       int countA=0;
       int countE=0;
       int countI=0;
       int countO=0;
       int countU=0;
       for(int index=0;index<name.length();index++) {
	    char ch=name.charAt(index);
        switch(ch) {
	    case'a':
		       countA++;
		       break;
	    case'e':
		       countE++;
		       break;
	    case'i':
		       countI++;
		       break;
	    case'o':
		       countO++;
	           break;
	    case'u':
		       countU++;
		       break;
	     }
     }  
          System.out.println("Count of each vowel in "+name+" as follows--");
           System.out.println("a -->"+countA);
           System.out.println("e-->"+countE);
           System.out.println("i-->"+countI);
           System.out.println("o-->"+countO);
           System.out.println("u-->"+countU);
        return count;
  }
  /*Program 4: [15 mins]
* Print count of each vowels in a given String Array using switch case.
* input : {"technocredits", "swati", "aashvi"}*/
   void printVowelsInStringArray(String []arr) {
        for(String name:arr) {
	       countOfEachVowelInString(name);
        }
    }
     public static void main(String[] args) {
       Assignment_28 assignment=new Assignment_28(); 
        System.out.println("program 1-");
		assignment.countVowelsInString("TechnOcredits");
		System.out.println("-----------------------------");
		System.out.println("program 2-");
		assignment.returnFirstVowelInString("technocredits");
		System.out.println("-----------------------------");
		System.out.println("program 3-");
		assignment.countOfEachVowelInString("technocredits");
		System.out.println("-----------------------------");
		System.out.println("program 4-");
		String[] arr= {"technocredits", "swati", "aashvi"};
		assignment.printVowelsInStringArray(arr);
     }
}
