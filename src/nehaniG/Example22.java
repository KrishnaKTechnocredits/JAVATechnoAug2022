class Example22{

     int x = 1;
	 int y = 2;
	 
	 void plusX(){
		  x = x +1;
	 }

    void plusY() {
      y = y * 2;
	}

    void displayValue(){
          System.out.println(x+y);
	}

    public static void main(String[] args){
        Example22 example22 = new Example22();
        example22.plusX();		
		example22.plusX();
		example22.plusY();
        example22.plusY();
		example22.displayValue();
	}

}