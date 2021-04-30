
public class InstructorManager {
	
	public void addInstructor(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"Sisteme ho�geldiniz");
		
	}
	
	
	public void addCourse(Instructor instructor) {
		
		System.out.println(instructor.getCourseName()+"Kurs se�ildi.");
			
		}
		
	public void addMultipleCourse(Instructor[] instructors) {
		
		for (Instructor instructor : instructors) {
			
			addCourse(instructor);
		}
	}

	public void numberOfStudent(Instructor instructor) {
		System.out.println("��renci say�n�z : "+instructor.getNumberOfStdudents());
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

