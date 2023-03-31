package array;

import java.util.ArrayList;

public class StudentArray {

	public static void main(String[] args) {
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1001, "James"));
		studentList.add(new Student(1002, "Tomas"));
		studentList.add(new Student(1003, "Edward"));
		
		for(Student student: studentList) {
			student.showStudentInfo();
		}
	}
}
