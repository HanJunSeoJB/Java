package object;

class Student {
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentId + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)	return true;
			else	return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2)	System.out.println("주소 같음");
		else	System.out.println("주소 다름");
		
		if(studentLee.equals(studentLee2))	System.out.println("동일함");
		else	System.out.println("동일하지 않음");
		
		if(studentLee == studentSang)	System.out.println("주소 같음");	
		else	System.out.println("주소 다름");
		
		if(studentLee.equals(studentSang))	System.out.println("동일함");
		else	System.out.println("동일하지않음");
		
		System.out.println("studentLee의 hashcode: " + studentLee.hashCode());
		System.out.println("studentSang의 hashcode: " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값: " + System.identityHashCode(studentSang));

	}

}
