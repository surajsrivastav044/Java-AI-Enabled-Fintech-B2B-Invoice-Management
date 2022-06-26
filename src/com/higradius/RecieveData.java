package com.higradius;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/RecieveData")
public class RecieveData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RecieveData() {
        super();  
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			Connection con = DBConnection.createConnect();
			Statement st = con.createStatement();
			String query = "SELECT sl_no, business_code, cust_number, clear_date, buisness_year,\r\n"
					+ " doc_id, posting_date, document_create_date,due_in_date,invoice_currency,\r\n"
					+ " document_type,posting_id,total_open_amount,baseline_create_date,\r\n"
					+ " cust_payment_terms,invoice_id from winter_internship ORDER BY sl_no";
			ResultSet rs = st.executeQuery(query);
			
			ArrayList<Response> data = new ArrayList<>();
			while(rs.next())
			{
				Response inv = new Response(rs);
				data.add(inv);
				System.out.println(inv);
			}
			Gson gson = new GsonBuilder().serializeNulls().create();
			String invoices  = gson.toJson(data);
			response.setContentType("application/json");
			
			try {
				response.getWriter().write(invoices);//getWriter() returns a PrintWriter object that can send character text to the client. 
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
			rs.close();
			st.close();
			con.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
