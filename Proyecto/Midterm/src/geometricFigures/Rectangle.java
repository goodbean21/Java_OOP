package geometricFigures;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends GeometricFigure {
	private float width, length;

	public Rectangle(int x, int y, float width, float length) {
		super(x, y);
		this.length = length;
		this.width = width;
		
	}

	@Override
	public float getPerimeter() {
		float perimeter = 2*(width+length);
		return perimeter;
	
	}

	@Override
	public float getArea() {
		float area = width*length;
		return area;
		
	}

	@Override
	public void draw(Graphics g) {
		// Calculates the centroid before drawing the rectangle
		int x_off = x - (int) width/2;
		int y_off = y - (int) length/2;
		
		g.setColor(Color.YELLOW);
		g.drawRect(x_off, y_off, (int) width, (int) length);
		g.fillRect(x_off, y_off, (int) width, (int) length);
		
	}

}