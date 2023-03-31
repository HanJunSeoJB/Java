package test1;

public abstract class PlayerLevel {
	private int level;
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	public abstract void showLevelMesssage();
	
	final public void go(int count) {
		run();
		
		for(int i =0; i < count; i++) {
			jump();
		}
		turn();
	}
}
