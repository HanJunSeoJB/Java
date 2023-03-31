package test1;

public class Player {

	PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showLevelMesssage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMesssage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
