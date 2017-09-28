package lectures.oegraphics;

import java.awt.Color;

import lectures.interfaces.ALoopingFactorialSpreadsheet;
import lectures.interfaces.FactorialSpreadsheet;
import util.misc.ThreadSupport;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
import bus.uigen.attributes.AttributeNames;

public class GraphicsFactorialDriver {
	public static final int NUM_ANIMATIONS = 100;
	public static final int PAUSE_TIME = 1000;
	public static final int NUMBER_LIMIT = 5;
	public static final int SPREADSHEET_FRAME_WIDTH = 300;
	public static final int SPREADSHEET_FRAME_HEIGHT = 200;
//	public static final int NUMBER_COMPONENT_WIDTH = 50;
	public static void main (String[] arg) {
		FactorialSpreadsheet factorialSpreadsheet = new ALoopingFactorialSpreadsheet();
		GraphicsFactorialDisplayer graphicsFactorialDisplayer = new AGraphicsFactorialDisplayer(factorialSpreadsheet);
		ObjectEditor.setAttribute(ALoopingFactorialSpreadsheet.class, AttributeNames.COMPONENT_BACKGROUND, Color.DARK_GRAY);
		ObjectEditor.setAttribute(AGraphicsFactorialDisplayer.class, AttributeNames.DRAWING_PANEL_COLOR, Color.MAGENTA);

		ObjectEditor.setPropertyAttribute(ALoopingFactorialSpreadsheet.class, "Number", AttributeNames.COMPONENT_BACKGROUND, Color.LIGHT_GRAY);
//		ObjectEditor.setPropertyAttribute(ALoopingFactorialSpreadsheet.class, "Number", AttributeNames.COMPONENT_WIDTH, NUMBER_COMPONENT_WIDTH);
		ObjectEditor.setPropertyAttribute(FactorialSpreadsheet.class, "Number", AttributeNames.COMPONENT_BACKGROUND, Color.LIGHT_GRAY);
		OEFrame factorialSpreadsheetFrame = ObjectEditor.edit(factorialSpreadsheet);
		factorialSpreadsheetFrame.setSize(SPREADSHEET_FRAME_WIDTH, SPREADSHEET_FRAME_HEIGHT);
		factorialSpreadsheetFrame.setLocation(300, 300);		
		OEFrame graphicsFactorialFrame = ObjectEditor.edit(graphicsFactorialDisplayer);
		graphicsFactorialFrame.setTitle("Factorial Animation");
		graphicsFactorialFrame.showTreePanel();
		int currentNumber = 0;		
		for (int anumationNumber = 0; anumationNumber < NUM_ANIMATIONS; anumationNumber++) {
			factorialSpreadsheet.setNumber(currentNumber);
			factorialSpreadsheetFrame.select(factorialSpreadsheet, "Number");
			graphicsFactorialDisplayer.computeDependentProperties();
			factorialSpreadsheetFrame.refresh();
			graphicsFactorialFrame.refresh();
			ThreadSupport.sleep(PAUSE_TIME);
			currentNumber = (currentNumber + 1) % NUMBER_LIMIT;			
		}		
	}
}
