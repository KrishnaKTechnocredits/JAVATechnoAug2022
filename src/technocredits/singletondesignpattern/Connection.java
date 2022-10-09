package technocredits.singletondesignpattern;

public class Connection {
    private static Connection con = null;
	
    private Connection(){
		
	}
	
	static public Connection getObject() {
		if(con == null)
			con = new Connection();
		return con;
	}
	
	void selectDataFromDB() {
		//Code
	}
	
	void updateData() {
		//Code
	}	
}
