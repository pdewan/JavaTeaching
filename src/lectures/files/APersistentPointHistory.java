package lectures.files;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

import lectures.arrays.collections_kinds.extra.APointHistory;
import lectures.arrays.collections_kinds.extra.PointHistory;
import lectures.graphics.extra.Point;
import bus.uigen.ObjectEditor;

//need to uncomment the Serializable declarations in ACartesianPoint and APointHistory
//to make save and load work
public class APersistentPointHistory extends APointHistory implements PointHistory  {
	transient FileDialog loadFileDialog = new FileDialog(new Frame(), "Load from", FileDialog.LOAD);
	transient FileDialog saveFileDialog = new FileDialog(new Frame(), "Save to", FileDialog.SAVE);	
	public void load() {
		loadFileDialog.setVisible(true);
		String fileName = loadFileDialog.getFile();
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream (fileName));
			PointHistory savedPointHistory = (PointHistory) objectIn.readObject();
			objectIn.close();
			size = 0;
			for (int i=0; i < savedPointHistory.size(); i++) {
				Point savedPoint = savedPointHistory.elementAt(i);
				addElement(savedPoint.getX(), savedPoint.getY());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public void save() {
		saveFileDialog.setVisible(true);
		String fileName = saveFileDialog.getFile();
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream (fileName));
			objectOut.writeObject(this);
			objectOut.flush();
			objectOut.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void loadText() {
		loadFileDialog.setVisible(true);
		String fileName = loadFileDialog.getFile();
		try {
			BufferedReader textIn = new BufferedReader (new InputStreamReader(new FileInputStream (fileName)));
			size = 0;
			int savedSize = Integer.parseInt(textIn.readLine());			
			for (int i=0; i < savedSize; i++) {
				int savedX = Integer.parseInt(textIn.readLine());
				int savedY = Integer.parseInt(textIn.readLine());
				addElement(savedX, savedY);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void saveText() {
		saveFileDialog.setVisible(true);
		String fileName = saveFileDialog.getFile();
		try {
			PrintStream textOut = new PrintStream(new FileOutputStream (fileName));
			textOut.println(size);
			for (int i = 0; i < size; i++) {
				Point point = contents[i];
				textOut.println(point.getX());
				textOut.println(point.getY());
			}			
			textOut.flush();
			textOut.close();
		} catch (Exception e) {
			e.printStackTrace();
	    }
	}	
	public static void main (String[] args) {
		ObjectEditor.edit(new APersistentPointHistory());
	}
}
