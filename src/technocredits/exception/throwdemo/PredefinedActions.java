package technocredits.exception.throwdemo;

public class PredefinedActions {

	void launchURL(String url) {
		if(url.startsWith("http") || url.startsWith("https")) {
			
		}else {
			System.out.println("Invalid URL");
			throw new NullPointerException();
		}
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		new PredefinedActions().launchURL("ftp://google.com");
		System.out.println("end");
	}
}

