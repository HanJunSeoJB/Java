package dynamic_beat_1;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread{
	
	private Image noteBasicImage = new ImageIcon(Main.class.getResource("../IMAGES/note_basic.png")).getImage();
	private int x, y = 760 - (1000 / Main.SLEEP_TIME * Main.NOTE_SPEED) * Main.REACH_TIME;
	private String noteType;
	
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
				Thread.sleep(Main.SLEEP_TIME);
			}
		} catch (Exception e){
			System.err.println(e.getMessage());
		}
	}
	
	public void drop() {
		y += Main.NOTE_SPEED;
	}
}
