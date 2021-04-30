
public class CourseManager {
	
	public void addCourse (Course course) {
		System.out.println(course.getName()+" isimli kurs eklenmiştir.");
		
	}
	
	public void addCourseInstructor(Course course,Instructor instructor) {
		System.out.println(course.getName()+" Kursuna "+instructor.getCertificates()+" sertifikalarına sahip "
	+instructor.getUser().getFistName()+" "+instructor.getUser().getLastName()+" eklenmiştir.");
		
	}

}
