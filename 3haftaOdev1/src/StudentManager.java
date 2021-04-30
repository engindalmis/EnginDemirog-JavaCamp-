
public class StudentManager {
	
	public void addStudentCourse (Student student) {
		System.out.println(student.getCourses().getName()+" kursuna "+student.getUser().getFistName()+" isimli kullanıcı kayıt edilmiştir.");
	}
	public void addStudent (Student student) {
		System.out.println(student.getUser().getFistName()+ " adlı kullanıcı sisteme eklenmiştir.");
	}
	
	
}
