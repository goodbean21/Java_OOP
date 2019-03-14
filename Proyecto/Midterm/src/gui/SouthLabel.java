package gui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class SouthLabel extends JPanel {
	
	// Label object 
	JLabel[] label_south = new JLabel[4]; 
	
	// Name of all labels
	String [] label = {
			"Perimeter", "", "Area", ""
			};
	
	public SouthLabel() {
		// New grid layout 
		final GridLayout g = new GridLayout(1, 4);
		setLayout(g);
		
		// Creates the label
		for(int i = 0; i < 4; i++) {
			label_south[i] = new JLabel(label[i]); 
			add(label_south[i]);
			
		}	
	}
}