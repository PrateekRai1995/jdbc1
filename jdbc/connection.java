package jdbc;
import java.sql.*;
public class connection {
public static Connection getConnection() {
	Connection con= null;
	try {
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pk","root","root");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	return con;
}
}
