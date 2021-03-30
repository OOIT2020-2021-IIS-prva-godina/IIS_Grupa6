package geometry;

public class Test {

	public static void main(String[] args) {
		
		//Vežbe 2.
		Point p = new Point(); // kreiram objekat klase Point putem konstruktora
		
		p.setX(10);
		p.setY(20);
		p.setSelected(true);
		
		System.out.println("X coordinate of point p is: " + p.getX() + '\n' + 
				"Y coordinate of point p is: " + p.getY() + '\n' +
				"Point p is selected: " + p.isSelected());
		
		double result = p.distance(30, 40); //metoda distance(int x2,int y2) racuna udaljenost tacke p u odnosu na tacku sa prosledjenim koorinatama
		System.out.println("Distance between points is: " + result);
		
		
		//Vežbe 3.
		Point p1 = new Point();
		p1.setX(15);
		p1.setY(27);
		p1.setSelected(true);
		
		Line l1 = new Line();
		Rectangle r1 = new Rectangle();
		Circle c1 = new Circle();
		
		// 1. Inicijalizovati x koordinatu tačke p na vrednost y koordinate tačke p1.
		
		p.setX(p1.getY());
		System.out.println("X of p: " + p.getX());
				

		// 2. Postaviti za početnu tačku linije l1 tačku p, a za krajnju tačku linije l1 tačku p1. 
		
		l1.setStartPoint(p);
		l1.setEndPoint(p1);
		System.out.println("X of l1 startPoint: " + l1.getStartPoint().getX());  
		System.out.println("Y of l1 startPoint: " + l1.getStartPoint().getY());  
		System.out.println("X of l1 endPoint: " + l1.getEndPoint().getX());
		System.out.println("Y of l1 endPoint: " + l1.getEndPoint().getY());

		// 3. Postaviti y koordinatu krajnje tačke l1 na 23.

		l1.getEndPoint().setY(23);
		System.out.println("Y of l1 endPoint: " + l1.getEndPoint().getY());
		System.out.println("Y of point p1: " + p1.getY());

		// 4. Inicijalizovati x koordinatu početne tačke linije l1 na vrednost
		// y koordinate krajnje tačke linije l1.
		l1.getStartPoint().setX(l1.getEndPoint().getY());
		System.out.println("X of l1 startPoint: " + l1.getStartPoint().getX());

		// 5. Postaviti x koordinatu krajnje tačke l1 na vrednost dužine linije l1
		// umanjene za vrednost zbira x i y koordinate početne tačke linije l1.		
		
		l1.getEndPoint().setX((int)l1.length() - (l1.getStartPoint().getX() + l1.getStartPoint().getY()));
		System.out.println("X of l1 endPoint: " + l1.getEndPoint().getX());

		// 6. Postaviti x koordinatu tačke gore levo pravougaonika r1 na vrednost 10,
		// i y koordinatu na vrednost 15.	

		r1.setUpperLeftPoint(p1);
		r1.getUpperLeftPoint().setX(10);
		r1.getUpperLeftPoint().setY(15);
		System.out.println("X of r1 upperLeft: " + r1.getUpperLeftPoint().getX());
		System.out.println("Y of r1 upperLeft: " + r1.getUpperLeftPoint().getY());
		
		// 7. Postaviti centar kruga c1 na koordinate tačke gore levo od r1.

		c1.setCenter(r1.getUpperLeftPoint());
		System.out.println("X of c1 ceter: " + c1.getCenter().getX());
		System.out.println("Y of c1 ceter: " + c1.getCenter().getY());
		
		// 8. Postaviti x koordinatu centra kruga c1 na vrednost razlike površine pravougaonika i 
		// y koordinate početne tačke linije l1.
		r1.setHeight(20);
		r1.setWidth(30);
		c1.getCenter().setX(r1.area()- l1.getStartPoint().getY());
		System.out.println("X of c1 center: " + c1.getCenter().getX());
		
		// Vezbe 4.
		System.out.println("Vezbe 4");
		
		Point p2 = new Point(50,100);
		System.out.println("Point p2: X:" + p2.getX() + ", Y: " + p2.getY() + ", selected: " + 
						p2.isSelected());
		
		Line l2 = new Line(p2,new Point(400,500));
		Rectangle r2 = new Rectangle(p1,50,80);
		Rectangle r3 = new Rectangle(p1,40,80,false); 
		Circle c2 = new Circle(new Point(300,300), 60);
		
		// Ispis pre redifinisanja metode toString() : <naziv_paketa>.<naziv_klase>@<HexOfHash>
		
		System.out.println(p2);  // (x,y)
		System.out.println(p2.toString());
		System.out.println(l2);
		System.out.println(r2);
		System.out.println(c2);
		
		int a = 5;
		int b = 5;
		System.out.println(a == b); //poredjenje po vrednosti
		
		String s1 = new String("Hello World!");
		String s2 = new String("Hello World!");
		System.out.println(s1 == s2); //poredjenje po referenci
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		
		System.out.println(s1.equals(s2)); // poredjenje po vrednosti
		
		System.out.println(p2 instanceof Point);
		System.out.println(p2 instanceof Object);
		
		System.out.println("Point p1: " + p1);
		System.out.println("Point p2: " + p2);
		System.out.println(p2.equals(p1));
		System.out.println(p2.equals(c2));
		
		System.out.println("Rectangle r2: " + r2);
		System.out.println("Rectangle r3: " + r3);
		System.out.println(r2.equals(r3));
		r3.setWidth(50);
		System.out.println("Rectangle r2: " + r2);
		System.out.println("Rectangle r3: " + r3);
		System.out.println(r2.equals(r3));
		
		System.out.println("\nVezbe 5\n");
		Point p3 = new Point(40,40);
		Rectangle r4 = new Rectangle(new Point(30,30),40,20);
		
		System.out.println(r4.contains(p3)); //true
		System.out.println(r4.contains(50,20));  //false
		System.out.println(r4.contains(10,40));   //false
		
		Donut d1 = new Donut(p3,50,20);
		System.out.println(d1.contains(p3));
		System.out.println(d1.contains(40,65));
		System.out.println(d1.contains(40,15));
	}

}
