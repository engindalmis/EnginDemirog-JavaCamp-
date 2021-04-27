
public class Main {

	public static void main(String[] args) {
		//Kodlama.io sitesine gidiniz.
		//Özellik nesnesi olarak tanımladığımızı düşündüğünüz iki örnek veriniz.
		/*
		 * 1)Kurs Ekleme
		 * 2)Eğitmen Listeleme
		 */
		//Bunlara ait class, contructor yapılarını oluşturup diziye ekleyip listeleyiniz.
		Instructor ins1 =new Instructor(1,"Engin","Demiroğ","Java ve C# Uzmanı","MCT,PMP,ITIL");
		InstructorManager insmanager=new InstructorManager();
		insmanager.addInstructor(ins1);
		insmanager.updateInstructor(ins1);
		insmanager.deleteInstructor(ins1);
		Course cource1=new Course(1,"Java Kursu","Java Kursu Detayı",25.0f,ins1);
		CourseManager courseManager=new CourseManager();
		courseManager.addCourse(cource1);
		courseManager.updateCourse(cource1);
		courseManager.deleteCourse(cource1);
		

	}

}
