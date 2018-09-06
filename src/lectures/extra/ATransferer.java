package lectures.extra;

import java.util.ArrayList;
import java.util.List;

import lectures.graphics.extra.ALine;
import lectures.graphics.extra.Line;
import bus.uigen.OEFrame;
import bus.uigen.ObjectEditor;


public class ATransferer {
	int list1X = 50;
	int list2X = 100;
	int lastY = 10;
	int lastYOffset = 10;
	List<Line> list1 = new ArrayList();
	List<Line> list2 = new ArrayList();
	public List<Line> getList1() {
		return list1;
	}
	public List<Line> getList2() {
		return list2;
	}
	public void addToList1() {
		lastY += lastYOffset;
		Line line = new ALine(list1X, lastY, 20, 30);
		list1.add(line);		
	}
	public void moveList1(int x, int y) {
		for (int i = 0; i < 1; i++) {
			Line element = list1.get(i);
			element.setX(element.getX() + x);
			element.setY(element.getY() + y);
		}
		
	}
	public void transferTo2() {
		Line lastList1 = list1.get(list1.size()-1);
//		Line lastList2 = list2.get(list2.size() -1);
		list1.remove(list1.size() - 1);
//		list2.remove(list2.size() - 1);
		lastList1.setX(list2X);
		list2.add(lastList1);
		
		
	}
	public static void main (String[] args) {
		OEFrame editor = ObjectEditor.edit(new ATransferer());
//		editor.setFullRefreshOnEachOperation(true);
		
	}

}
