package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tools extends JPanel implements ActionListener {
	
	// Declaration of the button object
	protected JTextField txtField;
	protected JLabel Empty;
	protected MainWindow myWindow;
	protected DrawingSpace myDraw;
	protected final JButton[] B = new JButton[5];
	protected String out;
	
	// Instantiator of class Mainwindow
	public void setMyWindow(MainWindow myWindow) {
		this.myWindow = myWindow;
		
	}
	
	// Instantiator of class DrawingSpace
	public void setMyDraw(DrawingSpace myDraw) {
		this.myDraw = myDraw;
		
	}
	
	// Textfield getter
	public String getTextField() {
		return txtField.getText();
		
	}
	
	// Name of each button
	private final String[] btName = {
					"Circle", "Rectangle",
					"Triangle", "Erase the panel", 
					"Draw all"
					};
		
	// Button name's getter
	public String getOut(){
		return out;
		
	}
	
	public Tools() {
		// New gridlayout
		final GridLayout g = new GridLayout(7, 1);
		
		setLayout(g);
		
		// Creates Text field and Label
		txtField= new JTextField("", SwingConstants.RIGHT);
		Empty = new  JLabel("");
		
		// Font of the label as well as orientation
		Empty.setFont(new Font("Times new roman", 20, 20));
		Empty.setHorizontalAlignment(JLabel.CENTER);
		Empty.setVerticalAlignment(JLabel.CENTER);
		
		// Add both textfield and label to layout
		add(txtField);
		add(Empty);
		
		// Creates buttons and adds action listener
		for(int i = 0; i < B.length; i++) {
			B[i] = new JButton(btName[i]);
			add(B[i]);
			B[i].addActionListener(this);
			
		}
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		
		switch(s) {
			case "Circle":
				// Adds string to label
				Empty.setText(s);
				txtField.setText("Radius:");
				out = s;

			break;
			
			case "Rectangle":
				// Adds string to label
				Empty.setText(s);
				txtField.setText("Width: Height:");
				out = s;
				
			break;
			
			case "Triangle":
				// Adds string to label
				Empty.setText(s);
				txtField.setText("Base: Height:");
				out = s;

			break;
			
			case "Erase the panel":
				// Calls to the erase function on DrawingSpace
				myDraw.eraseFigures();

			break;
			
			case "Draw all":
				// Calls the draw all function on DrawinSpace
				myDraw.drawAll();
				
			break;
		}	
	}
}