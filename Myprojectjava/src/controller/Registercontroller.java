package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registercontroller")
public class Registercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String loginName=request.getParameter("loginName");
		String password=request.getParameter("password");
		String emailid=request.getParameter("emailid");
		String mobile=request.getParameter("mobile");

		entity.Customer customer=new entity.Customer();
		customer.setLoginName(loginName);
		customer.setPassword(password);
		customer.setEmailid(emailid);
		customer.setMobile(mobile);
		
		try
		{
		dao.Registerdao registerDAO=new dao.Registerdao();
		
		if(registerDAO.registerCustomer(customer))
			out.println("Successfully Registered");
		else
			out.println("Problem Occured");
		
		}
		catch(Exception e)
		{
			out.println("Exception Occured"+e);
		}
		
		
	}

	}


