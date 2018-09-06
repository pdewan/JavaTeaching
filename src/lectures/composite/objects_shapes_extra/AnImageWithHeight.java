package lectures.composite.objects_shapes_extra;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import util.annotations.StructurePattern;
import util.annotations.StructurePatternNames;
import bus.uigen.ObjectEditor;
@StructurePattern(StructurePatternNames.IMAGE_PATTERN)
public class AnImageWithHeight implements ImageWithHeight {
    int x, y;
	String imageFileName;
	int imageHeight;
	public AnImageWithHeight(String anImageFileName) {
		imageFileName = anImageFileName;
		Icon icon = new ImageIcon(imageFileName);
		imageHeight = icon.getIconHeight();		
	}
    public int getX() {return x;}
	public void setX(int newX) {x = newX;}
	public int getY() { return y; }
	public void setY(int newY) {y = newY;}
    public String getImageFileName() {return imageFileName;}  
    public int getHeight() {
	  return  imageHeight;
    }    
    
    public static void main (String args[]) {
    final String SHUTTLE_IMAGE_FILE_NAME = "shuttle2.jpg";

   	 ImageWithHeight shuttle = new AnImageWithHeight(SHUTTLE_IMAGE_FILE_NAME);
   	 ObjectEditor.edit(shuttle);
   	 shuttle.setX(100);
   	 shuttle.setY(100);
    }

}
