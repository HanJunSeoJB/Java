package student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] student = new Student[3];
		
		student[0] = new Student(1001, "Tomas");
		student[1] = new Student(1002, "James");
		student[2] = new Student(1003, "Edward");
		
		for(int i = 0; i < student.length; i++) {
			student[i].ShowStudentInfo();
		}
	}

}
