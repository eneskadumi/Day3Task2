
public class StudentManager {
	
	
	
	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+"Kay�t oldunuz dersleri dinlemeye ba�layabilirsiniz...");	
	}


	
	
	public void deleteStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+"Kay�d�n�z silindi...");	
	}
	

	
	
	public void register(Student student) {	
		System.out.println("Ho� geldin "+student.getFirstName()+" "+student.getCourseName()+" Dersini dinleyebilirsiniz.");
	}

	
	
	public void showStudent(Student[] students) {
		
		for (Student student : students) {
			
			
			    System.out.println("Isim : " + student.getFirstName());
		        System.out.println("Soyad: " + student.getLastName());
		        System.out.println("Email: " + student.getEmail());
		        System.out.println("-----------");
		}
		
   }
}
