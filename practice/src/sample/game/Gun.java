package sample.game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;

public class Gun {
	private Polygon p;
	public Gun() {
		int[] xlist = {  0,  0,  8, 13, 18, 26, 26,  0 };
	    int[] ylist = { 15,  5,  5,  0,  5,  5, 15, 15 };
	    p = new Polygon(xlist, ylist, xlist.length);
	}
	
	public Gun(int x, int y ) {
	    this();
	    for (int i=0; i < p.xpoints.length; i++ ) {
	    	p.xpoints[i] += x;
	    	p.ypoints[i] += y;
	    }
	}
	
	public void draw(Graphics2D g2) {
		g2.setColor(Color.YELLOW);
	    g2.fill(p);
	    g2.setColor(Color.BLACK);
	    g2.draw(p);
	}
	
	public void moveLeftGun() {
		for (int i=0; i < p.xpoints.length; i++ ) {
			p.xpoints[i] -= 5;
	    }
	}
	
	public void moveRightGun() {
		for (int i=0; i < p.xpoints.length; i++ ) {
			p.xpoints[i] += 5;
	    }
	}
	
	public void setGun(){
	}
	
	public Point getGun(){
		return new Point(p.xpoints[0],p.ypoints[0]);
	}	  
}