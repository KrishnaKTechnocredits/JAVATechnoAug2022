package aishwaryaBirajdar;

public class Facebook{
	static int likes = 0;
	static int comments;
	int shareCount = 1;
	
	void likeMyPost()
	{
	likes++;
	}
	
	void postComment()
	{
	comments++;
	}
	
	void shareMyPost()
	{
	shareCount++;
	}
	
	void display()
	{
	 System.out.println(likes + comments + shareCount);
	}
	
	public static void main(String[] args){
		
		Facebook facebook = new Facebook();
		facebook.likeMyPost();
		facebook.likeMyPost();
		facebook.postComment();
		facebook.likeMyPost();
		facebook.postComment();
		facebook.shareMyPost();
		facebook.display();

	}
	
}