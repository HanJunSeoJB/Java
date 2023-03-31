package dynamic_beat_1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListner extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(DynamicBeat.game == null) {
			return;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			DynamicBeat.game.pressW();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.pressD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			DynamicBeat.game.pressA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.pressSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			DynamicBeat.game.pressE();
		}
		else if(e.getKeyCode() == KeyEvent.VK_R) {
			DynamicBeat.game.pressR();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(DynamicBeat.game == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			DynamicBeat.game.realeaseW();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			DynamicBeat.game.realeaseD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			DynamicBeat.game.realeaseA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			DynamicBeat.game.realeaseS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			DynamicBeat.game.realeaseSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			DynamicBeat.game.realeaseE();
		}
		else if(e.getKeyCode() == KeyEvent.VK_R) {
			DynamicBeat.game.realeaseR();
		}
	}
}
