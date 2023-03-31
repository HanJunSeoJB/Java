package student;


public class Student {
	String studentId;
	String studentName;
	
	public Student(String studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(this.studentId == student.studentId)	return true;
			else	return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(studentId);
	}
	
	@Override
	public String toString() {
		return studentId + ":" + studentName;
	}
}
