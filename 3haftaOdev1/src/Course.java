
public class Course extends Instructor {
	private int id;
	private String name;
	private Instructor instructor;
	private Student studens [];
	
	public Course() {
		super();
	}
	
	
	
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Course(int id, String name, Instructor instructor) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
	}



	public Course(int id, String name, Instructor instructor, Student[] studens) {
		super();
		this.id = id;
		this.name = name;
		this.instructor = instructor;
		this.studens = studens;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public Student[] getStudens() {
		return studens;
	}
	public void setStudens(Student[] studens) {
		this.studens = studens;
	}
	
	
	

}
