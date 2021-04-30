
public class Instructor extends User{
	private int id;
	private String certificates;
	private User user;
	
	
	
	public Instructor() {
		super();
	}
	public Instructor(int id, String certificates ) {
		super();
		this.id = id;
		this.certificates = certificates;
		
	}
	
	
	
	public Instructor(int id, String certificates, User user) {
		super();
		this.id = id;
		this.certificates = certificates;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCertificates() {
		return certificates;
	}
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	

}
