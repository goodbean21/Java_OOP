package gui;

import java.awt.BorderLayout;
import java.util.Arrays;

import javax.swing.*;

public class MainWindow extends JFrame{
	protected DrawingSpace draw;
	protected SouthLabel sL;
	protected Tools tools;
	
	public float[] getText() {
		
		// Read the textfield contents of the tool panel
		String s = tools.getTextField();
		// Creates an array of Strings 
		String[] Str = null;
		float[] myList = new float[1];		
		Str = s.split(":|\\ "); 
		
		if(Str.length > 2) {
			myList = Arrays.copyOf(myList, myList.length*2);
			myList[0] = Float.parseFloat(Str[1]); //Siempre van a estar en la misma posicion
			myList[1] = Float.parseFloat(Str[3]); 
		
		} else {
			myList[0] = Float.parseFloat(Str[1]);

		}
						
		return myList;
		
	}
	
	public String buttonName() {
		// Reads the name of the button press from the tools panel
		String name = tools.getOut();			
		return name;
		
	}
	
	public MainWindow() {
		super("Paint");
		
		tools = new Tools();
		sL = new SouthLabel();
		draw = new DrawingSpace();
		
		//Instantiate each class within each other so they can communicate through a setter
		//Draw and tools communicate with MainWindow
		draw.setMyWindow(this);
		tools.setMyWindow(this);
		
		//Draw communicates with SouthLabel(sL)
		draw.setMySouthLabel(sL);
		
		//Tools communicate with draw
		tools.setMyDraw(draw);
		
		BorderLayout B = new BorderLayout();
		setLayout(B);
		
		add(tools, BorderLayout.WEST);
		add(sL, BorderLayout.SOUTH);
		add(draw, BorderLayout.CENTER);	
				
		setSize(800,800);
		setLocation(500, 100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		
	}
}