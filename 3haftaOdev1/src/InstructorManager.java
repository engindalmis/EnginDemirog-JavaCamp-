
public class InstructorManager {
	public void addInstructor(Instructor instructor, User user ) {
		System.out.println(instructor.getCertificates()+" sertifikalarına sahip "+user.getFistName()+" isimli eğitmen eklenmiştir.");
	}
	public void deleteInstructor(Instructor instructor) {
		System.out.println(instructor.getCertificates()+" sertifikalarına sahip "+instructor.getFistName()+" isimli eğitmen silinmiştir.");
	}

}
