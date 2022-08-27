class Example5{

  int x = 10;
  int y = 20;
  
    void processData(){
     x = x+1 ;
	 y = y+1;
	}
	 
	void display(){
	     System.out.println(x + " : " + y);
	}	
    public static void main(String[] args){
      Example5 example51 = new Example5();
      Example5 example52 = new Example5();

      example51.processData();
	  example52.processData();
	  example52.processData();
	  
      example51.display();
      example52.display();
    }
}	
	 
	 