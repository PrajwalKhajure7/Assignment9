package ass9;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class GetConnection {
	
	//-----------to establish connection --------------------------
	
	public static Connection getConnection() throws ClassNotFoundException {
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		
		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully.");
			Connection con =DriverManager.getConnection(url,"prajwal","7888");
			
			System.out.println("Connection got Established ");
			
			return con;
		}
		catch(SQLException e) {
			System.out.println("Connection not Established .");
		}
		return null;
	}
}

	


