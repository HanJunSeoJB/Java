package Chapter9;

public class AutoCar extends Car{

	@Override
	public void run() {
		System.out.println("The autoCar runs");
		
	}

	@Override
	public void refuel() {
		System.out.println("Refueling gas");
		
	}
	
	public void load() {
		System.out.println("짐을 싣습니다");
	}

}
