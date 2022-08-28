package akankshaSharma;
class Calculation{
	void evenNumber(int startIndex, int endIndex){
	   System.out.println("Even Numbers are :");
	   for(int count=startIndex; count<=endIndex; count++){
		    if(count%2 ==0)
				System.out.println(count);
		}
	}
	
	void div5(int startIndex, int endIndex){
	    System.out.println("Numbers divisible by 5 are :");
	    for(int count=startIndex; count<=endIndex; count++){
		    if(count%5 ==0)
				System.out.println(count);
		}
	}
	
	void div5and3(int startIndex, int endIndex){
	    System.out.println("Numbers divisible by 5 and 3 are :");
	    for(int count=startIndex; count<=endIndex; count++){
		    if(count%5 ==0 && count%3==0)
				System.out.println(count);
		}
	}
	
	void div7and13(int startIndex, int endIndex){
	    System.out.println("Numbers divisible by 7 and 13 are");
	    for(int count=startIndex; count<=endIndex; count++){
	        if(count%7==0 || count%13==0){
	            if(count%7==0)
					System.out.println(count + " Number is divisible by 7");
	        else
	            System.out.println(count +" Number is divisible by 13");
	        }
	    }
	}
	        
	void sum(int startIndex,int endIndex){
	    int sum=0;
	    for(int count=startIndex; count<=endIndex; count++){
	        sum+=count;
	    }
	    System.out.println("Sum is : " + sum);
	}
	
	void difference(int startIndex, int endIndex){
	    int sum1=0;
	    int sum2=0;
	    for(int count=startIndex; count<=endIndex; count++){
	        if(count%2==1)
	            sum1+=count;
	        else if(count%2==0)
	           sum2+=count;
	    }
	    int temp = sum1-sum2;
	    System.out.println("Difference is: " + temp);
	}
	
	void reverseOddNumber(int startIndex , int endIndex){
	   System.out.println("Reverse odd Numbers are :");
	   for(int count=endIndex; count>=startIndex; count--){
		    if(count%2 ==1)
				System.out.println(count);
		}
	}
	    
	public static void main(String[] args){
		Calculation calculation = new Calculation();
		calculation.evenNumber(10,15);
		calculation.div5(10,30);
		calculation.div5and3(5,18);
		calculation.div7and13(5,40);
		calculation.sum(1,5);
		calculation.difference(3,9);
		calculation.reverseOddNumber(10,20);
	}
}
