package cooperation;

public class Student {

	String studentName;
	int grade;
	int money;
	
	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway sub) {
		sub.take(800);
		money -= 800;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다");
	}
	
}
