package com.higradius;

import java.io.IOException;
import java.sql.Connection;
import java.sql.*;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddInvoice")
public class AddInvoice extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddInvoice() {
		super();

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Post calleds");
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			String businessCode = request.getParameter("businessCode");
			String customer_Number = request.getParameter("customerNumber");
			int customerNumber = Integer.parseInt(customer_Number);
			String clearDate = request.getParameter("clearDate");
			String business_Year = request.getParameter("businessYear");
			int businessYear = Integer.parseInt(business_Year);
			String docId = request.getParameter("docId");
			String postingDate = request.getParameter("postingDate");
			String documentCreateDate = request.getParameter("documentCreateDate");
			String dueInDate = request.getParameter("dueInDate");
			String inVoiceCurrency = request.getParameter("inVoiceCurrency");
			String documentType = request.getParameter("documentType");
			String posting_Id = request.getParameter("postingId");
			int postingId = Integer.parseInt(posting_Id);
			String total_Open_Amount = request.getParameter("totalOpenAmount");
			Double totalOpenAmount = Double.parseDouble(total_Open_Amount);
			String baseLineCreateDate = request.getParameter("baseLineCreateDate");
			String custPaymentTerms = request.getParameter("custPaymentTerms");
			String invoice_Id = request.getParameter("invoiceId");
			int invoiceId = Integer.parseInt(invoice_Id);

			Connection con = DBConnection.createConnect();
			String query = "INSERT INTO winter_internship (business_code, cust_number, clear_date, buisness_year, doc_id, posting_date, document_create_date,due_in_date,invoice_currency,document_type,posting_id,total_open_amount,baseline_create_date,cust_payment_terms,invoice_id) values (?, ?, ?, ?, ?,?, ?, ?, ?, ?,?, ?, ?, ?, ?)";
			System.out.println("going for insert data");
			PreparedStatement rs = con.prepareStatement(query);
			System.out.println("going for insert data");
			rs.setString(1, businessCode);
			rs.setInt(2, customerNumber);
			rs.setString(3, clearDate);
			rs.setInt(4, businessYear);
			rs.setString(5, docId);
			rs.setString(6, postingDate);
			rs.setString(7, documentCreateDate);
			rs.setString(8, dueInDate);
			rs.setString(9, inVoiceCurrency);
			rs.setString(10, documentType);
			rs.setInt(11, postingId);
			rs.setDouble(12, totalOpenAmount);
			rs.setString(13, baseLineCreateDate);
			rs.setString(14, custPaymentTerms);
			rs.setInt(15, invoiceId);
			System.out.println("going for insert data");

			rs.executeUpdate();
			System.out.println("data inserted");
			con.close();

			response.getWriter().print("success");
		} catch (Exception e) {
			e.printStackTrace();
			response.getWriter().print("error");
		}
	}

}
