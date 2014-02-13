package lectures.oegraphics;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

import lectures.recursion.Factorial;

public class AppletAndApplicationFactorialGraphics extends Applet implements MouseListener,
		FactorialGraphics {	
	int factorial = 0;
	int n = 0;
	public void init() {
		this.addMouseListener(this);
		System.out.println("init called");
	}
	public void paint(Graphics g) {
		g.drawString("" + n, RECT_X, RECT_Y - TEXT_Y_OFFSET);
		g.fillRect(RECT_X, RECT_Y, RECT_WIDTH, factorial * PIXELS_PER_INT);
	}
	public void mouseClicked(MouseEvent arg0) {
		n++;
		factorial = Factorial.factorial(n);
		repaint();
	}
	public void mouseEntered(MouseEvent arg0) {

	}
	public void mouseExited(MouseEvent arg0) {

	}
	public void mousePressed(MouseEvent arg0) {

	}
	public void mouseReleased(MouseEvent arg0) {

	}
	public static void main (String args[]) {
		JFrame frame = new JFrame();
		Applet applet =  new AppletAndApplicationFactorialGraphics();
		applet.init();
		frame.add(applet);
		frame.setSize(360, 240);
		frame.setVisible(true);
	}
}
