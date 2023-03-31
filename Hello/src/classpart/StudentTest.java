package classpart;

public class StudentTest {
	public static void main(String[] args) {
		Student studentHan = new Student();
		studentHan.studentName = "HanJunSeo";
		studentHan.address = "Iksan";
		
		studentHan.showStudentInfo();
		System.out.println(studentHan);
	}
}
