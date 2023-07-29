package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Jdbc5 {
public static void main(String[] args) {
	try {
		Connection con=connection.getConnection();
		String q="insert into image(pic) values (?)";//imagr table pic column
		PreparedStatement pst=con.prepareStatement(q);//firing query by statement via connection
		FileInputStream fis=new FileInputStream("C:\\Users\\user\\Pictures\\Screenshots\\a.png");//create obj for give file of pictures
		
		pst.setBinaryStream(1, fis,fis.available());
		
		pst.executeUpdate();
		System.out.println("done");
		
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
}
}
