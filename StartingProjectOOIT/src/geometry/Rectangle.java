package geometry;

public class Rectangle {

	private Point upperLeftPoint;
	private int height;
	private int width;
	private boolean selected;
	
	public Rectangle() {
		
	}
	public Rectangle(Point upperLeftPoint, int width, int height) {
		this.upperLeftPoint = upperLeftPoint;
		this.width = width;
		this.height = height;
	}
	public Rectangle(Point upperLeftPoint, int width, int height, boolean selected) {
		this(upperLeftPoint, width, height);
		this.selected = selected;
	}
	
	public boolean contains(int x, int y) {
		return (upperLeftPoint.getX() <= x && (upperLeftPoint.getX() + width) >= x
				&& upperLeftPoint.getY() <= y && (upperLeftPoint.getY() + height) >= y);
	}
	public boolean contains(Point p) {
		return this.contains(p.getX(), p.getY());
	}
	//Metode za izračunavanje površine i obima:
	
	public int area() {
		return width * height;
	}
	public int circumference() {
		return 2*width + 2*height;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle pomocni = (Rectangle)obj;
			if (this.upperLeftPoint.equals(pomocni.upperLeftPoint) 
					&& this.width == pomocni.width 
					&& this.height == pomocni.height)
				return true;
			else 
				return false;
		} else
			return false;
	}
	
	//Metode pristupa:
	public Point getUpperLeftPoint() {
		return upperLeftPoint;
	}
	public void setUpperLeftPoint(Point upperLeftPoint) {
		this.upperLeftPoint = upperLeftPoint;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	public String toString() {
		return "Upper left point: " + upperLeftPoint + ", width = " 
						+ width + ", height = " + height; 
		//Upper left point: (xUpperLeft, yUpperLeft), width = <width>, height = <height>
	}
	 
}
