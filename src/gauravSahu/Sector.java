package gauravSahu;


class Sector{
	
		String post = "Postman";
		int x;
		
		void subpost1(int y, int x){
			this.x = x + y;
			System.out.println("Post office received" + this.x );
		}
		
		void subpost2(int z){
			x = z + x;
			System.out.println("Post office received" + x );
		}
		
		public static void main(String [] args){
			Sector sector = new Sector();
			sector.subpost1(2,3);
			sector.subpost2(2);
		}
}