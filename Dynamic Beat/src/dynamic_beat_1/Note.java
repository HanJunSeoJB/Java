package dynamic_beat_1;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	
	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../IMAGES/note_basic.png")).getImage();
	private int x, y = 760 - (1000 / Main.SLEEP_TIME * Main.NOTE_SPEED) * Main.REACH_TIME;
	private String noteType;
	private boolean proceeded = true;
	
	public String getnoteType() {
		return noteType;
	}
	
	public boolean isProceeded() {
		return proceeded;
	}
	
	public void close() {
		proceeded = false;
	}
	
	public Note(String noteType) {
		if (noteType.equals("S")) {
			x = 472 + Game.adjust;
		}
		else if(noteType.equals("D")){
			x = 819 + Game.adjust;
		}
		else if(noteType.equals("W")){
			x = 240 + Game.adjust;
		}
		else if(noteType.equals("A")){
			x = 356 + Game.adjust;
		}
		else if(noteType.equals("Space")){
			x = 588 + Game.adjust;
		}
		else if(noteType.equals("E")){
			x = 935 + Game.adjust;
		}
		else if(noteType.equals("R")){
			x = 1051 + Game.adjust;
		}
		this.noteType = noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(!noteType.equals("Space")) {
			g.drawImage(noteBasicImage, x, y, null); 
		}
		else {
			g.drawImage(noteBasicImage, x, y, null); 
			g.drawImage(noteBasicImage, x + 112, y, null); 
		}
	}
	@Override
	public void run() {
		try {
			while (true) {
				drop();
				if(proceeded) {
					Thread.sleep(Main.SLEEP_TIME);
				}
				else {
					interrupt();
					break;
				}
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
	}
	
	public void drop() {
		y += Main.NOTE_SPEED;
		if(y >= 800) {
			System.out.println("Miss");
			close();
		}
	}
	
	public String judge() {
		if(y >= 770) {
			System.out.println("Late");
			close();
			return "Late";
		}
		else if(y >= 764) {
			System.out.println("Good");
			close();
			return "Good";
		}
		else if(y >= 758) {
			System.out.println("Perfect");
			close();
			return "Perfect";
		}
		else if(y >= 749) {
			System.out.println("Good");
			close();
			return "Good";
		}
		else if(y >= 743) {
			System.out.println("Early");
			close();
			return "Early";
		}
		return "None";
	}
	public int getY() {
		return y;
	}
}
