package com.example;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter{
    @Override
	public void keyPressed(KeyEvent e) {
		
		if(IntroTab.miniGame == null) {
			return;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_W) {
			IntroTab.miniGame.pressW();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			IntroTab.miniGame.pressD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			IntroTab.miniGame.pressA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			IntroTab.miniGame.pressS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			IntroTab.miniGame.pressSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			IntroTab.miniGame.pressE();
		}
		else if(e.getKeyCode() == KeyEvent.VK_R) {
			IntroTab.miniGame.pressR();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
		if(IntroTab.miniGame == null) {
			return;
		}
		if(e.getKeyCode() == KeyEvent.VK_W) {
			IntroTab.miniGame.realeaseW();
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			IntroTab.miniGame.realeaseD();
		}
		else if(e.getKeyCode() == KeyEvent.VK_A) {
			IntroTab.miniGame.realeaseA();
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			IntroTab.miniGame.realeaseS();
		}
		else if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			IntroTab.miniGame.realeaseSpace();
		}
		else if(e.getKeyCode() == KeyEvent.VK_E) {
			IntroTab.miniGame.realeaseE();
		}
		else if(e.getKeyCode() == KeyEvent.VK_R) {
			IntroTab.miniGame.realeaseR();
		}
	}
}
