
public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		System.out.println("Eğitmen eklendi. "+instructor.instructorFirstName+" "+instructor.instructorLastName);
	}
	public void updateInstructor(Instructor instructor) {
		System.out.println("Eğitmen güncellendi. "+instructor.instructorFirstName+" "+instructor.instructorLastName);
	}
	public void deleteInstructor(Instructor instructor) {
		System.out.println("Eğitmen silindi. "+instructor.instructorFirstName+" "+instructor.instructorLastName);
		instructor.setInstructorStatus(true);
	}

}
