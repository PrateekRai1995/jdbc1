package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;

import com.mysql.cj.protocol.Resultset;

public class JDBC4 {
public static void main(String[] args) {
	try {
		Connection con=connection.getConnection();
		String q="insert into table2(tname,tcity,fees) Values(?,?,?)";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter City");
		String city=br.readLine();
		System.out.println("Enter id");
		int id=Integer.parseInt(br.readLine());
		PreparedStatement pst=con.prepareStatement(q);
		pst.setString(1, name);
		pst.setString(2, city);
		pst.setInt(3, id);
		pst.executeUpdate();
		System.out.println("xxxxxxxxxxxxx");
		
		
	//Show tables from database
		
		String s2="select * from table2";
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(s2);
		
		while(rs.next()) {
			int id1=rs.getInt(1);
			String s1=rs.getString(2);
			String s3=rs.getString(3);
			int fee=rs.getInt(4);
			System.out.println(id1+" "
					+ ""+s1+" ,"+s3+" ,"+fee+" ");					
		}
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}

