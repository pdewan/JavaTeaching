package lectures.mvc.toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JTextField;

public interface BMIFrameComposer {
	public JTextField getHeightField();
	public JLabel getHeightLabel() ;
	public JPanel getHeightPanel() ;
	public JTextField getWeightField() ;
	public JLabel getWeightLabel() ;
	public JPanel getWeightPanel() ;
	public JSlider getBMISlider() ;
	public JProgressBar getBMIProgressBar() ;
	public JPanel getBmiPanel() ;
	public JFrame composeFrame();
}
