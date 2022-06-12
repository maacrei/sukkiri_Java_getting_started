package sample.game;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;

public class ShootGame extends JApplet implements KeyListener {
	public Gun gun = new Gun(87, 180);
	public Bullet bullet;
	public void init() {
		addKeyListener(this);
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.clearRect(0,0,getWidth(), getHeight()); 
		gun.draw(g2);
		if ( bullet != null ) {
			bullet.draw(g2);
		}
	}
	
	public void update(Graphics g){
		paint(g);
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			gun.moveRightGun();
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
			gun.moveLeftGun();
		} else if (e.getKeyCode() == KeyEvent.VK_SPACE ) {
			bullet = new Bullet(gun.getGun().x, gun.getGun().y);
		}
		repaint();
	}
	
	public void keyReleased(KeyEvent e) {
	}
	
	public void keyTyped(KeyEvent e) {
	}
}