
public class Main {

	public static void main(String[] args) {
		
		Course course=new Course(1, "Java ");
		User user=new User(1, "Engin", "Dalmış", "Alsancak Mah.", "engin.dalmis", "54137");
		Instructor  instructor=new Instructor(1,"MTL",user);
		Student student=new Student(1, user, course);
		
		UserManager userManager =new UserManager();
		userManager.addUser(user);
		userManager.deleteUser(user);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addInstructor(instructor,user) ;
		
		
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(course);
		courseManager.addCourseInstructor(course, instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.addStudent(student);
		studentManager.addStudentCourse(student);
		
		
		
		

	}
	

}
