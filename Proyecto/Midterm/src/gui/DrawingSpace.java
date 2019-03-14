package gui;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import geometricFigures.*;
import geometricFigures.Rectangle;

public class DrawingSpace extends JPanel implements MouseListener{
	
	protected MainWindow myWindow;
	protected SouthLabel mySoutLabel;
	private String s;
	private GeometricFigure currentFigures;
	private ArrayList<GeometricFigure> figures = new ArrayList(), figures_saved = new ArrayList();
	private float[] myList;
	
	//Instantiator of class MainWindow
	public void setMyWindow(MainWindow myWindow) {
		this.myWindow = myWindow;
		
	}
	
	//Instantiator of class SouthLabel
	public void setMySouthLabel(SouthLabel mySoutLabel) {
		this.mySoutLabel = mySoutLabel;
		
	}
	
	public DrawingSpace() {
		// Creates a white space
		setBackground(Color.WHITE);
		addMouseListener(this);
		
	}
	
	//Paint method
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			for(int i = 0; i <figures.size(); i++) {
				//Draws each figure from the arraylist figures
				figures.get(i).draw(g);
			
			}
						
		}catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
	
	public void eraseFigures() {
		//Creates a copy of the current arraylist figures
		figures_saved = (ArrayList<GeometricFigure>) figures.clone();
		
		//Clears current arraylist figures
		figures.clear();
		
		//Calls the Paint method (paintComponent)
		repaint();
		
	}
	
	public void drawAll() {
		// Adds the copy to the current arraylist figures
		figures.addAll(figures_saved);
		
		//Calls the Paint method
		repaint();
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		s = myWindow.buttonName(); // getter of the pressed button's name
		
		if(s == null) s = "none"; // If no button had been pressed s is set to none
		
		try {
			myList = myWindow.getText();
			
		}catch (Exception e1) {
			if(s != "none") s = "Invalid"; // Invalid size
			
		}	
		
		switch(s) {
			case "Circle":
				currentFigures = new Circle(e.getX(), e.getY(), myList[0]); // Creates object of type GeometricFigure
				figures.add(currentFigures); // Adds the currentFigure to the arraylist
				
				mySoutLabel.label_south[1].setText(String.valueOf(currentFigures.getPerimeter())); // Adds the perimeter to southlabel
				mySoutLabel.label_south[3].setText(String.valueOf(currentFigures.getArea())); // Adds the area to southlabel

				currentFigures = null; // clears 
				repaint();
				
			break;
			
			case "Rectangle":
				currentFigures = new Rectangle(e.getX(), e.getY(), myList[0], myList[1]);
				figures.add(currentFigures);
				
				mySoutLabel.label_south[1].setText(String.valueOf(currentFigures.getPerimeter()));
				mySoutLabel.label_south[3].setText(String.valueOf(currentFigures.getArea()));

				currentFigures = null;
				repaint();
				
			break;
			
			case "Triangle":
				currentFigures = new Triangle(e.getX(), e.getY(), myList[1], myList[0]);
				figures.add(currentFigures);
				
				mySoutLabel.label_south[1].setText(String.valueOf(currentFigures.getPerimeter()));
				mySoutLabel.label_south[3].setText(String.valueOf(currentFigures.getArea()));
				
				currentFigures = null;
				repaint();
				
				break;
			
			default:
				if(s == "Invalid") myWindow.tools.txtField.setText("Invalid Size");
				else myWindow.tools.txtField.setText("Choose a button");
				
				break;
			
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}