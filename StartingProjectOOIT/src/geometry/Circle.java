package geometry;

import java.awt.Graphics;

public class Circle extends Shape {

	private Point center;
	private int radius;
	
	public Circle() {
		
	}
	
	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public Circle(Point center, int radius, boolean selected) {
		this(center, radius);
		this.selected = selected;
	}
	
	public boolean contains(int x, int y) {
		return center.distance(x,y) <= radius;
	}
	//overloading
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	//Metode za izračunavanje površine i obima kruga:
	
	public double area() {
		return radius*radius*Math.PI;
	}
	public double circumference() {
		return 2*radius*Math.PI;
	}
	
	
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle pomocni = (Circle)obj;
			if(this.center.equals(pomocni.center) && this.radius == pomocni.radius)
				return true;
			else 
				return false;
		} else
			return false;
	}
	//Metode pristupa(GET i SET): 
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public String toString() {
		return "Center: " + center + ", radius = " + radius;
		//return "Center: (" + center.getX() + ", " + center.getY() + "), radius = " + radius;
		//Center: (xCenter, yCenter), radius = <radius>
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(center.getX()-radius,center.getY() - radius, 2*radius, 2*radius);
	}
}
