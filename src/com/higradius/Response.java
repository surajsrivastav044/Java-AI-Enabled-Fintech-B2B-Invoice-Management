package com.higradius;
import java.sql.ResultSet;
import java.util.Date;

public class Response {
	private int siNo;
	private String businessCode;
	private int customerNumber;
	private String clearDate;
	private int businessYear;
	private String docId;
	private String postingDate;
	private String documentCreateDate;
	private String dueInDate;
	private String inVoiceCurrency;
	private String documentType;
	private int postingId;
	private double totalOpenAmount;
	private String baseLineCreateDate;
	private String custPaymentTerms;
	private int invoiceId;

	public Response() {
		super();
	}
	public Response(String businessCode,int customerNumber,String clearDate,int businessYear,String docId,String postingDate,String documentCreateDate,String dueInDate,
			String inVoiceCurrency,String documentType,int postingId,double totalOpenAmount,String baseLineCreateDate,String custPaymentTerms,int invoiceId) {
		this.businessCode=businessCode;
		this.customerNumber=customerNumber;
		this.clearDate=clearDate;
		this.businessYear=businessYear;
		this.docId=docId;
		this.postingDate=postingDate;
		this.documentCreateDate=documentCreateDate;
		this.dueInDate=dueInDate;
		this.inVoiceCurrency=inVoiceCurrency;
		this.documentType=documentType;
		this.postingId=postingId;
		this.totalOpenAmount=totalOpenAmount;
		this.baseLineCreateDate=baseLineCreateDate;
		this.custPaymentTerms=custPaymentTerms;
		this.invoiceId=invoiceId;
	}
	
	public Response(ResultSet rs) {

		try {
			 siNo=rs.getInt("sl_no");
			 businessCode=rs.getString("business_code");
			 customerNumber=rs.getInt("cust_number");
			 clearDate=rs.getString("clear_date");
			 businessYear=rs.getInt("buisness_year");
			 docId=rs.getString("doc_id");
			 postingDate=rs.getString("posting_date");
			 documentCreateDate=rs.getString("document_create_date");
			 dueInDate=rs.getString("due_in_date");
			 inVoiceCurrency=rs.getString("invoice_currency");
			 documentType=rs.getString("document_type");
			 postingId=rs.getInt("posting_id");
			 totalOpenAmount=rs.getDouble("total_open_amount");
			 baseLineCreateDate=rs.getString("baseline_create_date");
			 custPaymentTerms=rs.getString("cust_payment_terms");
			 invoiceId=rs.getInt("invoice_id");	 
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	
	public int getSiNo() {
		return siNo;
	}
	public void setSiNo(int siNo) {
		this.siNo = siNo;
	}
	public String getBusinessCode() {
		return businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getClearDate() {
		return clearDate;
	}
	public void setClearDate(String clearDate) {
		this.clearDate = clearDate;
	}
	public int getBusinessYear() {
		return businessYear;
	}
	public void setBusinessYear(int businessYear) {
		this.businessYear = businessYear;
	}
	public String getDocId() {
		return docId;
	}
	public void setDocId(String docId) {
		this.docId = docId;
	}
	public String getPostingDate() {
		return postingDate;
	}
	public void setPostingDate(String postingDate) {
		this.postingDate = postingDate;
	}
	public String getDocumentCreateDate() {
		return documentCreateDate;
	}
	public void setDocumentCreateDate(String documentCreateDate) {
		this.documentCreateDate = documentCreateDate;
	}
	public String getDueInDate() {
		return dueInDate;
	}
	public void setDueInDate(String dueInDate) {
		this.dueInDate = dueInDate;
	}
	public String getInVoiceCurrency() {
		return inVoiceCurrency;
	}
	public void setInVoiceCurrency(String inVoiceCurrency) {
		this.inVoiceCurrency = inVoiceCurrency;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public int getPostingId() {
		return postingId;
	}
	public void setPostingId(int postingId) {
		this.postingId = postingId;
	}
	public double getTotalOpenAmount() {
		return totalOpenAmount;
	}
	public void setTotalOpenAmount(double totalOpenAmount) {
		this.totalOpenAmount = totalOpenAmount;
	}
	public String getBaseLineCreateDate() {
		return baseLineCreateDate;
	}
	public void setBaseLineCreateDate(String baseLineCreateDate) {
		this.baseLineCreateDate = baseLineCreateDate;
	}
	public String getCustPaymentTerms() {
		return custPaymentTerms;
	}
	public void setCustPaymentTerms(String custPaymentTerms) {
		this.custPaymentTerms = custPaymentTerms;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	@Override
	public String toString() {
		return "Response [siNo=" + siNo + ", businessCode=" + businessCode + ", customerNumber=" + customerNumber
				+ ", clearDate=" + clearDate + ", businessYear=" + businessYear + ", docId=" + docId + ", postingDate="
				+ postingDate + ", documentCreateDate=" + documentCreateDate + ", dueInDate=" + dueInDate
				+ ", inVoiceCurrency=" + inVoiceCurrency + ", documentType=" + documentType + ", postingId=" + postingId
				+ ", totalOpenAmount=" + totalOpenAmount + ", baseLineCreateDate=" + baseLineCreateDate
				+ ", custPaymentTerms=" + custPaymentTerms + ", invoiceId=" + invoiceId + "]";
	}

}
