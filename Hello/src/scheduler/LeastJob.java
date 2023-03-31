package scheduler;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Get the call from the queue in order");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Assign to a counselor who does not currently have a call job or has the least waiting time to wait ");
		
	}

}
