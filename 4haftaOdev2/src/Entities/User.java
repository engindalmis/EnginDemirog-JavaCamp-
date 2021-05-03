package Entities;

public class User {
	private int id;
	
	private Company company;
	private Customer customer;
	private String userName;
	private String password;
	
	
	
	public User() {
		super();
	}



	public User(int id, Company company, Customer customer, String userName, String password) {
		super();
		this.id = id;
		this.company = company;
		this.customer = customer;
		this.userName = userName;
		this.password = password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Company getCompany() {
		return company;
	}



	public void setCompany(Company company) {
		this.company = company;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
