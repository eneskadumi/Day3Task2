
public class StudentManager {
	
	
	
	
	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+"Kayıt oldunuz dersleri dinlemeye başlayabilirsiniz...");	
	}


	
	
	public void deleteStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+"Kayıdınız silindi...");	
	}
	

	
	
	public void register(Student student) {	
		System.out.println("Hoş geldin "+student.getFirstName()+" "+student.getCourseName()+" Dersini dinleyebilirsiniz.");
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
