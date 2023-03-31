package scheduler;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Get the call from the queue in order");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign it to the next counselor");
		
	}
	
}
