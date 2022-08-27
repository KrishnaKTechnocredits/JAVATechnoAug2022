class EvenNumber{

    void isEvenNumber(int number);
	boolean flag = true;
	
	    if(number<1){
		 System.out.println(number+ "is invalid input");
		 }
		 
	    else{
		for(intex=1;index<=number;index++){
	    if (number%index == 2){
		        flag = false;
		        System.out.println(number + " is not a even number");
				 break;
			}
		}
         if (flag==true)
			 System.out.println(number + " is a even number");
		}
	}

    public static void main(String[] args){
        EvenNumber evenNumber = new EvenNumber();
        evenNumber.isEvenNumber(15);
		evenNumber.isEvenNumber(17);
		evenNumber.isEvenNumber(-90);
		
    }
}	