package array;
import java.util.ArrayList;

public class Student {
	private int studentID;
	private String studentName;
	ArrayList<Subject> subjectList;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		for(Subject s: subjectList) {
			total += s.getScorePoint();
			System.out.println(studentName + "님의 " + s.getName() + "성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println(studentName + "님의 총점은 " + total + "입니다");
	}
}
