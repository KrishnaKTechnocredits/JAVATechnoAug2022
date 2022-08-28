package sagaryadav;

class Student1{
		String name="Sagar";
		int rno=1;
		
		void display(){
			System.out.print(name + " ");
			System.out.println(rno);
		}
		
		void update(){
			name="Saee";
			rno=2;
					
		}
			public static void main (String[] args){
				Student1 s1=new Student1();			
				s1.display();
				s1.update();
				s1.display();
				
		}	
	}
	