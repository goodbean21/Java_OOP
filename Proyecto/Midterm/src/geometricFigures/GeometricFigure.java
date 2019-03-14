package geometricFigures;

import java.awt.*;

public abstract class GeometricFigure {
	protected int x, y;

	public int getX() {
		return x;
		
	}

	public int getY() {
		return y;
		
	}
	
	public GeometricFigure(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public abstract float getPerimeter();
	public abstract float getArea();
	public abstract void draw(Graphics g);

}