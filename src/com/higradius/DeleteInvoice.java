package com.higradius;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteInvoice")
public class DeleteInvoice extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			String siNos = request.getParameter("sNo");
			String[] split = siNos.split("@");
			String query = null;
			for (int i = 0; i < split.length; i++) {
				if (query == null) {
					query = "DELETE FROM winter_internship WHERE sl_no = " + split[i];
				} else {
					query += " OR sl_no=" + split[i];
				}
			}
			
			Connection con = DBConnection.createConnect();
			boolean execute = con.createStatement().execute(query);

			if (execute)
				response.getWriter().print("success");
			else 
			{
				response.getWriter().print("error");
			}
		} 
		catch (Exception e) {
			e.printStackTrace();
			response.getWriter().print("error");
		}
	}
}
