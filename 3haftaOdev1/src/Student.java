
public class Student extends User{
	
	private int id;
	private User user;
	private Course courses;
	
	public Student() {
		super();
	}
	public Student(int id, Course courses) {
		super();
		this.id = id;
		this.courses = courses;
	}
	
	
	
	public Student(int id, User user, Course courses) {
		super();
		this.id = id;
		this.user = user;
		this.courses = courses;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Course getCourses() {
		return courses;
	}
	public void setCourses(Course courses) {
		this.courses = courses;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
