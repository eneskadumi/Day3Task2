
public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"Sisteme hoþgeldiniz");
		
	}
	
	
	public void addCourse(Instructor instructor) {
		
		System.out.println(instructor.getCourseName()+"Kurs seçildi.");
			
		}
		
	public void addMultipleCourse(Instructor[] instructors) {
		
		for (Instructor instructor : instructors) {
			
			addCourse(instructor);
		}
	}

	public void numberOfStudent(Instructor instructor) {
		System.out.println("Öðrenci sayýnýz : "+instructor.getNumberOfStdudents());
	}
	
	
	public void showInstructor(Instructor[] instructors) {
 
		for (Instructor instructor : instructors) {

			    System.out.println("Isim : " + instructor.getFirstName());
		        System.out.println("Soyad: " + instructor.getLastName());
		        System.out.println("Email: " + instructor.getEmail());
	            System.out.println("--------------");	
		}
   }
}

