package geometry;

import java.awt.Graphics;

public class Line extends Shape{

	private Point startPoint;
	private Point endPoint;
	
	public Line() {
		
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public Line(Point startPoint, Point endPoint, boolean selected) {
		this(startPoint, endPoint);
		this.selected = selected;
	}
	
	public double length() {
		return startPoint.distance(endPoint.getX(), endPoint.getY());
	}
	public boolean contains(int x,int y) {
		return startPoint.distance(x, y) + endPoint.distance(x, y) - length() <=2;
	}
	public boolean equals(Object obj) {
		if(obj instanceof Line) {
			Line pomocna = (Line)obj;
			if(this.startPoint.equals(pomocna.startPoint) 
					&& this.endPoint.equals(pomocna.endPoint))
				return true;
			else 
				return false;
		}else 
			return false;
	}
	
	// Metode pristupa (GET i SET metode):
	public Point getStartPoint() {
		return startPoint; // this.startPoint
	}
	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}
	public Point getEndPoint() {
		return endPoint;
	}
	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public String toString() {
		return startPoint + "-->" + endPoint;
		// (xStart, yStart) --> (xEnd, yEnd)
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
		
	}
	
	
}
