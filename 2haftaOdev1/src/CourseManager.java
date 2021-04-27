
public class CourseManager {
	
	public void addCourse(Course course) {
		if (course.getInstructor()!=null) {
			System.out.println("Kurs eklendi. "+course.courseName);
		}else {
			System.out.println("Eğitmen Olmadan kurs eklenemez.");
		}
		
	}
	public void updateCourse(Course course) {
		System.out.println("Kurs güncellendi. "+course.courseName);
	}
	public void deleteCourse(Course course) {
		System.out.println("Kurs silindi. "+course.courseName);
		course.setCourceStatus(true);
	}

}
