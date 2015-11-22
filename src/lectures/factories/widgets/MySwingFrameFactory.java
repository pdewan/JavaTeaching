package lectures.factories.widgets;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.JFrame;

import bus.uigen.widgets.FrameFactory;
import bus.uigen.widgets.VirtualFrame;
import bus.uigen.widgets.swing.SwingFrameFactory;

public class MySwingFrameFactory extends SwingFrameFactory implements FrameFactory {

	@Override
	protected JFrame createJFrame() {
		JFrame aJFrame = new JFrame();
		aJFrame.setCursor(new Cursor (Cursor.CROSSHAIR_CURSOR));		
		return aJFrame;
	}
}
