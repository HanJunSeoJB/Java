package student;

public class Student {

	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public void ShowStudentInfo() {
		System.out.println(studentId + "," + studentName);
	}
	
}
