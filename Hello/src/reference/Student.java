package reference;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student() {
		korea = new Subject("Korea");
		math = new Subject("Math");
	}
	
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korea = new Subject("Korea");
		math = new Subject("Math");
	}
	
	public void setKorea(int grade) {
		korea.setGrade(grade);
	}
	
	public void setMath(int grade) {
		math.setGrade(grade);
	}
	
	public void showStudentInfo() {
		int total = korea.getGrade() + math.getGrade();
		System.out.println(studentName + "의 총점은 " + total + "입니다.");
	}
}
