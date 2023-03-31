package reference;

public class Subject {
	String subjectName;
	int grade;
	
	public Subject() {}
	
	public Subject(String subject) {
		subjectName = subject;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
}
