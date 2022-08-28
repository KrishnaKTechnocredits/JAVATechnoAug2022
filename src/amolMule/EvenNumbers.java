package amolMule;
class EvenNumbers{

	void processEvenNumber(int startnum, int endnum){
		for(int index=startnum;index<= endnum;index++){
			if(index%2==0)
				System.out.println("Even numbers between given range "+ index);
		}
	}
	
	public static void main(String args[]){
		EvenNumbers even= new EvenNumbers();
		even.processEvenNumber(10,15);
	}
}