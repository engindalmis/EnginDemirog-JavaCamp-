package Entities;

public class Company extends User{

	private int id;
	private String companyName;
	private String taxNumber;
	public Company() {
		super();
	}
	public Company(int id, String companyName, String taxNumber) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
	
}
