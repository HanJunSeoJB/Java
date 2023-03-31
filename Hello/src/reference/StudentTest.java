package reference;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentHan = new Student(100, "한준서");
		studentHan.setKorea(100);
		studentHan.setMath(100);
		studentHan.showStudentInfo();
	}
}
