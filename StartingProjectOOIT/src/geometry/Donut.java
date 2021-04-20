package geometry;

import java.awt.Graphics;

public class Donut extends Circle{
	// Prosiruje klasu Circle i time nasleđuje sva obeležja i 
	// metode klase Circle, koji nisu deklarisani kao private.
	
	private int innerRadius;
	
	public Donut() {
		
	}
	public Donut(Point center, int radius, int innerRadius) {
		//setCenter(center);
		//setRadius(radius);
		super(center, radius); // Poziv konstruktora osnovne klase; Prosledjujem mu parametre
								// Mora biti prva naredba u konstruktoru izvedene klase
		this.innerRadius = innerRadius;
	}
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		setSelected(selected);
	}
	
	
	@Override
	public boolean contains(int x, int y) {
		
		return super.contains(x, y) && getCenter().distance(x, y) >= innerRadius;
	}
	@Override
	public boolean contains(Point p) {
		
		return this.contains(p.getX(), p.getY());
	}
	@Override
	public double area() {
		
		return super.area() - innerRadius*innerRadius*Math.PI;
		// Korišćenjem ključne reči super pozivamo metodu osnovne klase.
		// Da smo napisali samo area() došlo bi do rekurzije.
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut pomocni = (Donut)obj;
			if(getCenter().equals(pomocni.getCenter()) 
					&& getRadius() == pomocni.getRadius()
					&& innerRadius == pomocni.innerRadius)
				return true;
				
		}
		return false;
	}
	@Override
	public String toString() {
		// Center: (xCenter,yCenter), radius: <radius>, innerRadius: <innerRadius>
		return super.toString() + ", innerRadius: "+ innerRadius;
	}
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	@Override
	public void draw(Graphics g) {
		super.draw(g); //Poziv metode draw() implementirane u klasi Circle. Iscrtava se spoljasnji krug
		//Unutrasnji krug:
		g.drawOval(getCenter().getX() - innerRadius,getCenter().getY() - innerRadius, 2*innerRadius, 2*innerRadius);
	}
	@Override
	public int compareTo(Object o) {
		if(o instanceof Donut)
			return (int) (this.area() - ((Donut)o).area());
		return 0;
	}
	
	
}
