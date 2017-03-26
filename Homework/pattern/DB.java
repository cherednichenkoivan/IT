package pattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DB {
	private static final String url = "jdbc:mysql://localhost:3306/itea?autoReconnect=true&useSSL=false";
    private static final String user = "root";
    private static final String password = "";
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    
    public String [] getValue() throws SQLException{
    	 String query = "SELECT * from user ";
    	 con = DriverManager.getConnection(url, user, password);
         stmt = con.createStatement();
         rs = stmt.executeQuery(query);
         String [] params = new String[2];
         
         while (rs.next()) {
          params[0]  = rs.getString(2);
          params[1] =rs.getString(3);   
         }
         
    	return params;
    }

}
