package dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	public static Connection getConn()throws Exception
	{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String Url = "jdbc:sqlserver://LENOVO-PC\\SQLEXPRESS;databasename=s210075";
		String user="sa";
		String password="1234";
			Connection conn = DriverManager.getConnection(Url,user,password);
		return conn;
	}
}


