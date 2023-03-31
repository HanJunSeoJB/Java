package scheduler;

public class AgentGetCall implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("Counseler request next call");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("Counseler got the telephon consaltation");
		
	}

}
