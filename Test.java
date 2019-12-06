package shoot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

public class Test extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
	private static final long serialVersionUID = 1L;
	
	final short WIDTH=640, HEIGHT=480;
	
	Cursor cursor = new Cursor(WIDTH/2, HEIGHT/2);
	
	public void init() {
		setSize(WIDTH,HEIGHT);
		this.setFocusable(true);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
	}
	
	public void paint(Graphics g) {
		// draw background
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		// draw origin point
		g.setColor(Color.BLUE);
		g.fillOval(WIDTH/2, HEIGHT/2, 20, 20);
		// draw connecting line
		g.setColor(Color.RED);
		g.drawLine(WIDTH/2+10, HEIGHT/2+10, cursor.x+10, cursor.y+10);
		// draw debug-related things
		double distance = Process.getDistance(WIDTH/2, HEIGHT/2, cursor.x, cursor.y);
		g.drawString(Double.toString(distance), 50, 50);
		double angle = Process.getAngle(distance, HEIGHT/2, cursor.y);
		g.drawString(Double.toString(angle), 50, 100);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		cursor.x = e.getX();
		cursor.y = e.getY();
		repaint();	
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		cursor.x = e.getX();
		cursor.y = e.getY();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
