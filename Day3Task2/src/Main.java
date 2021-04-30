
public class Main {

	public static void main(String[] args) {
		
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Enes");
		student1.setLastName("Kadumi");
		student1.setEmail("enes@gmail.com");
		student1.setPassword("enes12345");
		student1.setCourseName("Java");
	
		

		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("Ali");
		student2.setLastName("Konar");
		student2.setEmail("ali@gmail.com");
		student2.setPassword("ali12345");
		student2.setCourseName("C#");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(3);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("engin@gmail.com");
		instructor1.setPassword("engin12345");
		instructor1.setCourseName("Java");
		
		

		Instructor instructor2 = new Instructor();
		instructor2.setId(4);
		instructor2.setFirstName("Arda");
		instructor2.setLastName("Yıldırım");
		instructor2.setEmail("arda@gmail.com");
		instructor2.setPassword("arda12345");
		instructor2.setCourseName("C#");
		
		
		Student[] students = {student1, student2};
		
		StudentManager studentManager = new StudentManager();
		studentManager.addStudent(student1);
		studentManager.register(student1);
		studentManager.deleteStudent(student2);
		studentManager.showStudent(students);
		
		
		
		Instructor[] instructors = {instructor1, instructor2};
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addInstructor(instructor1);
		instructorManager.addCourse(instructor1);
		instructorManager.numberOfStudent(instructor2);
		instructorManager.showInstructor(instructors);
		
	
	
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.delete(student1);
		
	}
}
