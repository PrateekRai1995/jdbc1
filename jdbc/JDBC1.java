package jdbc;
import java.sql.*;
public class JDBC1 {
public static void main(String[] args)  {
	try {
		String url = "jdbc:mysql://localhost:3306/pk";
		String username= "root";
		String password="root";
		Connection con= DriverManager.getConnection(url,username,password);//establishing connection
		String q="create table table2(tid int(20) primary key auto_increment,tname varchar(200) not null,tcity varchar(400),fees int(20))";
		// above we write query and store it into string so that we can pass it by jdbc to sql
		Statement smt=con.createStatement();//we create stmt to fire the query 
		smt.executeUpdate(q);//firing of query
		System.out.println("table created1");
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}

