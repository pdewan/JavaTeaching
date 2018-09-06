package lectures.graphics.extra;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;
public class AWindowLocationAndSizeCustomizer {
	public static void main (String args[]) {
		OEFrame frame = ObjectEditor.edit(new ACartesianPoint (25, 50));
		frame.showTreePanel();
		frame.setLocation(500, 300);
		frame.setSize(400, 200);
		
	}

}
