package com.higradius;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@WebServlet("/AdvanceSearch")
public class AdvanceSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AdvanceSearch() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Connection con = DBConnection.createConnect();

			
			String customer_Number = "200769623";// request.getParameter("customerNumber");
			int customerNumber = Integer.parseInt(customer_Number);
			String docId = "1930147974";// request.getParameter("docId");
			String invoice_Id = "1930147974";// request.getParameter("invoiceId");
			int invoiceId = Integer.parseInt(invoice_Id);
			String business_Year = "2019"; // request.getParameter("businessYear");
			int businessYear = Integer.parseInt(business_Year);
			 
			 //String page = request.getParameter("page");
			 

			Statement st = con.createStatement();
			String sql_statement = "SELECT * FROM winter_internship WHERE 	 cust_number=" + "'" + customerNumber + "' AND doc_id=" + "'" + docId + "'AND invoice_id=" + "'" + invoiceId + "' AND buisness_year=" + "'" + businessYear + "'";// + "%' LIMIT
																											// " + page
																											// +"," +
																											// rowCount;
			ResultSet rs = st.executeQuery(sql_statement);

			ArrayList<Response> data = new ArrayList<>();
			while (rs.next()) {
				Response inv = new Response(rs);
				data.add(inv);
			}

			Gson gson = new GsonBuilder().serializeNulls().create();
			String invoices = gson.toJson(data);
			response.setContentType("application/json");
			try {
				response.getWriter().write(invoices);// getWriter() returns a PrintWriter object that can send character
														// text to the client.
			} catch (IOException e) {
				e.printStackTrace();
			}
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
