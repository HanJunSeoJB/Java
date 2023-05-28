package dynamic_beat_1;

import java.awt.Color;
import java.time.Instant;
import javax.sound.midi.*;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread {
	public static int adjust = 50;
	private int index = 0;
	
	private Image gameInfo = new ImageIcon(Main.class.getResource("../IMAGES/game_info.png")).getImage();
	private Image JudgementLine = new ImageIcon(Main.class.getResource("../IMAGES/judgementLine.png")).getImage();
	private Image noteRoute = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteLine = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteLine.png")).getImage();
	private Image noteRouteWHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteAHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteSHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteDHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteSpace1Hit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteSpace2Hit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteEHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image noteRouteRHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	private Image blueFlaireImage = new ImageIcon(Main.class.getResource("../IMAGES/blue_flair.png")).getImage();
	private Image earlyImage = new ImageIcon(Main.class.getResource("../IMAGES/early.png")).getImage();
	private Image goodImage = new ImageIcon(Main.class.getResource("../IMAGES/good.png")).getImage();
	private Image perfectImage = new ImageIcon(Main.class.getResource("../IMAGES/perfect.png")).getImage();
	private Image lateImage = new ImageIcon(Main.class.getResource("../IMAGES/Late.png")).getImage();
	private Image MissImage = new ImageIcon(Main.class.getResource("../IMAGES/Miss.png")).getImage();
	private Image judgeImage;
	
	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;
	private boolean gameMarker = false;
	
	ArrayList<Note> noteList = new ArrayList<>();
	
	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
		
	}
	
	public void screenDraw(Graphics2D g) {
		g.drawImage(noteRouteWHit, 240 + adjust, 30, null);
		g.drawImage(noteRouteAHit, 356 + adjust, 30, null);
		g.drawImage(noteRouteSHit, 472 + adjust, 30, null);
		g.drawImage(noteRouteSpace1Hit, 588 + adjust, 30, null);
		g.drawImage(noteRouteSpace2Hit, 703 + adjust, 30, null);
		g.drawImage(noteRouteDHit, 819 + adjust, 30, null);
		g.drawImage(noteRouteEHit, 935 + adjust, 30, null);
		g.drawImage(noteRouteRHit, 1051 + adjust, 30, null);
		
		g.drawImage(noteRoute, 240 + adjust, 30, null);
		g.drawImage(noteRoute, 356 + adjust, 30, null);
		g.drawImage(noteRoute, 472 + adjust, 30, null);
		g.drawImage(noteRoute, 588 + adjust, 30, null);
		g.drawImage(noteRoute, 703 + adjust, 30, null);
		g.drawImage(noteRoute, 819 + adjust, 30, null);
		g.drawImage(noteRoute, 935 + adjust, 30, null);
		g.drawImage(noteRoute, 1051 + adjust, 30, null);
		g.drawImage(gameInfo, 0, 840, null);
		g.drawImage(JudgementLine, 0, 760, null);
		g.drawImage(judgeImage, 500, 500, null);
		
		for(int i = 0; i < noteList.size(); i++) {
			Note note = noteList.get(i);
			if(note.getY() > 800) {
				judgeImage = new ImageIcon(Main.class.getResource("../IMAGES/Miss.png")).getImage();
			}
			if(!note.isProceeded()) {
				noteList.remove(i);
				i--;
			}
			else {
				note.screenDraw(g);
			}
		}
		
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString(titleName, 20, 880);
		g.drawString(difficulty, 1190, 880);
		g.setFont(new Font("Elephant", Font.BOLD, 30));
		g.drawString("000000", 565, 880);
		g.drawString("W", 240 + adjust + 40, 790);
		g.drawString("A", 356 + adjust + 40, 790);
		g.drawString("S", 472 + adjust + 40, 790);
		g.drawString("Space bar", 600 + adjust, 790);
		g.drawString("D", 819 + adjust + 40, 790);
		g.drawString("E", 935 + adjust + 40, 790);
		g.drawString("R", 1051 + adjust + 40, 790);
		g.setFont(new Font("Arial", Font.BOLD, 30));
		
	}
	
	public void pressS() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "S");
		judge("S");
		noteRouteSHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseS() {
		noteRouteSHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	public void pressW() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "W");
		judge("W");
		noteRouteWHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseW() {
		noteRouteWHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	public void pressA() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "A");
		judge("A");
		noteRouteAHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseA() {
		noteRouteAHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	public void pressD() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "D");
		judge("D");
		noteRouteDHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseD() {
		noteRouteDHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	public void pressSpace() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "Space");
		judge("Space");
		noteRouteSpace1Hit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		noteRouteSpace2Hit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseSpace() {
		noteRouteSpace1Hit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
		noteRouteSpace2Hit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	public void pressE() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "E");
		judge("E");
		noteRouteEHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseE() {
		noteRouteEHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	public void pressR() {
		if (gameMarker == true)
			System.out.println(gameMusic.getTime() + "R");
		judge("R");
		noteRouteRHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRouteHit.png")).getImage();
		new Music("drum1.mp3", false).start();
	}
	public void realeaseR() {
		noteRouteRHit = new ImageIcon(Main.class.getResource("../IMAGES/noteRoute.png")).getImage();
	}
	
	@Override
	public void run() {
		try {
		dropNotes();
		}catch(Exception e) {
			System.out.print(e);
		}
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	
	public void dropNotes() throws Exception{
		Beat[] beats = null;
		int j = 0;
		int[] time=new int[500];
		String[] noteType=new String[500];
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\Dynamic Beat\\src\\dynamic_beat_1/note.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			  String[] parts = line.split(" ");
			  time[j] = Integer.parseInt(parts[0]);
			  noteType[j] = parts[1];
			  j++;
			  index++;
			}
		 br.close(); 
		 int gap=(660/Main.NOTE_SPEED)*Main.SLEEP_TIME;
		 beats = new Beat[index];
		 for(int k=0;k<index;k++) {
		     beats[k]=new Beat(time[k]-gap,noteType[k]);
		    } 
			br.close();
		
		int i = 0;
		gameMusic.start();
		while(i < beats.length && !interrupted()) {
			boolean dropped = false;
			if(beats[i].getTime() <= gameMusic.getTime()) {
				Note note = new Note(beats[i].getNoteName());
				note.start();
				noteList.add(note);
				i++;
				dropped = true;
			}
			if (!dropped) {
				try {
					Thread.sleep(5);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void judge(String input) {
		for(int i = 0; i < noteList.size(); i++) {
			Note note = noteList.get(i);
			if(input.equals(note.getnoteType())) {
				judgeEvent(note.judge());
				break;
			}
		}
	}
	
	public void judgeEvent(String judge) {
		if(judge.equals("Early")) {
			judgeImage = new ImageIcon(Main.class.getResource("../IMAGES/Early.png")).getImage();
		}
		else if(judge.equals("Late")) {
			judgeImage = new ImageIcon(Main.class.getResource("../IMAGES/Late.png")).getImage();
		}
		else if(judge.equals("Good")) {
			judgeImage = new ImageIcon(Main.class.getResource("../IMAGES/Good.png")).getImage();
		}
		else if(judge.equals("Perfect")) {
			judgeImage = new ImageIcon(Main.class.getResource("../IMAGES/Perfect.png")).getImage();
		}
	}
}
