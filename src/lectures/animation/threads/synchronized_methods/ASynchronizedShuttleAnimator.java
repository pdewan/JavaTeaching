package lectures.animation.threads.synchronized_methods;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

import lectures.animation.threads_commands.AShuttleAnimator;
import lectures.composite.objects_shapes.PlottedShuttle;
import bus.uigen.OEFrame;
public class ASynchronizedShuttleAnimator extends AShuttleAnimator  {	
	public 
	    synchronized
	    void animateFromOrigin(PlottedShuttle shuttle, int animationStep, int animationPauseTime) {		
		super.animateFromOrigin(shuttle, animationStep, animationPauseTime);
	}
	public 
	/*
	 * Uncomment synchronized line when asked.
	 */
//		synchronized 
		String toString() {
		return super.toString();
	}	

}
