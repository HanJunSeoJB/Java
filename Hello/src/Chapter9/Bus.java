package Chapter9;

public class Bus extends Car {

	@Override
	public void run() {
		System.out.println("The bus runs");
		
	}

	@Override
	public void refuel() {
		System.out.println("Refueling natural gas");
		
	}
	
	public void takePassenger() {
		System.out.println("The bus pick up passengers");
	}

}
