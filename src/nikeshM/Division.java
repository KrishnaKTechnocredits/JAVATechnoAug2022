package nikeshM;

class Division {
	void parameter (int startIndex, int endIndex){
		int count= 0;
		for (int index= startIndex ; startIndex<endIndex; index++ ) {
			if(index%3==0 && index%7==0){
				count++;
				System.out.println(index + "");
				if (count==3) {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Division div = new Division ();
		div.parameter(20, 100);
	}
}


