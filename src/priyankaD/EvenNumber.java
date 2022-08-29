package priyankaD;

class EvenNumber{

    void divNum(int x,int y){
	   for(int index=x;index>=y;index--){
	    if(index%8==0)
			System.out.println(index);
		}
	}
	public static void main(String[]args){
	    EvenNumber even_num=new EvenNumber();
		even_num.divNum(50,1);	
	}
}