package cooperation;
public class TakeTrains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student james = new Student("James", 5000);
		Student Tomas = new Student("Tomas", 5000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		Tomas.takeSubway(subwayGreen);
		Tomas.showInfo();
		subwayGreen.showInfo();
	}

}
