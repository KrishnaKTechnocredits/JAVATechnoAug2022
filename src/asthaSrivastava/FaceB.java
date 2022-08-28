package asthaSrivastava;

public class FaceB	 {
	
	static int likes = 0;
	static int comments;
	int count = 1;
	
	void likeMyPost(){
		likes++;
	}
	
	void postComments(){
		comments++; 
	}
	
	void shareCount(){
		count++;
	}
	
	void display(){
		System.out.println(likes + comments + count);
	}
	
	public static void main (String[] args) {
		FaceB faceb = new FaceB();
		faceb.likeMyPost();
		faceb.likeMyPost();
		faceb.postComments();
		faceb.likeMyPost();
		faceb.postComments();
		faceb.shareCount();
		faceb.display();
	}
}