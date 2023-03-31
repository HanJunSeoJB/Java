package Chapter9;

public abstract class Car {
	public abstract void run();
	public abstract void refuel();
	public void stop() {
		System.out.println("Car was Stopping");
	}
}
