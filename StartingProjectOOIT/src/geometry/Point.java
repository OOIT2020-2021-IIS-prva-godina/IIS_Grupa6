package geometry;

public class Point {

	private int x;
	private int y;
	private boolean selected;
	
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
	public boolean isSelected() {
		return this.selected ;
		//ili: return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	public String toString() {
		return "("+x+","+y+")";    // (x,y)
	}
}
