package geometry;

public class Rectangle {

	private Point upperLeftPoint;
	private int height;
	private int width;
	private boolean selected;
	
	//Metode za izračunavanje površine i obima:
	
	public int area() {
		return width * height;
	}
	public int circumference() {
		return 2*width + 2*height;
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
}