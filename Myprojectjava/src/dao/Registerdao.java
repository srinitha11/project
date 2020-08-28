package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entity.Customer;

public class Registerdao {
Connection conn;
	public Registerdao()throws Exception
	{
		conn=dbconn.Dbconnection.getConn();
	}
		public boolean registerCustomer(Customer customer)throws Exception
		{
			PreparedStatement psmt=conn.prepareStatement("insert into customerdetls values(?,?,?,?)");
			psmt.setString(1,customer.getLoginName());
			psmt.setString(2,customer.getPassword());
			psmt.setString(3,customer.getEmailid());
			psmt.setString(4, customer.getMobile());
			int row_eff=psmt.executeUpdate();
			
			if(row_eff>0)
				return true;
			else
				return false;
		}
	}
		
	


