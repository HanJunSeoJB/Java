package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("Select the telephone consultation allocation method");
		System.out.println("R: Assign one by one");
		System.out.println("L: Assign to a counselor who is resting or has the least waiting time");
		System.out.println("P: Assign high-priority customers first");
		
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') scheduler = new RoundRobin();
		else if(ch == 'L' || ch == 'l') scheduler = new LeastJob();
		else if(ch == 'P' || ch =='p')	scheduler = new PriorityAllocation();
		else if(ch == 'A' || ch =='a')	scheduler = new AgentGetCall();
		else {
			System.out.println("Not support function");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
