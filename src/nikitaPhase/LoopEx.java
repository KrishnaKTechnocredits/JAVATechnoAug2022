package nikitaPhase;
class LoopEx{  
	
	void evenNumber(int startIndex , int endIndex){
		System.out.println("Even number between " + startIndex + "and "+ endIndex + " are:");
		
	    for (int index = startIndex; index<=endIndex; index++){
		    if (index % 2 == 0){
			    System.out.println(index);
			}
		}
        System.out.println();
	}

		
		
	void div5 (int startIndex, int endIndex){
		System.out.println("Number divisible by 5 between " + startIndex + "and "+ endIndex + "are:");
		for (int index = startIndex; index<=endIndex; index++){
		   if (index%5 == 0){
			   System.out.println(index);
		   }
		   
		}
		System.out.println();
	}
	
	
	void div5and3 (int startIndex, int endIndex){
        System.out.println("Number divisible by 5 and 3 between " + startIndex + "and " + endIndex + "are:");
            for(int index = startIndex; index<=endIndex; index++){
                if (index % 5 == 0 && index % 3 == 0){
                    System.out.println(index);
				}
			}
		System.out.println();
	}

    void div7and13 (int startIndex, int endIndex){
        System.out.println("Number divisible by 7 and 13 between " + startIndex + "and " + endIndex + "are:");
            for(int index = startIndex; index<=endIndex; index++){
                if(index % 7 == 0 || index % 13 == 0){
					if (index % 7 == 0){
						System.out.println(index + " is divisible by 7");
					}
					else
						System.out.println(index + " is divisible by 13");
				}
			}
	}
	
	 
	public static void main (String args []){
		LoopEx loopex = new LoopEx();
		loopex.evenNumber(10,15);
		loopex.div5(10,30);
		loopex.div5and3(5,18);
		loopex.div7and13(5,40);
	}
}