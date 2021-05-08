package commerce.entities.concretes;

import commerce.entities.abstracts.Entity;

//Kullanıcı Bilgilerinin Tutulduğu Entity
public class User implements Entity {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	//Constructorda bu alan olmayacak 
	private Boolean status;
	private String verificationNumber;
	private String authenticationId;
	
	//*********Constructor**************
	public User() {
		super();
	}
	







	public User(int id, String firstName, String lastName, String email, String password,
			String verificationNumber, String authenticationId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.verificationNumber = verificationNumber;
		this.authenticationId = authenticationId;
	}








	//********Getters and Setters*********
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}





	public String getVerificationNumber() {
		return verificationNumber;
	}





	public void setVerificationNumber(String verificationNumber) {
		this.verificationNumber = verificationNumber;
	}








	public String getAuthenticationId() {
		return authenticationId;
	}








	public void setAuthenticationId(String authenticationId) {
		this.authenticationId = authenticationId;
	}
	
	
	

}
