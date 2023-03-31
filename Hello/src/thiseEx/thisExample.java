package thiseEx;


class Birthday {
	int day;
	int year;
	int month;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}

 
public class thisExample {
	
	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		System.out.println(b2);
		b2.printThis();
		
	}
}
