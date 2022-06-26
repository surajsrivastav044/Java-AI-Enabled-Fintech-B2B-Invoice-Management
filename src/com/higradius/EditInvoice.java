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

@WebServlet("/EditInvoice")
public class EditInvoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EditInvoice() {
        super();
        
    }
    
	  protected void doPost(HttpServletRequest request, HttpServletResponse
	  response) throws ServletException, IOException {
			doGet(request, response);
	  }
	 
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
				String slNo = request.getParameter("siNo");
				int sl_No = Integer.parseInt(slNo);
				String invoiceCurrency = request.getParameter("inVoiceCurrency");
				String cutomerPaymentTerms = request.getParameter("custPaymentTerms");		
			
			Connection con = DBConnection.createConnect();
			String query = "UPDATE winter_internship SET invoice_currency = ?, cust_payment_terms = ? WHERE sl_no = ?";
			
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, invoiceCurrency);
			st.setString(2, cutomerPaymentTerms);
			st.setInt(3,sl_No);
			
			response.getWriter().println("success");
			st.executeUpdate();
			con.close();
		}	
		catch(Exception e) {
			e.printStackTrace();
			response.getWriter().println("error");
		}
	}
}


