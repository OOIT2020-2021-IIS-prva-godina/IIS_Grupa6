package geometry;

import java.awt.Graphics;

public class Point extends Shape{

	private int x;
	private int y;

	
	public Point() {
		
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int x, int y, boolean selected) {
		// this.x = x;
		// this.y = y;
		this(x,y); //poziv prethodno definisanog konstruktora
				   // mora biti prva linija ove metode!
		this.selected = selected;
	}
	public boolean contains(int x, int y) {
		return this.distance(x, y) <= 2;
	}
	public double distance(int x2,int y2) {
		double dx = this.x - x2;
		double dy = this.y - y2;
		double d = Math.sqrt(dx*dx + dy*dy);
		return d;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			Point pomocna = (Point)obj;
			if(this.x == pomocna.x && this.y == pomocna.y)
				return true;
			else 
				return false;
		} else
			return false;
	}
	public int getX() {
		return this.x;
		//ili:  return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y; 
		//ili: return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		return "("+x+","+y+")";    // (x,y)
	}

	@Override
	public void draw(Graphics g) {
		//Tacku predstavljamo simbolom +, odnosno iscrtavamo 2 linije
		g.drawLine(x-2, y, x+2, y); //horizontalna
		g.drawLine(x, y+2, x, y-2); //vertikalna
		
	}

	@Override
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public void moveBy(int byX, int byY) {
		this.x = this.x + byX;
		this.y = this.y + byY;   // y += byY;
		
	}

	@Override
	public int compareTo(Object o) {
		if (o instanceof Point)
			return (int) (this.distance(0, 0) - ((Point)o).distance(0,0));
		return 0;
	}
}
