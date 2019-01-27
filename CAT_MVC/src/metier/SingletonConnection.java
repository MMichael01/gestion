package metier;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection;
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1/CAT_PROD?useSSL=false","root","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		return connection;
	}
	
}
