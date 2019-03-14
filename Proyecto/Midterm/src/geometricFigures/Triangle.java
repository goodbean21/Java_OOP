package geometricFigures;

import java.awt.Color;
import java.awt.Graphics;

public class Triangle extends GeometricFigure {
	private float base, height;
	
	public Triangle(int x, int y, float height, float base) {
		super(x, y);
		this.height = height;
		this.base = base;
	
	}

	@Override
	public float getPerimeter() { 
		// Just for isosceles and equilateral
		float sqrBase, sqrHeight, c, perimeter;
		
		sqrBase = (float) Math.pow(base/2,2);
		sqrHeight = (float) Math.pow(height,2);
		c = (float) Math.sqrt(sqrBase + sqrHeight);

		perimeter = 2*c + base;
		
		return perimeter;
	
	}

	@Override
	public float getArea() {
		float area = (base*height)/2;
		return area;
		
	}

	@Override
	public void draw(Graphics g) {
		// Calculates the centroid before drawing the triangle
		int hy = (int) height/2;
		int hx = (int) base/2;
		
		// Vertices of the triangle
		int[] yP = {y - hy, y + hy , y + hy};
		int[] xP = {x, x - hx, x + hx};
		
		// Draws a polygon using the vertices
		g.setColor(Color.YELLOW);
		g.drawPolygon(xP, yP, 3);
		g.fillPolygon(xP, yP, 3);
	
	}

}