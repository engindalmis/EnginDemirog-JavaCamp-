
public class Instructor {
	Integer id;
	//Eğitmen Adı
	String instructorFirstName;
	//Eğitmen Soyadı
	String instructorLastName;
	//Eğitmen Detayı
	String instructorDetail;
	//Bu Eğitmen Silinmiş mi?
	Boolean instructorStatus=Boolean.FALSE;
	//Sahip olduğu Sertifikalar
	String instructorCertificates;
	
	//**************Constructor****************
	public Instructor() {
		super();
	}


	//instructorStatus hariç constructor
	public Instructor(Integer id, String instructorFirstName, String instructorLastName, String instructorDetail,
			String instructorCertificates) {
		super();
		this.id = id;
		this.instructorFirstName = instructorFirstName;
		this.instructorLastName = instructorLastName;
		this.instructorDetail = instructorDetail;
		this.instructorCertificates = instructorCertificates;
	}



	//*************Getter And Setter*************



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getInstructorFirstName() {
		return instructorFirstName;
	}



	public void setInstructorFirstName(String instructorFirstName) {
		this.instructorFirstName = instructorFirstName;
	}



	public String getInstructorLastName() {
		return instructorLastName;
	}



	public void setInstructorLastName(String instructorLastName) {
		this.instructorLastName = instructorLastName;
	}



	public String getInstructorDetail() {
		return instructorDetail;
	}



	public void setInstructorDetail(String instructorDetail) {
		this.instructorDetail = instructorDetail;
	}



	public Boolean getInstructorStatus() {
		return instructorStatus;
	}



	public void setInstructorStatus(Boolean instructorStatus) {
		this.instructorStatus = instructorStatus;
	}



	public String getInstructorCertificates() {
		return instructorCertificates;
	}



	public void setInstructorCertificates(String instructorCertificates) {
		this.instructorCertificates = instructorCertificates;
	}




}
