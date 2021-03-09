package geometry;

public class Test {

	public static void main(String[] args) {
		
		Point p = new Point(); // kreiram objekat klase Point putem konstruktora
		
		p.setX(10);
		p.setY(20);
		p.setSelected(true);
		
		System.out.println("X coordinate of point p is: " + p.getX() + '\n' + "Y coordinate of point p is: " + p.getY() + '\n' +
				"Point p is selected: " + p.isSelected());
		
		double result = p.distance(30, 40); //metoda distance(int x2,int y2) racuna udaljenost tacke p u odnosu na tacku sa prosledjenim koorinatama
		System.out.println("Distance between points is: " + result);
	}

}
