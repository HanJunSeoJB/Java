package object;

class MyDate {
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate dat = (MyDate)obj;
			if(dat.day == this.day && dat.month == this.month && dat.year == this.year)	return true;
			else return false;
		}
		return false;
	}
}

public class MydateTest {

	public static void main(String[] args) {
		MyDate date1 = new  MyDate(9, 18, 2004);
		MyDate date2 = new MyDate(9, 18, 2004);
		System.out.println(date1.equals(date2));

	}

}
