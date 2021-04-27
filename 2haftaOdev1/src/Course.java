
public class Course {
	
	Integer id;
	//Kurs Adı
	String courseName;
	//Kurs Açıklaması
	String courseDetail;
	//Bu Kurs Silinmiş mi?
	Boolean courceStatus=Boolean.FALSE;
	//Kursun Tamamlanma Yüzdesi
	Float courcePercentageOfComplation; 
	//Kursa ait eğitmen
	Instructor instructor;

	
	//**************Constructor****************
	
	public Course() {
		super();
	}

	//courceStatus hariç constructor
	public Course(Integer id, String courseName, String courseDetail, Float courcePercentageOfComplation,
			Instructor instructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseDetail = courseDetail;
		this.courcePercentageOfComplation = courcePercentageOfComplation;
		this.instructor = instructor;
	}

	//*************Getter And Setter*************
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDetail() {
		return courseDetail;
	}

	public void setCourseDetail(String courseDetail) {
		this.courseDetail = courseDetail;
	}

	public Boolean getCourceStatus() {
		return courceStatus;
	}

	public void setCourceStatus(Boolean courceStatus) {
		this.courceStatus = courceStatus;
	}

	public Float getCourcePercentageOfComplation() {
		return courcePercentageOfComplation;
	}

	public void setCourcePercentageOfComplation(Float courcePercentageOfComplation) {
		this.courcePercentageOfComplation = courcePercentageOfComplation;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
	
	
}
