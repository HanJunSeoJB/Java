package array;

public class StudentTest {
	public static void main(String[] args) {
	
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("Korea", 100);
		studentLee.addSubject("Math", 50);
		
		Student studentHan = new Student(1002, "Han");
		studentHan.addSubject("Korea", 100);
		studentHan.addSubject("Math", 100);
		
		Student studentJung = new Student(1003, "Jung");
		studentJung.addSubject("Korea", 70);
		studentJung.addSubject("Math", 90);
		
		studentLee.showStudentInfo();
		studentHan.showStudentInfo();
		studentJung.showStudentInfo();
		
		
	}
}
