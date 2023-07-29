package jdbc;
import java.sql.*;
import java.util.*;
import javax.print.attribute.standard.DocumentName;

import com.mysql.cj.conf.BooleanPropertyDefinition.AllowableValues;
public class JDBC2 {
public static void main(String[] args) {
	try {
		
	
		String url = "jdbc:mysql://localhost:3306/pk";
		String username= "root";
		String password="root";
		Connection con= DriverManager.getConnection(url,username,password);//establishing connection
		String q="insert into table2(tname,tcity,fees) Values(?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(q);//we use prepared statement because we are going to pass value later-on
		pstmt.setString(1, "Chopa");
		pstmt.setString(2, "Sivan");
		pstmt.setInt(3, 111);
		//pstmt.executeUpdate();
		//Now getting value from user
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name");
		String n1=sc.nextLine();
		System.out.println("Enter City");
		String c1=sc.nextLine();
		System.out.println("Enter Fees");
		int i1=sc.nextInt();
		pstmt.setString(1, n1);
		pstmt.setString(2, c1);
		pstmt.setInt(3, i1);
		pstmt.executeUpdate();
		System.out.println("Updated");
		System.out.println("****");
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
}
