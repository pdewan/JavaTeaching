package lectures.oegraphics;

import shapes.FlexibleShape;
import bus.uigen.ObjectEditor;
import bus.uigen.shapes.ALineModel;
import bus.uigen.shapes.ARectangleModel;
import bus.uigen.shapes.AnOvalModel;

public class ShapeArrayDisplayer {
	public static void main (String[] args) {
		FlexibleShape ovalModel = new AnOvalModel(100, 60, 75, 50);
		ovalModel.setFilled(true);
		ObjectEditor.edit(new FlexibleShape[]{	
			new ARectangleModel (100, 60, 75, 50),
			new ALineModel(100, 60, 75, 50),
			ovalModel});
		}
}
