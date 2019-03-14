package geometricFigures;

import java.awt.*;

public class Circle extends GeometricFigure {
	private float radius;

	public float getRadius() {
		return radius;
	
	}

	public Circle(int x, int y, float radius) {
		super(x, y);
		this.radius = radius;
		
	}

	@Override
	public float getPerimeter() {
		float perimeter = (float)Math.PI *(2*radius);
		return perimeter;
		
	}

	@Override
	public float getArea() {
		float area = (float)Math.PI *(float)Math.pow(radius,2);
		return area;
		
	}

	@Override
	public void draw(Graphics g) {
		
		// Calculate the centroid
		int hr = (int) radius/2;
		int xof = x - hr; // x offset
		int yof = y - hr; // y offset
		
		//TODO: Try catch can be erased?
		
		try {
			g.setColor(Color.RED);
			g.drawOval(xof, yof, (int) radius, (int) radius); //TODO: Comment this and also on the other figures??
			g.fillOval(xof, yof, (int) radius, (int) radius); // Creates a filled circle 
	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}