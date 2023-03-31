package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Bring the call of a customer with a high rating first");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign priority to counselors with high task skill values");
		
	}

}
