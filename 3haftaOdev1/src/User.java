
public class User {
	
	private int id;
	private String fistName;
	private String lastName;
	private String adress;
	private String userName;
	private String password;
	
	public User() {
		super();
	}
	
	
	public User(int id) {
		super();
		this.id = id;
	}


	public User(int id, String fistName, String lastName, String adress, String userName, String password) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
		this.adress = adress;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
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
